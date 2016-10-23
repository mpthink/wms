package com.think.wms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.wms.dao.RoleDao;
import com.think.wms.entity.Role;
import com.think.wms.exception.WMSException;
import com.think.wms.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Override
	public void createRole(String roleName, String rolePermission) {
		roleDao.insertRole(roleName, rolePermission);
	}

	@Override
	public void deleteRole(int roleId) {
		roleDao.deleteRole(roleId);
	}

	@Override
	public void update(int roleId, String roleName, String rolePermission) {
		roleDao.updateRole(roleId, roleName, rolePermission);
	}

	@Override
	public Role getRoleById(int roleId) {
		Role role = roleDao.queryByRoleId(roleId);
		if (role == null) {
			throw new WMSException("the role is not exist");
		}
		return role;
	}

	@Override
	public List<Role> getRoleList() {
		return roleDao.queryAll();
	}

}
