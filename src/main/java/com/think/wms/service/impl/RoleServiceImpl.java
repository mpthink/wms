package com.think.wms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.wms.dao.RoleDao;
import com.think.wms.dao.UserRoleDao;
import com.think.wms.exception.WMSException;
import com.think.wms.model.Role;
import com.think.wms.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService {

	@Autowired
	private RoleDao roleDao;

	@Autowired
	private UserRoleDao userRoleDao;


	@Override
	public int addRole(String name, String roleCode, String description) {
		return roleDao.addRole(name, roleCode, description);
	}

	@Override
	public int deleteRoleById(int id) {
		return roleDao.deleteRoleById(id);
	}

	@Override
	public int update(int id, String name, String roleCode, String description) {
		return roleDao.updateRole(id, name, roleCode, description);
	}


	@Override
	public Role findById(int id) {
		Role role = roleDao.findById(id);
		if (role == null) {
			throw new WMSException("the role is not exist");
		}
		return role;
	}

	@Override
	public List<Role> findAll() {
		return roleDao.findAll();
	}

	@Override
	public List<Role> findByUserId(int userId) {
		return userRoleDao.findRolesByUserId(userId);
	}

}
