package com.think.wms.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class UserServiceTest {

	@Autowired
	private UserService userService;

	@Test
	public void testCreateUser() {
		User user = new User();
		String userName = "mpthink1";
		String userRealname = "马坡1";
		String userPassword = "123";
		String userEmail = "mpthink1@163.com";
		user.setUsername(userName);
		user.setNickname(userRealname);
		user.setPassword(userPassword);
		user.setEmail(userEmail);
		userService.addUser(user);
	}


}
