package com.think.wms.dao;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Customer;
import com.think.wms.entity.InstoreMain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class InstoreMainDaoTest {

	@Autowired
	private InstoreMainDao instoreMainDao;

	@Test
	public void testInsertInstoreMain() {
		InstoreMain instoreMain = new InstoreMain();
		Customer customer = new Customer();
		customer.setCustomerId(1);
		instoreMain.setCustomer(customer);
		Date date = new Date();
		instoreMain.setIsmSn("in-2016");
		instoreMain.setIsmTicketNo("car-20161018");
		instoreMain.setIsmTicketTime(date);
		instoreMain.setIsmCarNo("AM5Y36");
		instoreMain.setIsmCarrier("搬运工");
		instoreMain.setIsmCreator("创建人");
		instoreMain.setIsmCreateDate(date);
		instoreMain.setIsmChargebacker("退单人");
		instoreMain.setIsmChargebackDate(date);
		instoreMain.setIsmConfirmor("审核人");
		instoreMain.setIsmConfirmDate(date);
		instoreMain.setIsmReviewer("复核人");
		instoreMain.setIsmReviewDate(date);
		int result = instoreMainDao.insertInstoreMain(instoreMain);
		System.out.println(result);
	}

	@Test
	public void testDeleteInstoreMain() {
		int result = instoreMainDao.deleteInstoreMain(3);
		System.out.println(result);
	}

	@Test
	public void testUpdateInstoreMain() {
		InstoreMain instoreMain = new InstoreMain();
		Customer customer = new Customer();
		instoreMain.setCustomer(customer);
		instoreMain.setIsmStatus(1);
		instoreMain.setIsmId(3);
		int result = instoreMainDao.updateInstoreMain(instoreMain);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		InstoreMain instoreMain = instoreMainDao.queryById(3);
		System.out.println(instoreMain);
	}

	@Test
	public void testQueryWithInstoreSubsById() {
		InstoreMain instoreMain = instoreMainDao.queryWithInstoreSubsById(1);
		System.out.println(instoreMain);
	}

	@Test
	public void testQueryByFileds() {
		Map<String, Object> queryMap = new HashMap<>();
		queryMap.put("ismTicketNo", "1234");
		queryMap.put("ismreviewer", "人");
		List<InstoreMain> instoreMains = instoreMainDao.queryByFileds(queryMap);
		System.out.println(instoreMains);
	}

	@Test
	public void testQueryAll() {
		List<InstoreMain> instoreMains = instoreMainDao.queryAll();
		System.out.println(instoreMains);
	}

}
