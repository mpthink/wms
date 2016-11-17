package com.think.wms.controller;

import java.util.List;

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
import com.think.wms.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(RoleController.class);

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Role> roles = roleService.findAll();
		model.addAttribute("roles", roles);
		LOGGER.debug(roles.toString());
		return "role/list";
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
