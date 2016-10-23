package com.think.wms.dao;

import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {

	@Autowired
	private UserDao userDao;

	@Test
	public void testInsertUser() {
		String userName = "mpthink1";
		String userRealname = "马坡1";
		String userPassword = "123";
		String userEmail = "mpthink1@163.com";
		String userPhone = "13551172866";
		Date userLastLogintime = new Date();
		String userLastLoginip = "10.11.22.33";
		int userStatus = 1;
		User user = new User();
		user.setUserName(userName);
		user.setUserRealname(userRealname);
		user.setUserPassword(userPassword);
		user.setUserEmail(userEmail);
		user.setUserPhone(userPhone);
		user.setUserLastLogintime(userLastLogintime);
		user.setUserLastLoginip(userLastLoginip);
		user.setUserStatus(userStatus);
		user.setRoleId(1);
		int result = userDao.insertUser(user);
		System.out.println(result);
	}

	@Test
	public void testDeleteUser() {
		int result = userDao.deleteUser(2);
		System.out.println(result);
	}

	@Test
	public void testUpdateUser() {
		long userId = 1;
		String userName = "mpthink";
		String userRealname = "马坡";
		String userPassword = "1234";
		String userEmail = "mpthink2@163.com";
		String userPhone = "13551172866";
		Date userLastLogintime = new Date();
		String userLastLoginip = "10.11.22.33";
		int userStatus = 2;
		User user = new User();
		user.setUserId(userId);
		user.setUserName(userName);
		user.setUserRealname(userRealname);
		user.setUserPassword(userPassword);
		user.setUserEmail(userEmail);
		user.setUserPhone(userPhone);
		user.setUserLastLogintime(userLastLogintime);
		user.setUserLastLoginip(userLastLoginip);
		user.setUserStatus(userStatus);
		user.setRoleId(2);
		int result = userDao.updateUser(user);
		System.out.println(result);
	}

	@Test
	public void testQueryByUserId() {
		long userId = 2;
		User user = userDao.queryByUserId(userId);
		System.out.println(user);
	}

	@Test
	public void testQueryByName() {
		String userName = "mpthink";
		User user = userDao.queryByName(userName);
		System.out.println(user);
	}

	@Test
	public void testQueryByNamePassword() {
		String userName = "mpthink";
		String userPassword = "1234";
		User user = userDao.queryByNamePassword(userName, userPassword);
		System.out.println(user);
	}

	@Test
	public void testQueryAll() {
		List<User> users = userDao.queryAll();
		System.out.println(users);
	}

}
