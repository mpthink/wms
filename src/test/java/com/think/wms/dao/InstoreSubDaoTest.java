package com.think.wms.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.InstoreSub;
import com.think.wms.entity.Product;
import com.think.wms.entity.Store;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class InstoreSubDaoTest {

	@Autowired
	private InstoreSubDao instoreSubDao;

	@Test
	public void testInsertInstoreSub() {
		InstoreSub instoreSub = new InstoreSub();
		instoreSub.setIsmId(1);
		instoreSub.setIssParentId(0);
		instoreSub.setIssPlanQuantity(100);
		instoreSub.setIssRealQuantity(100);
		Product product = new Product();
		product.setProductId(1);
		instoreSub.setProduct(product);
		instoreSub.setProductQuality(1);
		Store store = new Store();
		store.setStoreId(1);
		instoreSub.setStore(store);
		int result = instoreSubDao.insertInstoreSub(instoreSub);
		System.out.println(result);
	}

	@Test
	public void testInsertInstoreSubList() {
		List<InstoreSub> instoreSubs = new ArrayList<>();
		InstoreSub instoreSub = new InstoreSub();
		instoreSub.setIsmId(1);
		instoreSub.setIssParentId(0);
		instoreSub.setIssPlanQuantity(100);
		instoreSub.setIssRealQuantity(100);
		Product product = new Product();
		product.setProductId(1);
		instoreSub.setProduct(product);
		instoreSub.setProductQuality(1);
		Store store = new Store();
		store.setStoreId(1);
		instoreSub.setStore(store);
		InstoreSub instoreSub1 = new InstoreSub();
		instoreSub1.setIsmId(1);
		instoreSub1.setIssParentId(0);
		instoreSub1.setIssPlanQuantity(100);
		instoreSub1.setIssRealQuantity(100);
		Product product1 = new Product();
		product1.setProductId(1);
		instoreSub1.setProduct(product1);
		instoreSub1.setProductQuality(1);
		Store store1 = new Store();
		store1.setStoreId(1);
		instoreSub1.setStore(store1);
		instoreSubs.add(instoreSub);
		instoreSubs.add(instoreSub1);
		int result = instoreSubDao.insertInstoreSubList(instoreSubs);
		System.out.println(result);
	}

	@Test
	public void testDeleteInstoreSubByIssId() {
		int result = instoreSubDao.deleteInstoreSubByIssId(9);
		System.out.println(result);
	}

	@Test
	public void testDeleteInstoreSubByIsmId() {
		int result = instoreSubDao.deleteInstoreSubByIsmId(2);
		System.out.println(result);
	}

	@Test
	public void testDeleteInstoreSubByIssParentId() {
		int result = instoreSubDao.deleteInstoreSubByIssParentId(1);
		System.out.println(result);
	}

	@Test
	public void testUpdateInstoreSub() {
		InstoreSub instoreSub = new InstoreSub();
		Product product = new Product();
		Store store = new Store();
		instoreSub.setIsmId(2);
		instoreSub.setIssParentId(0);
		instoreSub.setIssPlanQuantity(200);
		instoreSub.setIssRealQuantity(200);
		instoreSub.setIssId(8);
		instoreSub.setProduct(product);
		instoreSub.setStore(store);
		int result = instoreSubDao.updateInstoreSub(instoreSub);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		InstoreSub instoreSub = instoreSubDao.queryById(1);
		System.out.println(instoreSub);
	}

	@Test
	public void testQueryByFileds() {
		Map<String, Object> map = new HashMap<>();
		map.put("productName", "热水");
		List<InstoreSub> instoreSubs = instoreSubDao.queryByFileds(map);
		System.out.println(instoreSubs);
	}

	@Test
	public void testQueryAll() {
		List<InstoreSub> instoreSubs = instoreSubDao.queryAll();
		System.out.println(instoreSubs);
	}

}
