package com.think.wms.entity;

import java.util.Date;
import java.util.List;

public class OutstoreMain {

	private int osmId;
	private String osmSn;
	private String osmTicketNo;
	private Date osmTicketTime;
	private String osmCarrier;
	private String osmCarNo;
	private int osmStatus;
	private int osmTotal;
	private String osmRemark;
	private String osmCreator;
	private Date osmCreateDate;
	private String osmChargebacker;
	private Date osmChargebackDate;
	private String osmConfirmor;
	private Date osmConfirmDate;
	private String osmReviewer;
	private Date osmReviewDate;
	private Customer customer;
	private List<OutstoreSub> outstoreSubs;

	public int getOsmId() {
		return osmId;
	}

	public void setOsmId(int osmId) {
		this.osmId = osmId;
	}

	public String getOsmSn() {
		return osmSn;
	}

	public void setOsmSn(String osmSn) {
		this.osmSn = osmSn;
	}

	public String getOsmTicketNo() {
		return osmTicketNo;
	}

	public void setOsmTicketNo(String osmTicketNo) {
		this.osmTicketNo = osmTicketNo;
	}

	public Date getOsmTicketTime() {
		return osmTicketTime;
	}

	public void setOsmTicketTime(Date osmTicketTime) {
		this.osmTicketTime = osmTicketTime;
	}

	public String getOsmCarrier() {
		return osmCarrier;
	}

	public void setOsmCarrier(String osmCarrier) {
		this.osmCarrier = osmCarrier;
	}

	public String getOsmCarNo() {
		return osmCarNo;
	}

	public void setOsmCarNo(String osmCarNo) {
		this.osmCarNo = osmCarNo;
	}

	public int getOsmStatus() {
		return osmStatus;
	}

	public void setOsmStatus(int osmStatus) {
		this.osmStatus = osmStatus;
	}

	public int getOsmTotal() {
		return osmTotal;
	}

	public void setOsmTotal(int osmTotal) {
		this.osmTotal = osmTotal;
	}

	public String getOsmRemark() {
		return osmRemark;
	}

	public void setOsmRemark(String osmRemark) {
		this.osmRemark = osmRemark;
	}

	public String getOsmCreator() {
		return osmCreator;
	}

	public void setOsmCreator(String osmCreator) {
		this.osmCreator = osmCreator;
	}

	public Date getOsmCreateDate() {
		return osmCreateDate;
	}

	public void setOsmCreateDate(Date osmCreateDate) {
		this.osmCreateDate = osmCreateDate;
	}

	public String getOsmChargebacker() {
		return osmChargebacker;
	}

	public void setOsmChargebacker(String osmChargebacker) {
		this.osmChargebacker = osmChargebacker;
	}

	public Date getOsmChargebackDate() {
		return osmChargebackDate;
	}

	public void setOsmChargebackDate(Date osmChargebackDate) {
		this.osmChargebackDate = osmChargebackDate;
	}

	public String getOsmConfirmor() {
		return osmConfirmor;
	}

	public void setOsmConfirmor(String osmConfirmor) {
		this.osmConfirmor = osmConfirmor;
	}

	public Date getOsmConfirmDate() {
		return osmConfirmDate;
	}

	public void setOsmConfirmDate(Date osmConfirmDate) {
		this.osmConfirmDate = osmConfirmDate;
	}

	public String getOsmReviewer() {
		return osmReviewer;
	}

	public void setOsmReviewer(String osmReviewer) {
		this.osmReviewer = osmReviewer;
	}

	public Date getOsmReviewDate() {
		return osmReviewDate;
	}

	public void setOsmReviewDate(Date osmReviewDate) {
		this.osmReviewDate = osmReviewDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OutstoreSub> getOutstoreSubs() {
		return outstoreSubs;
	}

	public void setOutstoreSubs(List<OutstoreSub> outstoreSubs) {
		this.outstoreSubs = outstoreSubs;
	}

	@Override
	public String toString() {
		return "OutstoreMain [osmId=" + osmId + ", osmSn=" + osmSn + ", osmTicketNo=" + osmTicketNo + ", osmTicketTime=" + osmTicketTime
			+ ", osmCarrier=" + osmCarrier + ", osmCarNo=" + osmCarNo + ", osmStatus=" + osmStatus + ", osmTotal=" + osmTotal + ", osmRemark="
			+ osmRemark + ", osmCreator=" + osmCreator + ", osmCreateDate=" + osmCreateDate + ", osmChargebacker=" + osmChargebacker
			+ ", osmChargebackDate=" + osmChargebackDate + ", osmConfirmor=" + osmConfirmor + ", osmConfirmDate=" + osmConfirmDate + ", osmReviewer="
			+ osmReviewer + ", osmReviewDate=" + osmReviewDate + ", customer=" + customer + ", outstoreSubs=" + outstoreSubs + "]";
	}

}
