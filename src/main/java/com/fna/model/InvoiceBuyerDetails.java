package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class InvoiceBuyerDetails  {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ledgerid", updatable = false)
	private int ledgerId;
	@Column(name = "ledgername")
	private String ledgerName;
	@Column(name = "ledgeralias")
	private String ledgerAlias;
	@Column(name = "groupid")
	private int groupId;
	@Column(name = "subgroupid")
	private int subGroupId;
	@Column(name = "ledgersupplierid")
	private String ledgerSupplierId;
	@Column(name = "ledgercustomerid")
	private String ledgerCustomerId;
	@Column(name = "ledgertype")
	private int ledgerType;
	@Column(name = "associatedwithhormobranch")
	private int associateHomeBranch;
	@Column(name = "companyid")
	private int companyId;
	@Column(name = "doesitaffectinventory")
	private int affectInventory;
	@Column(name = "add1")
	private String address1;
	@Column(name = "add2")
	private String address2;
	@Column(name = "city")
	private int city;
	@Column(name = "state")
	private int state;
	@Column(name = "bankname")
	private String bankName;
	@Column(name = "bankaccountnumber")
	private String bankAccountNumber;
	@Column(name = "ifsccode")
	private String ifscCode;
	@Column(name = "bankaddress")
	private String bankAddress;
	@Column(name = "gsttin")
	private String gst;
	@Column(name = "panno")
	@Pattern(regexp="^[A-Z]{5}[0-9]{4}[A-Z]{1}$",message="Invalid Pan Details")
	private String pano;
	@Column(name = "isactive")
	private byte active;
	@Column(name = "recordapprovalstatus")
	private int recordApprovalStatus;
	@Column(name = "createdby")
	private int createdBy;
	@Column(name = "createddate")
	@CreationTimestamp
	private Date createdDate;
	@Column(name = "modifiedby")
	private int modifiedBy;
	@Column(name = "modifieddate")
	@UpdateTimestamp
	private Date modifiedDate;
	@Column(name = "undergroups")
	private String undergroups;
	@Transient
	 private int[] fileUploadId;
	@Column(name="cityname")
	private String cityName;
	@Column(name="statename")
	private String stateName;
	private float creditlimitamount;
	
	public float getCreditlimitamount() {
		return creditlimitamount;
	}
	public void setCreditlimitamount(float creditlimitamount) {
		this.creditlimitamount = creditlimitamount;
	}
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public String getLedgerName() {
		return ledgerName;
	}
	public void setLedgerName(String ledgerName) {
		this.ledgerName = ledgerName;
	}
	public String getLedgerAlias() {
		return ledgerAlias;
	}
	public void setLedgerAlias(String ledgerAlias) {
		this.ledgerAlias = ledgerAlias;
	}
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public int getSubGroupId() {
		return subGroupId;
	}
	public void setSubGroupId(int subGroupId) {
		this.subGroupId = subGroupId;
	}
	public String getLedgerSupplierId() {
		return ledgerSupplierId;
	}
	public void setLedgerSupplierId(String ledgerSupplierId) {
		this.ledgerSupplierId = ledgerSupplierId;
	}
	public String getLedgerCustomerId() {
		return ledgerCustomerId;
	}
	public void setLedgerCustomerId(String ledgerCustomerId) {
		this.ledgerCustomerId = ledgerCustomerId;
	}
	public int getLedgerType() {
		return ledgerType;
	}
	public void setLedgerType(int ledgerType) {
		this.ledgerType = ledgerType;
	}
	public int getAssociateHomeBranch() {
		return associateHomeBranch;
	}
	public void setAssociateHomeBranch(int associateHomeBranch) {
		this.associateHomeBranch = associateHomeBranch;
	}
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getAffectInventory() {
		return affectInventory;
	}
	public void setAffectInventory(int affectInventory) {
		this.affectInventory = affectInventory;
	}
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
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
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
	}
	public String getPano() {
		return pano;
	}
	public void setPano(String pano) {
		this.pano = pano;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public int getRecordApprovalStatus() {
		return recordApprovalStatus;
	}
	public void setRecordApprovalStatus(int recordApprovalStatus) {
		this.recordApprovalStatus = recordApprovalStatus;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public String getUndergroups() {
		return undergroups;
	}
	public void setUndergroups(String undergroups) {
		this.undergroups = undergroups;
	}
	public int[] getFileUploadId() {
		return fileUploadId;
	}
	public void setFileUploadId(int[] fileUploadId) {
		this.fileUploadId = fileUploadId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	} 
	
	
	
}
