package com.think.wms.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.think.wms.service.UserService;

@Controller
public class LoginController {

	private final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginView(Model model) {
		return "login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(String username, String password,
		@RequestParam(value = "rememberMe", required = false) Integer rememberMe, ModelMap model) {
		UsernamePasswordToken token = new UsernamePasswordToken(username, password);
		if (null != rememberMe && rememberMe == 1) {
			token.setRememberMe(true);
		}
		try {
			SecurityUtils.getSubject().login(token);
		} catch (AuthenticationException e) {
			model.put("message", "用户名或者密码错误！");
		} catch (Exception e) {
			logger.debug(e.getMessage());
		}
		return "redirect:index";
	}

}
