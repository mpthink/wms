package com.think.wms.entity;

/**
 * 客户信息
 * @author mpthink
 *
 */
public class Customer {
	private int customerId;
	private String customerName;
	private String customerWayPay;
	private String customerWayOut;
	private String customerCompany;
	private String customerAddress;
	private String customerPhone;
	private CustomerCategory customerCategory;

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerWayPay() {
		return customerWayPay;
	}

	public void setCustomerWayPay(String customerWayPay) {
		this.customerWayPay = customerWayPay;
	}

	public String getCustomerWayOut() {
		return customerWayOut;
	}

	public void setCustomerWayOut(String customerWayOut) {
		this.customerWayOut = customerWayOut;
	}

	public String getCustomerAddress() {
		return customerAddress;
	}

	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}

	public String getCustomerPhone() {
		return customerPhone;
	}

	public void setCustomerPhone(String customerPhone) {
		this.customerPhone = customerPhone;
	}

	public CustomerCategory getCustomerCategory() {
		return customerCategory;
	}

	public void setCustomerCategory(CustomerCategory customerCategory) {
		this.customerCategory = customerCategory;
	}

	public String getCustomerCompany() {
		return customerCompany;
	}

	public void setCustomerCompany(String customerCompany) {
		this.customerCompany = customerCompany;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerWayPay=" + customerWayPay + ", customerWayOut="
			+ customerWayOut + ", customerCompany=" + customerCompany + ", customerAddress=" + customerAddress + ", customerPhone=" + customerPhone
			+ ", customerCategory=" + customerCategory + "]";
	}



}
