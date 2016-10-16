package com.think.wms.entity;

/**
 * 产品分类
 * @author mpthink
 *
 */
public class ProductCategory {
	private int productCategoryId;
	private int productCategoryParrentid;
	private String productCategoryName;

	public int getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(int productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public int getProductCategoryParrentid() {
		return productCategoryParrentid;
	}

	public void setProductCategoryParrentid(int productCategoryParrentid) {
		this.productCategoryParrentid = productCategoryParrentid;
	}

	public String getProductCategoryName() {
		return productCategoryName;
	}

	public void setProductCategoryName(String productCategoryName) {
		this.productCategoryName = productCategoryName;
	}

	@Override
	public String toString() {
		return "ProductCategory [productCategoryId=" + productCategoryId + ", productCategoryParrentid=" + productCategoryParrentid
			+ ", productCategoryName=" + productCategoryName + "]";
	}

}
