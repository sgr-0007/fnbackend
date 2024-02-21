package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aucsalenote_details")
public class AUCSalenoteDetail {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sdid;
	@Column(name="SaleNote_No")
	private int saleNoteNo;
	@Column(name="iLotNumber")
	private int iLotNumber;
	@Column(name="BaleStatus")
	private String baleStatus;
	@Column(name="BaleDate")
	private Date baleDate;
	@Column(name="TotalAmount")
	private double totalAmount;
	@Column(name="BaleWeight")
	private double baleWeight;
	@Column(name="BalePrice")
	private double balePrice;
	@Column(name="inserted_date")
	private Date insertedDate;
	private Integer status;
	public int getSdid() {
		return sdid;
	}
	public void setSdid(int sdid) {
		this.sdid = sdid;
	}
	public int getSaleNoteNo() {
		return saleNoteNo;
	}
	public void setSaleNoteNo(int saleNoteNo) {
		this.saleNoteNo = saleNoteNo;
	}
	public int getiLotNumber() {
		return iLotNumber;
	}
	public void setiLotNumber(int iLotNumber) {
		this.iLotNumber = iLotNumber;
	}
	public String getBaleStatus() {
		return baleStatus;
	}
	public void setBaleStatus(String baleStatus) {
		this.baleStatus = baleStatus;
	}
	public Date getBaleDate() {
		return baleDate;
	}
	public void setBaleDate(Date baleDate) {
		this.baleDate = baleDate;
	}
	public double getTotalAmount() {
		return totalAmount;
	}
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public double getBaleWeight() {
		return baleWeight;
	}
	public void setBaleWeight(double baleWeight) {
		this.baleWeight = baleWeight;
	}
	public double getBalePrice() {
		return balePrice;
	}
	public void setBalePrice(double balePrice) {
		this.balePrice = balePrice;
	}
	public Date getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}

	
	
	
	
}
