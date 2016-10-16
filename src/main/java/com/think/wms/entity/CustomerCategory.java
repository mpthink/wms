package com.think.wms.entity;

/**
 * 客户分类
 * @author mpthink
 *
 */
public class CustomerCategory {
	private int customerCategoryId;
	private String customerCategoryName;

	public int getCustomerCategoryId() {
		return customerCategoryId;
	}

	public void setCustomerCategoryId(int customerCategoryId) {
		this.customerCategoryId = customerCategoryId;
	}

	public String getCustomerCategoryName() {
		return customerCategoryName;
	}

	public void setCustomerCategoryName(String customerCategoryName) {
		this.customerCategoryName = customerCategoryName;
	}

	@Override
	public String toString() {
		return "CustomerCategory [customerCategoryId=" + customerCategoryId + ", customerCategoryName=" + customerCategoryName + "]";
	}
}
