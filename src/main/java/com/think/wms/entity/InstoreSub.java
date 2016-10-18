package com.think.wms.entity;

import java.util.Date;

public class InstoreSub {
	private int issId;
	private int ismId;
	private int issPlanQuantity;
	private int issRealQuantity;
	private int productId;
	private int productQuality;
	private int storeId;
	private Date issInsertTime;
	private int issInsertOrder;

	public int getIssId() {
		return issId;
	}

	public void setIssId(int issId) {
		this.issId = issId;
	}

	public int getIsmId() {
		return ismId;
	}

	public void setIsmId(int ismId) {
		this.ismId = ismId;
	}

	public int getIssPlanQuantity() {
		return issPlanQuantity;
	}

	public void setIssPlanQuantity(int issPlanQuantity) {
		this.issPlanQuantity = issPlanQuantity;
	}

	public int getIssRealQuantity() {
		return issRealQuantity;
	}

	public void setIssRealQuantity(int issRealQuantity) {
		this.issRealQuantity = issRealQuantity;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public int getProductQuality() {
		return productQuality;
	}

	public void setProductQuality(int productQuality) {
		this.productQuality = productQuality;
	}

	public int getStoreId() {
		return storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public Date getIssInsertTime() {
		return issInsertTime;
	}

	public void setIssInsertTime(Date issInsertTime) {
		this.issInsertTime = issInsertTime;
	}

	public int getIssInsertOrder() {
		return issInsertOrder;
	}

	public void setIssInsertOrder(int issInsertOrder) {
		this.issInsertOrder = issInsertOrder;
	}

	@Override
	public String toString() {
		return "InstoreSub [issId=" + issId + ", ismId=" + ismId + ", issPlanQuantity=" + issPlanQuantity + ", issRealQuantity=" + issRealQuantity
			+ ", productId=" + productId + ", productQuality=" + productQuality + ", storeId=" + storeId + ", issInsertTime=" + issInsertTime
			+ ", issInsertOrder=" + issInsertOrder + "]";
	}



}
