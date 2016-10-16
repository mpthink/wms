package com.think.wms.entity;

/**
 * 用户角色
 * @author mpthink
 *
 */
public class Role {
	private int roleId;
	private String roleName;
	private String rolePermission;

	public int getRoleId() {
		return roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRolePermission() {
		return rolePermission;
	}

	public void setRolePermission(String rolePermission) {
		this.rolePermission = rolePermission;
	}

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", rolePermission=" + rolePermission + "]";
	}

}
