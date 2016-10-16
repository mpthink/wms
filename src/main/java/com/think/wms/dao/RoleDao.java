package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.entity.Role;

public interface RoleDao {

	int insertRole(@Param("roleName") String roleName, @Param("rolePermission") String rolePermission);

	int updateRole(@Param("roleId") int roleId, @Param("roleName") String roleName, @Param("rolePermission") String rolePermission);

	int deleteRole(int roleId);

	Role queryByRoleId(int roleId);

	List<Role> queryAll();

}
