package com.think.wms.entity;

/**
 * 产品信息
 * @author mpthink
 *
 */
public class Product {
	private int productId;
	private String productName;
	private ProductCategory productCategory;
	private Customer customer;
	private double productMarketPrice;
	private double productCostPrice;
	private String productVolume;
	private String productUnit;

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductMarketPrice() {
		return productMarketPrice;
	}

	public void setProductMarketPrice(double productMarketPrice) {
		this.productMarketPrice = productMarketPrice;
	}

	public double getProductCostPrice() {
		return productCostPrice;
	}

	public void setProductCostPrice(double productCostPrice) {
		this.productCostPrice = productCostPrice;
	}

	public String getProductVolume() {
		return productVolume;
	}

	public void setProductVolume(String productVolume) {
		this.productVolume = productVolume;
	}

	public String getProductUnit() {
		return productUnit;
	}

	public void setProductUnit(String productUnit) {
		this.productUnit = productUnit;
	}

	public ProductCategory getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(ProductCategory productCategory) {
		this.productCategory = productCategory;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productCategory=" + productCategory + ", customer=" + customer
			+ ", productMarketPrice=" + productMarketPrice + ", productCostPrice=" + productCostPrice + ", productVolume=" + productVolume
			+ ", productUnit=" + productUnit + "]";
	}


}
