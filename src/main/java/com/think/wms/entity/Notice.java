package com.think.wms.entity;

import java.util.Date;

/**
 * 通知
 * @author mpthink
 *
 */
public class Notice {
	private int noticeId;
	private String noticeTitle;
	private String noticeContent;
	private Date noticeCreateTime;
	private User user;

	public int getNoticeId() {
		return noticeId;
	}

	public void setNoticeId(int noticeId) {
		this.noticeId = noticeId;
	}

	public String getNoticeTitle() {
		return noticeTitle;
	}

	public void setNoticeTitle(String noticeTitle) {
		this.noticeTitle = noticeTitle;
	}

	public String getNoticeContent() {
		return noticeContent;
	}

	public void setNoticeContent(String noticeContent) {
		this.noticeContent = noticeContent;
	}

	public Date getNoticeCreateTime() {
		return noticeCreateTime;
	}

	public void setNoticeCreateTime(Date noticeCreateTime) {
		this.noticeCreateTime = noticeCreateTime;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Notice [noticeId=" + noticeId + ", noticeTitle=" + noticeTitle + ", noticeContent=" + noticeContent + ", noticeCreateTime="
			+ noticeCreateTime + ", user=" + user + "]";
	}



}
