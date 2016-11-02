package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.entity.User;

public interface UserDao {

	int insertUser(User user);

	int deleteUser(int id);

	int updateUser(User user);

	User queryByUserId(int id);

	User queryByName(String name);

	User queryByNamePassword(@Param("name") String name, @Param("password") String password);

	List<User> queryAll();
}
