package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Notice;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class NoticeDaoTest {

	@Autowired
	private NoticeDao noticeDao;

	@Test
	public void testInsertNotice() {
		String noticeTitle = "通知标题2";
		String noticeContent = "通知内容2";
		long userId = 1;
		int result = noticeDao.insertNotice(noticeTitle, noticeContent, userId);
		System.out.println(result);
	}

	@Test
	public void testDeleteNotice() {
		int result = noticeDao.deleteNotice(2);
		System.out.println(result);
	}

	@Test
	public void testUpdateNotice() {
		int noticeId = 2;
		String noticeTitle = "修改标题";
		String noticeContent = "修改内容";
		long userId = 1;
		int result = noticeDao.updateNotice(noticeId, noticeTitle, noticeContent, userId);
		System.out.println(result);
	}

	@Test
	public void testQueryByUserId() {
		List<Notice> notices = noticeDao.queryByUserId(1);
		System.out.println(notices);
	}

	@Test
	public void testQueryAll() {
		List<Notice> notices = noticeDao.queryAll();
		System.out.println(notices);
	}

}
