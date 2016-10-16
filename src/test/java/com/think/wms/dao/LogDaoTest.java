package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.mysql.jdbc.log.Log;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class LogDaoTest {

	@Autowired
	private LogDao logDao;

	@Test
	public void testInsertLog() {
		String logAction = "添加出库单";
		long userId = 1;
		int result = logDao.insertLog(logAction, userId);
		System.out.println(result);
	}

	@Test
	public void testDeleteLog() {
		int result = logDao.deleteLog(2);
		System.out.println(result);
	}

	@Test
	public void testQueryByUserId() {
		long userId = 1;
		List<Log> logs = logDao.queryByUserId(userId);
		System.out.println(logs);
	}

	@Test
	public void testQueryAll() {
		List<Log> logs = logDao.queryAll();
		System.out.println(logs);
	}

}
