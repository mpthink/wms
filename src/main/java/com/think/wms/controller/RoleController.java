package com.think.wms.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.think.wms.entity.Role;
import com.think.wms.service.RoleService;

@Controller
@RequestMapping("/role")
public class RoleController {

	private final Logger logger = LoggerFactory.getLogger(RoleController.class);

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<Role> roles = roleService.getRoleList();
		model.addAttribute("roles", roles);
		logger.debug(roles.toString());
		return "role/list";
	}

}