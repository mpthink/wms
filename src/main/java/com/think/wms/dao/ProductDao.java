package com.think.wms.dao;

import java.util.List;

import com.think.wms.entity.Product;

public interface ProductDao {

	int insertProduct(Product product);

	int deleteProduct(int productId);

	int updateProduct(Product product);

	Product queryByProductId(int productId);

	List<Product> queryByCustomerId(int customerId);

	List<Product> queryByProductCategoryId(int productCategoryId);

	List<Product> queryAll();

}
