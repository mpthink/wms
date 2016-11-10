package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface RolePermissionDao {
	int addRolePermission(@Param("roleId") int roleId, @Param("permissionId") int permissionId);

	int deleteByRoleId(int roleId);

	int deleteByPermissionId(int permissionId);

	List<Integer> findPermissionIdsByRoleId(int roleId);

	List<Integer> findRoleIdsByPermissionId(int permissionId);

}
