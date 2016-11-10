package com.think.wms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.wms.dao.UserDao;
import com.think.wms.exception.WMSException;
import com.think.wms.model.User;
import com.think.wms.service.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;

	@Override
	public int addUser(User user) {
		return userDao.addUser(user);
	}

	@Override
	public int deleteUserById(int userId) {
		return userDao.deleteUserById(userId);
	}

	@Override
	public int updateUser(User user) {
		return userDao.updateUser(user);
	}

	@Override
	public User findById(int userId) {
		return userDao.findById(userId);
	}

	@Override
	public User login(String userName, String userPassword) {
		User user = userDao.findByUsernameAndPassword(userName, userPassword);
		if (user == null) {
			throw new WMSException("用户名或密码错误!");
		}
		return user;
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

	@Override
	public User findByUserName(String username) {
		return userDao.findByUsername(username);
	}

}
