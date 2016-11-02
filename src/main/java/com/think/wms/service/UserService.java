package com.think.wms.service;

import java.util.List;

import com.think.wms.entity.User;

public interface UserService {

	void createUser(User user);

	void deleteUser(int id);

	void updateUser(User user);

	User getUserById(int id);

	User login(String name, String password);

	List<User> getUserList();

}
