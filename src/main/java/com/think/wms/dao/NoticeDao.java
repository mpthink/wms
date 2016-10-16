package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.entity.Notice;

public interface NoticeDao {

	int insertNotice(@Param("noticeTitle") String noticeTitle, @Param("noticeContent") String noticeContent, @Param("userId") long userId);

	int deleteNotice(int noticeId);

	int updateNotice(@Param("noticeId") int noticeId, @Param("noticeTitle") String noticeTitle, @Param("noticeContent") String noticeContent,
		@Param("userId") long userId);

	List<Notice> queryByUserId(long userId);

	List<Notice> queryAll();

}
