package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.entity.CustomerCategory;

/**
 * customer category
 * @author mpthink
 *
 */
public interface CustomerCategoryDao {

	int insertCustomerCategory(String customerCategoryName);

	int deleteCustomerCategory(int customerCategoryId);

	int updateCustomerCategory(@Param("customerCategoryId") int customerCategoryId, @Param("customerCategoryName") String customerCategoryName);

	CustomerCategory queryById(int customerCategoryId);

	List<CustomerCategory> queryAll();
}
