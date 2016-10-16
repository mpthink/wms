package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Customer;
import com.think.wms.entity.CustomerCategory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class CustomerDaoTest {

	@Autowired
	private CustomerDao customerDao;

	@Test
	public void testInsertCustomer() {
		Customer customer = new Customer();
		CustomerCategory customerCategory = new CustomerCategory();
		customerCategory.setCustomerCategoryId(1);
		customer.setCustomerName("格力集团1");
		customer.setCustomerWayPay("现金1");
		customer.setCustomerWayOut("汽车拉货1");
		customer.setCustomerCompany("四川格力分公司1");
		customer.setCustomerAddress("双流航空港1");
		customer.setCustomerPhone("13438960661");
		customer.setCustomerCategory(customerCategory);
		int result = customerDao.insertCustomer(customer);
		System.out.println(result);
	}

	@Test
	public void testDeleteCustomer() {
		int result = customerDao.deleteCustomer(2);
		System.out.println(result);
	}

	@Test
	public void testUpdateCustomer() {
		Customer customer = new Customer();
		CustomerCategory customerCategory = new CustomerCategory();
		customer.setCustomerCategory(customerCategory);
		customer.setCustomerId(1);
		customer.setCustomerName("修改名称测试");
		int result = customerDao.updateCustomer(customer);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		Customer customer = customerDao.queryById(1);
		System.out.println(customer);
	}

	@Test
	public void testQueryByName() {
		Customer customer = customerDao.queryByName("修改名称测试");
		System.out.println(customer);
	}

	@Test
	public void testQueryAll() {
		List<Customer> customers = customerDao.queryAll();
		System.out.println(customers);
	}

}
