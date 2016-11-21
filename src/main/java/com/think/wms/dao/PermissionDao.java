package com.think.wms.dao;

import java.util.List;
import java.util.Map;

import com.think.wms.model.Permission;

public interface PermissionDao {
	int addPermission(Permission permission);

	int deletePermissionById(int id);

	int updatePermission(Permission permission);

	Permission findById(int id);

	List<Permission> findAll();

	List<Permission> findByRoleId(int roleId);

	List<Permission> findByUserId(int userId);

	List<Permission> findByPid(int pid);

	List<Map<String, Object>> findMapResultsByPid(int pid);
}
