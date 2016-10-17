package com.think.wms.dao;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.think.wms.entity.ProductCategory;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class ProductCategoryDaoTest {

	@Autowired
	private ProductCategoryDao productCategoryDao;

	@Test
	public void testInsertProductCategory() {
		int productCategoryParrentid = 0;
		String productCategoryName = "热水器2";
		int result = productCategoryDao.insertProductCategory(productCategoryParrentid, productCategoryName);
		System.out.println(result);
	}

	@Test
	public void testDeleteProductCategory() {
		int result = productCategoryDao.deleteProductCategory(2);
		System.out.println(result);
	}

	@Test
	public void testUpdateProductCategory() {
		int productCategoryId = 2;
		int productCategoryParrentid = 0;
		String productCategoryName = "冰箱2";
		int result = productCategoryDao.updateProductCategory(productCategoryId, productCategoryParrentid, productCategoryName);
		System.out.println(result);
	}

	@Test
	public void testQueryById() {
		ProductCategory productCategory = productCategoryDao.queryById(1);
		System.out.println(productCategory);
	}

	@Test
	public void testQueryAll() {
		List<ProductCategory> productCategories = productCategoryDao.queryAll();
		System.out.println(productCategories);
	}

}
