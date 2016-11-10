package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.model.Role;
import com.think.wms.model.User;

public interface UserRoleDao {

	int addUserRole(@Param("userId") int userId, @Param("roleId") int roleId);

	int deleteByUserId(int userId);

	int deletByRoleId(int roleId);

	List<User> findUsersByRoleId(int roleId);

	List<Role> findRolesByUserId(int userId);

}
