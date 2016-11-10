package com.think.wms.shiro.realm;

import java.util.ArrayList;
import java.util.List;

import org.apache.shiro.authc.AccountException;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.springframework.beans.factory.annotation.Autowired;

import com.think.wms.model.Permission;
import com.think.wms.model.Role;
import com.think.wms.model.User;
import com.think.wms.service.PermissonService;
import com.think.wms.service.RoleService;
import com.think.wms.service.UserService;

public class WMSRealm extends AuthorizingRealm {

	@Autowired
	private UserService userService;

	@Autowired
	private RoleService roleService;

	@Autowired
	private PermissonService permissionService;

	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

		User user = (User) principals.getPrimaryPrincipal();
		String username = user.getUsername();
		List<String> roleList = new ArrayList<String>();
		List<String> permissionList = new ArrayList<String>();

		User userCheck = userService.findByUserName(username);
		if (null != userCheck) {
			List<Role> roles = roleService.findByUserId(userCheck.getId());
			if (null != roles && roles.size() > 0) {
				for (Role role : roles) {
					roleList.add(role.getName());
					List<Permission> permissions = permissionService.findByRoleId(role.getId());
					if (null != permissions && permissions.size() > 0) {
						for (Permission permission : permissions) {
							if (permission.getPermissionCode().length() > 0) {
								permissionList.add(permission.getPermissionCode());
							}
						}
					}
				}
			}

		}
		SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
		info.addRoles(roleList);
		info.addStringPermissions(permissionList);
		return info;
	}

	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authcToken) throws AuthenticationException {
		UsernamePasswordToken token = (UsernamePasswordToken) authcToken;
		String username = token.getUsername();
		String password = String.valueOf(token.getPassword());
		User user = userService.login(username, password);
		if (null == user) {
			throw new AccountException("帐号或密码不正确！");
		}
		SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user, password, this.getName());
		return info;
	}

}
