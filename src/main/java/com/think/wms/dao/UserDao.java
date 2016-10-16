package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.entity.User;

public interface UserDao {

	int insertUser(User user);

	int deleteUser(long userId);

	int updateUser(User user);

	User queryByUserId(long userId);

	User queryByName(String userName);

	User queryByNamePassword(@Param("userName") String userName, @Param("userPassword") String userPassword);

	List<User> queryAll();
}
