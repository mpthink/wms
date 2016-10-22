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

import com.think.wms.entity.OutstoreSub;
import com.think.wms.entity.Product;
import com.think.wms.entity.Store;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class OutstoreSubDaoTest {

	@Autowired
	private OutstoreSubDao outstoreSubDao;

	@Test
	public void testInsertOutstoreSub() {
		OutstoreSub outstoreSub = new OutstoreSub();
		outstoreSub.setOsmId(1);
		outstoreSub.setOssPlanQuantity(100);
		outstoreSub.setOssRealQuantity(100);
		Product product = new Product();
		product.setProductId(1);
		outstoreSub.setProduct(product);
		outstoreSub.setProductQuality(1);
		Store store = new Store();
		store.setStoreId(1);
		outstoreSub.setStore(store);
		int result = outstoreSubDao.insertOutstoreSub(outstoreSub);
		System.out.println(result);
	}

	@Test
	public void testInsertOutstoreSubList() {
		List<OutstoreSub> outstoreSubs = new ArrayList<>();
		OutstoreSub outstoreSub = new OutstoreSub();
		outstoreSub.setOsmId(3);
		outstoreSub.setOssPlanQuantity(100);
		outstoreSub.setOssRealQuantity(100);
		Product product = new Product();
		product.setProductId(1);
		outstoreSub.setProduct(product);
		outstoreSub.setProductQuality(1);
		Store store = new Store();
		store.setStoreId(1);
		outstoreSub.setStore(store);
		OutstoreSub outstoreSub1 = new OutstoreSub();
		outstoreSub1.setOsmId(3);
		outstoreSub1.setOssPlanQuantity(100);
		outstoreSub1.setOssRealQuantity(100);
		Product product1 = new Product();
		product1.setProductId(1);
		outstoreSub1.setProduct(product1);
		outstoreSub1.setProductQuality(1);
		Store store1 = new Store();
		store1.setStoreId(1);
		outstoreSub1.setStore(store1);
		outstoreSubs.add(outstoreSub);
		outstoreSubs.add(outstoreSub1);
		int result = outstoreSubDao.insertOutstoreSubList(outstoreSubs);
		System.out.println(result);
	}

	@Test
	public void testDeleteOutstoreSubByOssId() {
		int result = outstoreSubDao.deleteOutstoreSubByOssId(6);
		System.out.println(result);
	}

	@Test
	public void testDeleteOutstoreSubByOsmId() {
		int result = outstoreSubDao.deleteOutstoreSubByOsmId(3);
		System.out.println(result);
	}

	@Test
	public void testUpdateOutstoreSub() {
		OutstoreSub outstoreSub = new OutstoreSub();
		Product product = new Product();
		Store store = new Store();
		outstoreSub.setOsmId(2);
		outstoreSub.setOssPlanQuantity(200);
		outstoreSub.setOssRealQuantity(200);
		outstoreSub.setOssId(7);
		outstoreSub.setProduct(product);
		outstoreSub.setStore(store);
		int result = outstoreSubDao.updateOutstoreSub(outstoreSub);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		OutstoreSub outstoreSub = outstoreSubDao.queryById(1);
		System.out.println(outstoreSub);
	}

	@Test
	public void testQueryByFileds() {
		Map<String, Object> map = new HashMap<>();
		map.put("productName", "热水");
		List<OutstoreSub> outstoreSubs = outstoreSubDao.queryByFileds(map);
		System.out.println(outstoreSubs);
	}

	@Test
	public void testQueryAll() {
		List<OutstoreSub> outstoreSubs = outstoreSubDao.queryAll();
		System.out.println(outstoreSubs);
	}

}
