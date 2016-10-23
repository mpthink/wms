package com.think.wms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.wms.dao.UserDao;
import com.think.wms.entity.User;
import com.think.wms.exception.WMSException;
import com.think.wms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public void createUser(User user) {
		if (userDao.queryByName(user.getUserName()) != null) {
			throw new WMSException("用户名已存在!");
		}
		int result = userDao.insertUser(user);
		if (result != 1) {
			throw new WMSException("添加用户失败!");
		}
	}

	@Override
	public void deleteUser(int userId) {
		userDao.deleteUser(userId);
	}

	@Override
	public void updateUser(User user) {
		userDao.updateUser(user);
	}

	@Override
	public User getUserById(int userId) {
		return userDao.queryByUserId(userId);
	}

	@Override
	public User login(String userName, String userPassword) {
		User user = userDao.queryByNamePassword(userName, userPassword);
		if (user == null) {
			throw new WMSException("用户名或密码错误!");
		}
		return user;
	}

	@Override
	public List<User> getUserList() {
		return userDao.queryAll();
	}

}
