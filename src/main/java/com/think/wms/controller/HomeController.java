package com.think.wms.controller;

import java.util.List;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.think.wms.model.Permission;
import com.think.wms.model.User;
import com.think.wms.service.PermissonService;

@Controller
public class HomeController {

	private static final Logger LOGGER = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	PermissonService permissonService;

	@RequiresAuthentication
	@RequestMapping(value = "/index")
	public String homeView(Model model) {
		User user = (User) SecurityUtils.getSubject().getPrincipal();
		List<Permission> permissions = permissonService.findByUserId(user.getId());
		model.addAttribute("permissions", permissions);
		return "index";
	}

}
