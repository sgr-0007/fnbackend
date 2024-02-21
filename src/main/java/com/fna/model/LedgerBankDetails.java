package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

@Entity
@Table(name="bankdetails")
public class LedgerBankDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankdetailsid;
	
	@Column(name = "bankname")
	private String bankName;
	@Column(name = "accountnumber")
	private String bankAccountNumber;
	@Column(name = "ifsccode")
	private String ifscCode;
	@Column(name = "bankaddress")
	private String bankAddress;/*
								 * @Column(name = "gstno") private String gst;
								 * 
								 * @Column(name = "panno")
								 * 
								 * @Pattern(regexp="^[A-Z]{5}[0-9]{4}[A-Z]{1}|$",message="Invalid Pan Details")
								 * private String pano;
								 */
	private int  ledgerid;
	public int getBankdetailsid() {
		return bankdetailsid;
	}
	public void setBankdetailsid(int bankdetailsid) {
		this.bankdetailsid = bankdetailsid;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getBankAccountNumber() {
		return bankAccountNumber;
	}
	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}
	public String getIfscCode() {
		return ifscCode;
	}
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}
	public String getBankAddress() {
		return bankAddress;
	}
	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

	/*
	 * public String getGst() { return gst; } public void setGst(String gst) {
	 * this.gst = gst; } public String getPano() { return pano; } public void
	 * setPano(String pano) { this.pano = pano; }
	 */	public int getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(int ledgerid) {
		this.ledgerid = ledgerid;
	}

	
	
	
	
	
	
	
}
