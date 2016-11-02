package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Store;
import com.think.wms.entity.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class StoreDaoTest {

	@Autowired
	private StoreDao storeDao;

	@Test
	public void testInsertStore() {
		Store store = new Store();
		User storeManager = new User();
		store.setStoreSubParrent(1);
		store.setStoreSubName("1号库B");
		store.setStoreTotalSpace("100立方");
		store.setStoreManager(storeManager);
		int result = storeDao.insertStore(store);
		System.out.println(result);
	}

	@Test
	public void testDeleteStore() {
		int result = storeDao.deleteStore(4);
		System.out.println(result);
	}

	@Test
	public void testUpdateStore() {
		Store store = new Store();
		User storeManager = new User();
		store.setStoreManager(storeManager);
		store.setStoreName("修改一号库");
		store.setStoreId(1);
		int result = storeDao.updateStore(store);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		Store store = storeDao.queryById(3);
		System.out.println(store);
	}

	@Test
	public void testQueryParentStores() {
		List<Store> stores = storeDao.queryParentStores();
		System.out.println(stores);
	}

	@Test
	public void testQueryByParentId() {
		List<Store> stores = storeDao.queryByParentId(1);
		System.out.println(stores);
	}

	@Test
	public void testQueryAll() {
		List<Store> stores = storeDao.queryAll();
		System.out.println(stores);
	}

}
