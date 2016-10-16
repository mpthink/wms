package com.think.wms.entity;

import java.util.Date;

/**
 * log操作记录
 * @author mpthink
 *
 */
public class Log {
	private int logId;
	private String logAction;
	private Date logCreateTime;
	private User user;

	public int getLogId() {
		return logId;
	}

	public void setLogId(int logId) {
		this.logId = logId;
	}

	public String getLogAction() {
		return logAction;
	}

	public void setLogAction(String logAction) {
		this.logAction = logAction;
	}

	public Date getLogCreateTime() {
		return logCreateTime;
	}

	public void setLogCreateTime(Date logCreateTime) {
		this.logCreateTime = logCreateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Log [logId=" + logId + ", logAction=" + logAction + ", logCreateTime=" + logCreateTime + ", user=" + user + "]";
	}

}
