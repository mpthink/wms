package com.think.wms.entity;

import java.util.Date;
import java.util.List;

public class InstoreMain {

	private int ismId;
	private String ismSn;
	private String ismTicketNo;
	private Date ismTicketTime;
	private String ismCarrier;
	private String ismCarNo;
	private int ismStatus;
	private int ismTotal;
	private String ismRemark;
	private String ismCreator;
	private Date ismCreateDate;
	private String ismChargebacker;
	private Date ismChargebackDate;
	private String ismConfirmor;
	private Date ismConfirmDate;
	private String ismReviewer;
	private Date ismReviewDate;
	private Customer customer;
	private List<InstoreSub> instoreSubs;

	public int getIsmId() {
		return ismId;
	}

	public void setIsmId(int ismId) {
		this.ismId = ismId;
	}

	public String getIsmSn() {
		return ismSn;
	}

	public void setIsmSn(String ismSn) {
		this.ismSn = ismSn;
	}

	public String getIsmTicketNo() {
		return ismTicketNo;
	}

	public void setIsmTicketNo(String ismTicketNo) {
		this.ismTicketNo = ismTicketNo;
	}

	public Date getIsmTicketTime() {
		return ismTicketTime;
	}

	public void setIsmTicketTime(Date ismTicketTime) {
		this.ismTicketTime = ismTicketTime;
	}

	public String getIsmCarrier() {
		return ismCarrier;
	}

	public void setIsmCarrier(String ismCarrier) {
		this.ismCarrier = ismCarrier;
	}

	public String getIsmCarNo() {
		return ismCarNo;
	}

	public void setIsmCarNo(String ismCarNo) {
		this.ismCarNo = ismCarNo;
	}

	public int getIsmStatus() {
		return ismStatus;
	}

	public void setIsmStatus(int ismStatus) {
		this.ismStatus = ismStatus;
	}

	public int getIsmTotal() {
		return ismTotal;
	}

	public void setIsmTotal(int ismTotal) {
		this.ismTotal = ismTotal;
	}

	public String getIsmRemark() {
		return ismRemark;
	}

	public void setIsmRemark(String ismRemark) {
		this.ismRemark = ismRemark;
	}

	public String getIsmCreator() {
		return ismCreator;
	}

	public void setIsmCreator(String ismCreator) {
		this.ismCreator = ismCreator;
	}

	public Date getIsmCreateDate() {
		return ismCreateDate;
	}

	public void setIsmCreateDate(Date ismCreateDate) {
		this.ismCreateDate = ismCreateDate;
	}

	public String getIsmChargebacker() {
		return ismChargebacker;
	}

	public void setIsmChargebacker(String ismChargebacker) {
		this.ismChargebacker = ismChargebacker;
	}

	public Date getIsmChargebackDate() {
		return ismChargebackDate;
	}

	public void setIsmChargebackDate(Date ismChargebackDate) {
		this.ismChargebackDate = ismChargebackDate;
	}

	public String getIsmConfirmor() {
		return ismConfirmor;
	}

	public void setIsmConfirmor(String ismConfirmor) {
		this.ismConfirmor = ismConfirmor;
	}

	public Date getIsmConfirmDate() {
		return ismConfirmDate;
	}

	public void setIsmConfirmDate(Date ismConfirmDate) {
		this.ismConfirmDate = ismConfirmDate;
	}

	public String getIsmReviewer() {
		return ismReviewer;
	}

	public void setIsmReviewer(String ismReviewer) {
		this.ismReviewer = ismReviewer;
	}

	public Date getIsmReviewDate() {
		return ismReviewDate;
	}

	public void setIsmReviewDate(Date ismReviewDate) {
		this.ismReviewDate = ismReviewDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<InstoreSub> getInstoreSubs() {
		return instoreSubs;
	}

	public void setInstoreSubs(List<InstoreSub> instoreSubs) {
		this.instoreSubs = instoreSubs;
	}

	@Override
	public String toString() {
		return "InstoreMain [ismId=" + ismId + ", ismSn=" + ismSn + ", ismTicketNo=" + ismTicketNo + ", ismTicketTime=" + ismTicketTime
			+ ", ismCarrier=" + ismCarrier + ", ismCarNo=" + ismCarNo + ", ismStatus=" + ismStatus + ", ismTotal=" + ismTotal + ", ismRemark="
			+ ismRemark + ", ismCreator=" + ismCreator + ", ismCreateDate=" + ismCreateDate + ", ismChargebacker=" + ismChargebacker
			+ ", ismChargebackDate=" + ismChargebackDate + ", ismConfirmor=" + ismConfirmor + ", ismConfirmDate=" + ismConfirmDate + ", ismReviewer="
			+ ismReviewer + ", ismReviewDate=" + ismReviewDate + ", customer=" + customer + ", instoreSubs=" + instoreSubs + "]";
	}

}
