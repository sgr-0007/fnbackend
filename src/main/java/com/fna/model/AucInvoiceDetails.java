package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aucinvoice_details")
public class AucInvoiceDetails {

	@Id
	private int invid;
	@Column(name="Invoice_No")
	private int invoiceNo;
	@Column(name="iLotNumber")
	private int ilotNumber;
	@Column(name="BaleStatus")
	private char baleStatus;
	@Column(name="BaleDate")
	private Date baleDate;
	@Column(name="BaleWeight")
	private float baleWeight;
	@Column(name="BalePrice")
	private float balePrice;
	@Column(name="TotalAmount")
	private float totalAmount;
	@Column(name="inserteddate")
	private Date insertedDate;
	@Column(name="status")
	private int status;
	public int getInvid() {
		return invid;
	}
	public void setInvid(int invid) {
		this.invid = invid;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public int getIlotNumber() {
		return ilotNumber;
	}
	public void setIlotNumber(int ilotNumber) {
		this.ilotNumber = ilotNumber;
	}
	public char getBaleStatus() {
		return baleStatus;
	}
	public void setBaleStatus(char baleStatus) {
		this.baleStatus = baleStatus;
	}
	public Date getBaleDate() {
		return baleDate;
	}
	public void setBaleDate(Date baleDate) {
		this.baleDate = baleDate;
	}
	public float getBaleWeight() {
		return baleWeight;
	}
	public void setBaleWeight(float baleWeight) {
		this.baleWeight = baleWeight;
	}
	public float getBalePrice() {
		return balePrice;
	}
	public void setBalePrice(float balePrice) {
		this.balePrice = balePrice;
	}
	public float getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(float totalAmount) {
		this.totalAmount = totalAmount;
	}
	public Date getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
