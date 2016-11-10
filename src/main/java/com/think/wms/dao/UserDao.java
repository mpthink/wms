package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.model.User;

public interface UserDao {

	int addUser(User user);

	int deleteUserById(int id);

	int updateUser(User user);

	User findById(int id);

	User findByUsername(String username);

	User findByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

	List<User> findAll();
}
