package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.Customer;
import com.think.wms.entity.Product;
import com.think.wms.entity.ProductCategory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ProductDaoTest {

	@Autowired
	private ProductDao productDao;

	@Test
	public void testInsertProduct() {
		Product product = new Product();
		ProductCategory productCategory = new ProductCategory();
		Customer customer = new Customer();
		customer.setCustomerId(1);
		productCategory.setProductCategoryId(1);
		product.setProductName("快速机2");
		product.setProductCategory(productCategory);
		product.setCustomer(customer);
		product.setProductMarketPrice(1.00);
		product.setProductCostPrice(2.00);
		product.setProductVolume("3.4");
		product.setProductUnit("台");
		int result = productDao.insertProduct(product);
		System.out.println(result);
	}

	@Test
	public void testDeleteProduct() {
		int result = productDao.deleteProduct(3);
		System.out.println(result);
	}

	@Test
	public void testUpdateProduct() {
		Product product = new Product();
		ProductCategory productCategory = new ProductCategory();
		Customer customer = new Customer();
		customer.setCustomerId(2);
		product.setProductCategory(productCategory);
		product.setCustomer(customer);
		product.setProductId(4);
		product.setProductName("修改名称");
		int result = productDao.updateProduct(product);
		System.out.println(result);
	}

	@Test
	public void testQueryByProductId() {
		Product product = productDao.queryByProductId(1);
		System.out.println(product);
	}

	@Test
	public void testQueryByCustomerId() {
		List<Product> products = productDao.queryByCustomerId(1);
		System.out.println(products);
	}

	@Test
	public void testQueryByProductCategoryId() {
		List<Product> products = productDao.queryByProductCategoryId(1);
		System.out.println(products);
	}

	@Test
	public void testQueryAll() {
		List<Product> products = productDao.queryAll();
		System.out.println(products);
	}

}
