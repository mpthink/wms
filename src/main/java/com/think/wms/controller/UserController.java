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

import com.think.wms.model.User;
import com.think.wms.service.RoleService;
import com.think.wms.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {

	private static final Logger LOGGER = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@RequestMapping(value = "/toAddUser", method = RequestMethod.GET)
	public String toAddUser(Model model) {
		return "user/user_add";
	}

	@ResponseBody
	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUser(User user) {
		int result = userService.addUser(user);
		if (result == 1) {
			return Boolean.TRUE.toString();
		} else {
			return Boolean.FALSE.toString();
		}
	}

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		List<User> users = userService.findAll();
		model.addAttribute("users", users);
		return "user/user_list";
	}

	@RequestMapping(value = "/toUpdateUser/{userId}", method = RequestMethod.GET)
	public String toUpdateUser(@PathVariable Integer userId, Model model) {
		User user = userService.findById(userId);
		model.addAttribute("user", user);
		return "user/user_update";
	}

	@ResponseBody
	@RequestMapping(value = "/updateUser", method = RequestMethod.POST)
	public String updateUser(User user) {
		int result = userService.updateUser(user);
		if (result == 1) {
			return Boolean.TRUE.toString();
		} else {
			return Boolean.FALSE.toString();
		}
	}

	@ResponseBody
	@RequestMapping("/delete/{userId}")
	public String deleteUser(@PathVariable Integer userId) {
		int result = userService.deleteUserById(userId);
		if (result == 1) {
			return Boolean.TRUE.toString();
		} else {
			return Boolean.FALSE.toString();
		}
	}
}
