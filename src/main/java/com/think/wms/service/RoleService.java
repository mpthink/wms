package com.think.wms.service;

import java.util.List;

import com.think.wms.model.Role;

public interface RoleService {

	int addRole(String name, String roleCode, String description);

	int deleteRoleById(int id);

	int deletePermissionsByRoleId(int roleId);

	int addRolePermission(int roleId, int permissionId);

	int update(int id, String name, String roleCode, String description);

	Role findById(int id);

	Role findByName(String name);

	List<Role> findAll();

	List<Role> findByUserId(int userId);

}
