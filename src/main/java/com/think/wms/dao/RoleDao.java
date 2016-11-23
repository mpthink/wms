package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.model.Role;

public interface RoleDao {

	int addRole(@Param("name") String name, @Param("roleCode") String roleCode, @Param("description") String description);

	int deleteRoleById(int id);

	int updateRole(@Param("id") int id, @Param("name") String name, @Param("roleCode") String roleCode, @Param("description") String description);

	Role findById(int id);

	List<Role> findAll();

	Role findByName(String name);

}
