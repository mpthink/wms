package com.think.wms.entity;

import java.util.Date;

/**
 * 用户
 * @author mpthink
 *
 */
public class User {
	private long userId;
	private String userName;
	private String userRealname;
	private String userPassword;
	private String userEmail;
	private String userPhone;
	private Date userCreateTime;
	private Date userLastLogintime;
	private String userLastLoginip;
	private int userStatus;
	private Role role;

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRealname() {
		return userRealname;
	}

	public void setUserRealname(String userRealname) {
		this.userRealname = userRealname;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPhone() {
		return userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public Date getUserCreateTime() {
		return userCreateTime;
	}

	public void setUserCreateTime(Date userCreateTime) {
		this.userCreateTime = userCreateTime;
	}

	public Date getUserLastLogintime() {
		return userLastLogintime;
	}

	public void setUserLastLogintime(Date userLastLogintime) {
		this.userLastLogintime = userLastLogintime;
	}

	public String getUserLastLoginip() {
		return userLastLoginip;
	}

	public void setUserLastLoginip(String userLastLoginip) {
		this.userLastLoginip = userLastLoginip;
	}

	public int getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(int userStatus) {
		this.userStatus = userStatus;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", userRealname=" + userRealname + ", userPassword=" + userPassword
			+ ", userEmail=" + userEmail + ", userPhone=" + userPhone + ", userCreateTime=" + userCreateTime + ", userLastLogintime="
			+ userLastLogintime + ", userLastLoginip=" + userLastLoginip + ", userStatus=" + userStatus + ", role=" + role + "]";
	}

}
