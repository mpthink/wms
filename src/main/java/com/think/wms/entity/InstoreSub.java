package com.think.wms.entity;

import java.util.Date;

public class InstoreSub {
	private int issId;
	private int ismId;
	private int issParentId;
	private int issPlanQuantity;
	private int issRealQuantity;
	private Product product;
	private int productQuality;
	private Store store;
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

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getProductQuality() {
		return productQuality;
	}

	public void setProductQuality(int productQuality) {
		this.productQuality = productQuality;
	}

	public Store getStore() {
		return store;
	}

	public void setStore(Store store) {
		this.store = store;
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

	public int getIssParentId() {
		return issParentId;
	}

	public void setIssParentId(int issParentId) {
		this.issParentId = issParentId;
	}

	@Override
	public String toString() {
		return "InstoreSub [issId=" + issId + ", ismId=" + ismId + ", issParentId=" + issParentId + ", issPlanQuantity=" + issPlanQuantity
			+ ", issRealQuantity=" + issRealQuantity + ", product=" + product + ", productQuality=" + productQuality + ", store=" + store
			+ ", issInsertTime=" + issInsertTime + ", issInsertOrder=" + issInsertOrder + "]";
	}

}
