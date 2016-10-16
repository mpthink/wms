package com.think.wms.dao;

import java.util.List;

import com.think.wms.entity.Customer;

public interface CustomerDao {
	int insertCustomer(Customer customer);

	int deleteCustomer(int customerId);

	int updateCustomer(Customer customer);

	Customer queryById(int customerId);

	Customer queryByName(String customerName);

	List<Customer> queryAll();
}
