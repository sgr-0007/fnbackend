package com.fna.model;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Transient;
@Transactional
@Entity
@Table(name="normalledgermaster")
public class SalesLedger  implements Cloneable{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ledgerid", updatable = false)
	private int ledgerId;
	@Column(name="ledgercode")
	private String ledgerCode;
	@Column(name = "ledgername")
	private String ledgerName;
	@Column(name = "ledgeralias")
	private String ledgerAlias;
	@Column(name = "groupid")
	private Integer groupId;
	@Column(name = "subgroupid")
	private Integer subGroupId;
	@Column(name = "ledgersupplierid")
	private String ledgerSupplierId;
	@Column(name = "ledgercustomerid")
	private String ledgerCustomerId;
	@Column(name = "ledgertype")
	private Integer ledgerType;
	
	@Column(name = "ledgerifbranch")
	private Integer ifBranch;
	@Column(name = "associatedwithhormobranch")
	private Integer associateHomeBranch;
	@Column(name = "companyid")
	private Integer companyId;
	@Column(name = "doesitaffectinventory")
	private Integer affectInventory;
	@Column(name="panno")
	private String panno;
	@Column(name="gsttin")
	private String gst;
	@Column(name = "add1")
	private String address1;
	@Column(name = "add2")
	private String address2;
	@Column(name = "city")
	private Integer city;
	@Column(name = "state")
	private Integer state;
	@Column(name="pin")
	private String pinCode;
	@Column(name = "isactive")
	private byte active;
	@Column(name = "recordapprovalstatus")
	private Integer recordApprovalStatus;
	@Column(name = "createdby")
	private Integer createdBy;
	@Column(name = "createddate")
	@CreationTimestamp
	private Date createdDate;
	@Column(name = "modifiedby")
	private Integer modifiedBy;
	@Column(name = "modifieddate")
	@UpdateTimestamp
	private Date modifiedDate;
	@Column(name = "undergroups")
	private String undergroups;
	@Column(name="accounttypeid")
	private Integer accounttypeid;
	@Transient
	private List<LedgerBankDetails> bankdetails;
	@Transient
	 private int[] fileUploadId;
	@Column(name = "cityname")
	private String cityName;
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public String getLedgerCode() {
		return ledgerCode;
	}
	public void setLedgerCode(String ledgerCode) {
		this.ledgerCode = ledgerCode;
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
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getSubGroupId() {
		return subGroupId;
	}
	public void setSubGroupId(Integer subGroupId) {
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
	public Integer getLedgerType() {
		return ledgerType;
	}
	public void setLedgerType(Integer ledgerType) {
		this.ledgerType = ledgerType;
	}
	public Integer getIfBranch() {
		return ifBranch;
	}
	public void setIfBranch(Integer ifBranch) {
		this.ifBranch = ifBranch;
	}
	public Integer getAssociateHomeBranch() {
		return associateHomeBranch;
	}
	public void setAssociateHomeBranch(Integer associateHomeBranch) {
		this.associateHomeBranch = associateHomeBranch;
	}
	public Integer getCompanyId() {
		return companyId;
	}
	public void setCompanyId(Integer companyId) {
		this.companyId = companyId;
	}
	public Integer getAffectInventory() {
		return affectInventory;
	}
	public void setAffectInventory(Integer affectInventory) {
		this.affectInventory = affectInventory;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getGst() {
		return gst;
	}
	public void setGst(String gst) {
		this.gst = gst;
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
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public byte getActive() {
		return active;
	}
	public void setActive(byte active) {
		this.active = active;
	}
	public Integer getRecordApprovalStatus() {
		return recordApprovalStatus;
	}
	public void setRecordApprovalStatus(Integer recordApprovalStatus) {
		this.recordApprovalStatus = recordApprovalStatus;
	}
	public Integer getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public Integer getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(Integer modifiedBy) {
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
	public Integer getAccounttypeid() {
		return accounttypeid;
	}
	public void setAccounttypeid(Integer accounttypeid) {
		this.accounttypeid = accounttypeid;
	}
	public List<LedgerBankDetails> getBankdetails() {
		return bankdetails;
	}
	public void setBankdetails(List<LedgerBankDetails> bankdetails) {
		this.bankdetails = bankdetails;
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
	@Override
	public String toString() {
		return "SalesLedger [ledgerId=" + ledgerId + ", ledgerCode=" + ledgerCode + ", ledgerName=" + ledgerName
				+ ", ledgerAlias=" + ledgerAlias + ", groupId=" + groupId + ", subGroupId=" + subGroupId
				+ ", ledgerSupplierId=" + ledgerSupplierId + ", ledgerCustomerId=" + ledgerCustomerId + ", ledgerType="
				+ ledgerType + ", ifBranch=" + ifBranch + ", associateHomeBranch=" + associateHomeBranch
				+ ", companyId=" + companyId + ", affectInventory=" + affectInventory + ", panno=" + panno + ", gst="
				+ gst + ", address1=" + address1 + ", address2=" + address2 + ", city=" + city + ", state=" + state
				+ ", pinCode=" + pinCode + ", active=" + active + ", recordApprovalStatus=" + recordApprovalStatus
				+ ", createdBy=" + createdBy + ", createdDate=" + createdDate + ", modifiedBy=" + modifiedBy
				+ ", modifiedDate=" + modifiedDate + ", undergroups=" + undergroups + ", accounttypeid=" + accounttypeid
				+ ", bankdetails=" + bankdetails + ", fileUploadId=" + Arrays.toString(fileUploadId) + ", cityName="
				+ cityName + "]";
	}
	
	
	
	
		
}
