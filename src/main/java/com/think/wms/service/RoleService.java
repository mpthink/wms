package com.think.wms.service;

import java.util.List;

import com.think.wms.entity.Role;

public interface RoleService {

	void createRole(String roleName, String rolePermission);

	void deleteRole(int roleId);

	void update(int roleId, String roleName, String rolePermission);

	Role getRoleById(int roleId);

	List<Role> getRoleList();

}
