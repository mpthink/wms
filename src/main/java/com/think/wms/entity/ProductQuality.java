package com.think.wms.entity;

/**
 * 产品质量
 * @author mpthink
 *
 */
public class ProductQuality {
	private int productQualityId;
	private String productQualityName;
	private String productQualityDesc;

	public int getProductQualityId() {
		return productQualityId;
	}

	public void setProductQualityId(int productQualityId) {
		this.productQualityId = productQualityId;
	}

	public String getProductQualityName() {
		return productQualityName;
	}

	public void setProductQualityName(String productQualityName) {
		this.productQualityName = productQualityName;
	}

	public String getProductQualityDesc() {
		return productQualityDesc;
	}

	public void setProductQualityDesc(String productQualityDesc) {
		this.productQualityDesc = productQualityDesc;
	}

	@Override
	public String toString() {
		return "ProductQuality [productQualityId=" + productQualityId + ", productQualityName=" + productQualityName + ", productQualityDesc="
			+ productQualityDesc + "]";
	}

}
