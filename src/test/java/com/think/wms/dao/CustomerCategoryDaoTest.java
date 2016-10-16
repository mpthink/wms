package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.CustomerCategory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CustomerCategoryDaoTest {

	@Autowired
	private CustomerCategoryDao customerCategoryDao;

	@Test
	public void testInsertCustomerCategory() {
		String customerCategoryName = "酒水客户2";
		int result = customerCategoryDao.insertCustomerCategory(customerCategoryName);
		//assertTrue(result == 1);
		System.out.println(result);
	}

	@Test
	public void testDeleteCustomerCategory() {
		int result = customerCategoryDao.deleteCustomerCategory(3);
		System.out.println(result);
	}

	@Test
	public void testUpdateCustomerCategory() {
		int result = customerCategoryDao.updateCustomerCategory(3, "酒水");
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		CustomerCategory customerCategory = customerCategoryDao.queryById(2);
		System.out.println(customerCategory);
	}

	@Test
	public void testQueryAll() {
		List<CustomerCategory> customerCategories = customerCategoryDao.queryAll();
		System.out.println(customerCategories);
	}

}
