package com.think.wms.service;

import java.util.List;

import com.think.wms.model.User;

public interface UserService {

	int addUser(User user);

	int deleteUserById(int id);

	int updateUser(User user);

	User findById(int id);

	User findByUserName(String username);

	User login(String username, String password);

	List<User> findAll();

}
