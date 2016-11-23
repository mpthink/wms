package com.think.wms.service;

import java.util.List;
import java.util.Map;

import com.think.wms.model.Permission;

public interface PermissonService {
	int addPermission(Permission permission);

	int deletePermissionById(int id);

	int updatePermission(Permission permission);

	Permission findById(int id);

	List<Permission> findAll();

	List<Permission> findByRoleId(int roleId);

	List<Integer> findPermissionIdsByRoleId(int roleId);

	List<Permission> findByUserId(int userId);

	List<Permission> findByPid(int pid);

	List<Map<String, Object>> findMapResultsByPid(int pid);

	List<Map<String, Object>> findMapResultsAll();

}
