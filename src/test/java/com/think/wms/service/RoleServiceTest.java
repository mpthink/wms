package com.think.wms.service;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Role;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml", "classpath:spring/spring-service.xml"})
public class RoleServiceTest {

	@Autowired
	private RoleService roleService;

	@Test
	public void testCreateRole() {
		roleService.createRole("role 测试", "123");
	}

	@Test
	public void testDeleteRole() {
		roleService.deleteRole(5);
	}

	@Test
	public void testUpdate() {
		roleService.update(6, "role 更新", "234");
	}

	@Test
	public void testGetRoleById() {
		Role role = roleService.getRoleById(2);
		System.out.println(role);
	}

	@Test
	public void testGetRoleList() {
		List<Role> roleList = roleService.getRoleList();
		System.out.println(roleList);
	}

}
