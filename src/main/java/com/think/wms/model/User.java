package com.think.wms.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户
 * @author mpthink
 *
 */
public class User implements Serializable {
	/**
	 *
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String username;
	private String nickname;
	private String password;
	private String email;
	private String phone;
	private Date createTime;
	private Date lastLoginTime;
	private String lastLoginIp;
	private int status;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getLastLoginTime() {
		return lastLoginTime;
	}

	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public String getLastLoginIp() {
		return lastLoginIp;
	}

	public void setLastLoginIp(String lastLoginIp) {
		this.lastLoginIp = lastLoginIp;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", nickname=" + nickname + ", password=" + password + ", email=" + email + ", phone="
			+ phone + ", createTime=" + createTime + ", lastLoginTime=" + lastLoginTime + ", lastLoginIp=" + lastLoginIp + ", status=" + status + "]";
	}


}
