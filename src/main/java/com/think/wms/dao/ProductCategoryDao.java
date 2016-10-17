package com.think.wms.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.think.wms.entity.ProductCategory;

public interface ProductCategoryDao {

	int insertProductCategory(@Param("productCategoryParrentid") int productCategoryParrentid,
		@Param("productCategoryName") String productCategoryName);

	int deleteProductCategory(int productCategoryId);

	int updateProductCategory(@Param("productCategoryId") int productCategoryId, @Param("productCategoryParrentid") int productCategoryParrentid,
		@Param("productCategoryName") String productCategoryName);

	ProductCategory queryById(int productCategoryId);

	List<ProductCategory> queryAll();
}
