package com.think.wms.entity;

import java.util.Date;

public class OutstoreSub {
	private int ossId;
	private int osmId;
	private int ossPlanQuantity;
	private int ossRealQuantity;
	private Product product;
	private int productQuality;
	private Store store;
	private Date ossInsertTime;
	private int ossInsertOrder;
	private OutstoreMain outstoreMain;

	public int getOssId() {
		return ossId;
	}

	public void setOssId(int ossId) {
		this.ossId = ossId;
	}

	public int getOsmId() {
		return osmId;
	}

	public void setOsmId(int osmId) {
		this.osmId = osmId;
	}

	public int getOssPlanQuantity() {
		return ossPlanQuantity;
	}

	public void setOssPlanQuantity(int ossPlanQuantity) {
		this.ossPlanQuantity = ossPlanQuantity;
	}

	public int getOssRealQuantity() {
		return ossRealQuantity;
	}

	public void setOssRealQuantity(int ossRealQuantity) {
		this.ossRealQuantity = ossRealQuantity;
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

	public Date getOssInsertTime() {
		return ossInsertTime;
	}

	public void setOssInsertTime(Date ossInsertTime) {
		this.ossInsertTime = ossInsertTime;
	}

	public int getOssInsertOrder() {
		return ossInsertOrder;
	}

	public void setOssInsertOrder(int ossInsertOrder) {
		this.ossInsertOrder = ossInsertOrder;
	}

	public OutstoreMain getOutstoreMain() {
		return outstoreMain;
	}

	public void setOutstoreMain(OutstoreMain outstoreMain) {
		this.outstoreMain = outstoreMain;
	}

	@Override
	public String toString() {
		return "OutstoreSub [ossId=" + ossId + ", osmId=" + osmId + ", ossPlanQuantity=" + ossPlanQuantity + ", ossRealQuantity=" + ossRealQuantity
			+ ", product=" + product + ", productQuality=" + productQuality + ", store=" + store + ", ossInsertTime=" + ossInsertTime
			+ ", ossInsertOrder=" + ossInsertOrder + ", outstoreMain=" + outstoreMain + "]";
	}
}
