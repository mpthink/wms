package com.think.wms.service;

import java.util.List;

import com.think.wms.entity.User;

public interface UserService {

	void createUser(User user);

	void deleteUser(int userId);

	void updateUser(User user);

	User getUserById(int userId);

	User login(String userName, String userPassword);

	List<User> getUserList();

}
