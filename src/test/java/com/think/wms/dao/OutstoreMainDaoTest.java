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
import com.think.wms.entity.OutstoreMain;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class OutstoreMainDaoTest {

	@Autowired
	private OutstoreMainDao outstoreMainDao;

	@Test
	public void testInsertOutstoreMain() {
		OutstoreMain outstoreMain = new OutstoreMain();
		Customer customer = new Customer();
		customer.setCustomerId(1);
		outstoreMain.setCustomer(customer);
		Date date = new Date();
		outstoreMain.setOsmSn("out-2016");
		outstoreMain.setOsmTicketNo("car-20161018");
		outstoreMain.setOsmTicketTime(date);
		outstoreMain.setOsmCarNo("AM5Y36");
		outstoreMain.setOsmCarrier("搬运工");
		outstoreMain.setOsmCreator("创建人");
		outstoreMain.setOsmCreateDate(date);
		outstoreMain.setOsmChargebacker("退单人");
		outstoreMain.setOsmChargebackDate(date);
		outstoreMain.setOsmConfirmor("审核人");
		outstoreMain.setOsmConfirmDate(date);
		outstoreMain.setOsmReviewer("复核人");
		outstoreMain.setOsmReviewDate(date);
		int result = outstoreMainDao.insertOutstoreMain(outstoreMain);
		System.out.println(result);
	}

	@Test
	public void testDeleteOutstoreMain() {
		int result = outstoreMainDao.deleteOutstoreMain(3);
		System.out.println(result);
	}

	@Test
	public void testUpdateOutstoreMain() {
		OutstoreMain outstoreMain = new OutstoreMain();
		Customer customer = new Customer();
		outstoreMain.setCustomer(customer);
		outstoreMain.setOsmStatus(1);
		outstoreMain.setOsmId(3);
		int result = outstoreMainDao.updateOutstoreMain(outstoreMain);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		OutstoreMain outstoreMain = outstoreMainDao.queryById(3);
		System.out.println(outstoreMain);
	}

	@Test
	public void testQueryWithOutstoreSubsById() {
		OutstoreMain outstoreMain = outstoreMainDao.queryWithOutstoreSubsById(1);
		System.out.println(outstoreMain);
	}

	@Test
	public void testQueryByFileds() {
		Map<String, Object> queryMap = new HashMap<>();
		queryMap.put("osmTicketNo", "123");
		queryMap.put("osmreviewer", "人");
		List<OutstoreMain> outstoreMains = outstoreMainDao.queryByFileds(queryMap);
		System.out.println(outstoreMains);
	}

	@Test
	public void testQueryAll() {
		List<OutstoreMain> outstoreMains = outstoreMainDao.queryAll();
		System.out.println(outstoreMains);
	}

}
