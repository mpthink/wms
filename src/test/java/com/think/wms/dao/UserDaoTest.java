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
		user.setName(userName);
		user.setRealName(userRealname);
		user.setPassword(userPassword);
		user.setEmail(userEmail);
		user.setPhone(userPhone);
		user.setLastLoginTime(userLastLogintime);
		user.setLastLoginIp(userLastLoginip);
		user.setStatus(userStatus);
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
		User user = new User();
		user.setId(4);
		user.setRealName("我是天才");
		System.out.println(userDao.updateUser(user));
	}

	@Test
	public void testQueryByUserId() {
		System.out.println(userDao.queryByUserId(1));
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
