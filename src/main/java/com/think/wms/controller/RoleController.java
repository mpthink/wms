package com.think.wms.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.think.wms.model.Role;
import com.think.wms.service.PermissonService;
import com.think.wms.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissonService permissonService;



	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Role> roles = roleService.findAll();
		model.addAttribute("roles", roles);
		LOGGER.debug(roles.toString());
		return "role/role_list";
	}

	@RequestMapping(value = "/toUpdateRole/{roleId}", method = RequestMethod.GET)
	public String toUpdateRole(@PathVariable Integer roleId, Model model) {
		Role role = roleService.findById(roleId);
		List<Integer> rolePermissionIds = permissonService.findPermissionIdsByRoleId(roleId);
		List<Map<String, Object>> rootMenus = permissonService.findMapResultsByPid(0);

		for (Map<String, Object> rootMenu : rootMenus) {
			if (isPermitted(rootMenu, rolePermissionIds)) {
				rootMenu.put("rootMenu", true);
			}
			//子菜单
			List<Map<String, Object>> subMenus = permissonService.findMapResultsByPid(Integer.valueOf(rootMenu.get("id").toString()));
			for (Map<String, Object> subMenu : subMenus) {
				if (isPermitted(subMenu, rolePermissionIds)) {
					subMenu.put("subMenu", true);
				}
				//子菜单功能
				List<Map<String, Object>> funtionMenus = permissonService.findMapResultsByPid(Integer.valueOf(subMenu.get("id").toString()));

				for (Map<String, Object> functionMenu : funtionMenus) {
					if (isPermitted(functionMenu, rolePermissionIds)) {
						functionMenu.put("function", true);
					}
				}
				subMenu.put("funtionMenus", funtionMenus);
			}
			rootMenu.put("subMenus", subMenus);
		}
		model.addAttribute("rootMenus", rootMenus);
		model.addAttribute("role", role);
		return "role/role_update";
	}

	private boolean isPermitted(Map<String, Object> map, List<Integer> rolePermissionIds) {
		for (Integer permissionId : rolePermissionIds) {
			if (String.valueOf(permissionId).equals(map.get("id").toString())) {
				return true;
			}
		}
		return false;
	}

	@ResponseBody
	@RequestMapping(value = "/updateRole", method = RequestMethod.POST)
	public void updateRole(Role role, HttpServletRequest request) {
		roleService.update(role.getId(), role.getName(), role.getRoleCode(), role.getDescription());
		roleService.deletePermissionsByRoleId(role.getId());
		String[] check = request.getParameterValues("check");
		if (check != null && check.length > 0) {
			for (int i = 0; i < check.length; i++) {
				roleService.addRolePermission(role.getId(), Integer.valueOf(check[i]));
			}
		}
	}

	@ResponseBody
	@RequestMapping("/delete/{roleId}")
	public String deleteRole(@PathVariable Integer roleId) {
		int result = roleService.deleteRoleById(roleId);
		if (result == 1) {
			return Boolean.TRUE.toString();
		} else {
			return Boolean.FALSE.toString();
		}
	}
}
