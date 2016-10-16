package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class RoleDaoTest {

	@Autowired
	private RoleDao roleDao;

	@Test
	public void testInsertRole() {
		String roleName = "系统管理员";
		String rolePermission = "所有栏目";
		int result = roleDao.insertRole(roleName, rolePermission);
		System.out.println(result);
	}

	@Test
	public void testUpdateRole() {
		int roleId = 1;
		String roleName = "仓库管理员";
		int result = roleDao.updateRole(roleId, roleName, null);
		System.out.println(result);
	}

	@Test
	public void testDeleteRole() {
		int roleId = 1;
		int result = roleDao.deleteRole(roleId);
		System.out.println(result);
	}

	@Test
	public void testQueryByRoleId() {
		int roleId = 1;
		Role role = roleDao.queryByRoleId(roleId);
		System.out.println(role);
	}

	@Test
	public void testQueryAll() {
		List<Role> roles = roleDao.queryAll();
		System.out.println(roles);
	}

}
