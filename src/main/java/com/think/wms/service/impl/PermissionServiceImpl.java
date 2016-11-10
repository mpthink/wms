package com.think.wms.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.think.wms.dao.PermissionDao;
import com.think.wms.model.Permission;
import com.think.wms.service.PermissonService;

@Service
public class PermissionServiceImpl implements PermissonService {

	@Autowired
	private PermissionDao permisionDao;

	@Override
	public int addPermission(Permission permission) {
		return permisionDao.addPermission(permission);
	}

	@Override
	public int deletePermissionById(int id) {
		return permisionDao.deletePermissionById(id);
	}

	@Override
	public int updatePermission(Permission permission) {
		return permisionDao.updatePermission(permission);
	}

	@Override
	public Permission findById(int id) {
		return permisionDao.findById(id);
	}

	@Override
	public List<Permission> findAll() {
		return permisionDao.findAll();
	}

	@Override
	public List<Permission> findByRoleId(int roleId) {
		return permisionDao.findByRoleId(roleId);
	}

	@Override
	public List<Permission> findByUserId(int userId) {
		return permisionDao.findByUserId(userId);
	}

}
