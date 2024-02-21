package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="auctb_master_buyer")
public class AUCBuyerLedger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bid;
	@Column(name="IBuyerID")
	private String iBuyerID;
	@Column(name="BuyerNo")
	private int buyerNo;
	@Column(name="IBuyerCategoryCode")
	private int iBuyerCategoryCode;
	@Column(name="vcBuyerName")
	private String vcBuyerName;
	@Column(name="vcAddress")
	private String vcAddress;
	@Column(name="vcBuyerRegNo")
	private String vcBuyerRegNo;
	@Column(name="vcBankName")
	private String vcBankName;
	@Column(name="dOBBankG")
	private float dOBBankG;
	@Column(name="dCBBankG")
	private float dCBBankG;
	@Column(name="dCBCashG")
	private float dCBCashG;
	@Column(name="dCumulativeValue")
	private float dCumulativeValue;
	@Column(name="IPAddress")
	private Integer IPAddress;
	@Column(name="ICreatedBy")
	private String ICreatedBy;
	@Column(name="ICreatedOn")
	private Date ICreatedOn;
	@Column(name="vcPassword")
	private String vcPassword;
	@Column(name="dBalanceAmt")
	private float dBalanceAmt;
	@Column(name="siActive")
	private int isActive;
	@Column(name="Suspension_Code")
	private String suspensionCode;
	@Column(name="Suspension_From")
	private Date suspensionFrom;
	@Column(name="Suspension_To")
	private Date suspensionTo;
	@Column(name="vcLoginId")
	private String vcLoginId;
	@Column(name="FIRST_LOG_FLG")
	private String firstLOGFLG;
	@Column(name="LastLoginTime")
	private Date lastLoginTime;
	@Column(name="CurrentLoginTime")
	private Date currentLoginTime;
	@Column(name="psswd_ch_time")
	private Date psswdChTime;
	@Column(name="login_attempts")
	private Integer loginAttempts;
	@Column(name="siLocked")
	private Integer isLocked;
	@Column(name="updated_by")
	private String updatedBy;
	@Column(name="updated_on")
	private Date updatedOn;
	@Column(name="GST_Number")
	private String GSTNumber;
	@Column(name="State_Code")
	private String stateCode;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="buyer_pincode")
	private String buyerPincode;
	@Column(name="inserted_date")
	private Date insertedDate;
	private Integer status;
	private Integer cstatus;
	private Integer companyid;
	public int getBid() {
		return bid;
	}
	public void setBid(int bid) {
		this.bid = bid;
	}
	public String getiBuyerID() {
		return iBuyerID;
	}
	public void setiBuyerID(String iBuyerID) {
		this.iBuyerID = iBuyerID;
	}
	public int getBuyerNo() {
		return buyerNo;
	}
	public void setBuyerNo(int buyerNo) {
		this.buyerNo = buyerNo;
	}
	public int getiBuyerCategoryCode() {
		return iBuyerCategoryCode;
	}
	public void setiBuyerCategoryCode(int iBuyerCategoryCode) {
		this.iBuyerCategoryCode = iBuyerCategoryCode;
	}
	public String getVcBuyerName() {
		return vcBuyerName;
	}
	public void setVcBuyerName(String vcBuyerName) {
		this.vcBuyerName = vcBuyerName;
	}
	public String getVcAddress() {
		return vcAddress;
	}
	public void setVcAddress(String vcAddress) {
		this.vcAddress = vcAddress;
	}
	public String getVcBuyerRegNo() {
		return vcBuyerRegNo;
	}
	public void setVcBuyerRegNo(String vcBuyerRegNo) {
		this.vcBuyerRegNo = vcBuyerRegNo;
	}
	public String getVcBankName() {
		return vcBankName;
	}
	public void setVcBankName(String vcBankName) {
		this.vcBankName = vcBankName;
	}
	public float getdOBBankG() {
		return dOBBankG;
	}
	public void setdOBBankG(float dOBBankG) {
		this.dOBBankG = dOBBankG;
	}
	public float getdCBBankG() {
		return dCBBankG;
	}
	public void setdCBBankG(float dCBBankG) {
		this.dCBBankG = dCBBankG;
	}
	public float getdCBCashG() {
		return dCBCashG;
	}
	public void setdCBCashG(float dCBCashG) {
		this.dCBCashG = dCBCashG;
	}
	public float getdCumulativeValue() {
		return dCumulativeValue;
	}
	public void setdCumulativeValue(float dCumulativeValue) {
		this.dCumulativeValue = dCumulativeValue;
	}
	public Integer getIPAddress() {
		return IPAddress;
	}
	public void setIPAddress(Integer iPAddress) {
		IPAddress = iPAddress;
	}
	public String getICreatedBy() {
		return ICreatedBy;
	}
	public void setICreatedBy(String iCreatedBy) {
		ICreatedBy = iCreatedBy;
	}
	public Date getICreatedOn() {
		return ICreatedOn;
	}
	public void setICreatedOn(Date iCreatedOn) {
		ICreatedOn = iCreatedOn;
	}
	public String getVcPassword() {
		return vcPassword;
	}
	public void setVcPassword(String vcPassword) {
		this.vcPassword = vcPassword;
	}
	public float getdBalanceAmt() {
		return dBalanceAmt;
	}
	public void setdBalanceAmt(float dBalanceAmt) {
		this.dBalanceAmt = dBalanceAmt;
	}
	public int getIsActive() {
		return isActive;
	}
	public void setIsActive(int isActive) {
		this.isActive = isActive;
	}
	public String getSuspensionCode() {
		return suspensionCode;
	}
	public void setSuspensionCode(String suspensionCode) {
		this.suspensionCode = suspensionCode;
	}
	public Date getSuspensionFrom() {
		return suspensionFrom;
	}
	public void setSuspensionFrom(Date suspensionFrom) {
		this.suspensionFrom = suspensionFrom;
	}
	public Date getSuspensionTo() {
		return suspensionTo;
	}
	public void setSuspensionTo(Date suspensionTo) {
		this.suspensionTo = suspensionTo;
	}
	public String getVcLoginId() {
		return vcLoginId;
	}
	public void setVcLoginId(String vcLoginId) {
		this.vcLoginId = vcLoginId;
	}
	public String getFirstLOGFLG() {
		return firstLOGFLG;
	}
	public void setFirstLOGFLG(String firstLOGFLG) {
		this.firstLOGFLG = firstLOGFLG;
	}
	public Date getLastLoginTime() {
		return lastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}
	public Date getCurrentLoginTime() {
		return currentLoginTime;
	}
	public void setCurrentLoginTime(Date currentLoginTime) {
		this.currentLoginTime = currentLoginTime;
	}
	public Date getPsswdChTime() {
		return psswdChTime;
	}
	public void setPsswdChTime(Date psswdChTime) {
		this.psswdChTime = psswdChTime;
	}
	public Integer getLoginAttempts() {
		return loginAttempts;
	}
	public void setLoginAttempts(Integer loginAttempts) {
		this.loginAttempts = loginAttempts;
	}
	public Integer getIsLocked() {
		return isLocked;
	}
	public void setIsLocked(Integer isLocked) {
		this.isLocked = isLocked;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getGSTNumber() {
		return GSTNumber;
	}
	public void setGSTNumber(String gSTNumber) {
		GSTNumber = gSTNumber;
	}
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getBuyerPincode() {
		return buyerPincode;
	}
	public void setBuyerPincode(String buyerPincode) {
		this.buyerPincode = buyerPincode;
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
	public Integer getCstatus() {
		return cstatus;
	}
	public void setCstatus(Integer cstatus) {
		this.cstatus = cstatus;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	
	
	
	
	
	
	
	
}
