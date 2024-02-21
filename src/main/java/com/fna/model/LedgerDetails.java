package com.fna.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;


@Entity

public class LedgerDetails {

	@Id
	@Column(name = "ledgerid")
	int ledgerId;
	@Column(name="ledgercode")
	private String ledgerCode;
	@Column(name = "ledgername")
	String ledgerName;
	@Column(name = "ledgeralias")
	String ledgerAlias;
	@Column(name = "groupid")
	Integer grouId;
	@Column(name = "subgroupid")
	Integer subgroupId;
	@Column(name = "subgroupname")
	String subGroupName;
	@Column(name = "groupname")
	String groupName;
	@Column(name = "ledgertype")
	Integer ledgerType;
	@Column(name="add1")
	private String address1;
	@Column(name="add2")
	private String address2;
	@Column(name = "associatedwithhormobranch")
	Integer associatedHomeBranch;
	@Column(name = "homebranch")
	String homeBranchName;
	@Column(name="ledgerifbranch")
	private Integer ledgerifbranch;
	private String ifbranch;
	/*
	 * @Column(name="ifbranch") private String ifbranch;
	 */
	/*
	 * @Column(name = "doesitaffectinventory") boolean doesItEffectInventory;
	 */
	@Column(name = "city")
	Integer city;
	@Column(name = "cityname")
	String CityName;
	@Column(name = "state")
	Integer state;
	@Column(name = "statename")
	String stateName;
	@Column(name="pin")
	private String pinCode;
	@Column(name = "isactive")
	boolean isActive;
	@Column(name="panno")
	private String panno;
	@Column(name="gsttin")
	private String gst;
	@Column(name = "recordapprovalstatus")
	Integer approvalStatus;
	@Column(name = "undergroups")
	String underGroup;
	@Column(name = "doesitaffectinventory")
	byte affectInventory;
	@Transient
	private List<LedgerBankDetails> bankDetails;
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
	public Integer getGrouId() {
		return grouId;
	}
	public void setGrouId(Integer grouId) {
		this.grouId = grouId;
	}
	public Integer getSubgroupId() {
		return subgroupId;
	}
	public void setSubgroupId(Integer subgroupId) {
		this.subgroupId = subgroupId;
	}
	public String getSubGroupName() {
		return subGroupName;
	}
	public void setSubGroupName(String subGroupName) {
		this.subGroupName = subGroupName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Integer getLedgerType() {
		return ledgerType;
	}
	public void setLedgerType(Integer ledgerType) {
		this.ledgerType = ledgerType;
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
	public Integer getAssociatedHomeBranch() {
		return associatedHomeBranch;
	}
	public void setAssociatedHomeBranch(Integer associatedHomeBranch) {
		this.associatedHomeBranch = associatedHomeBranch;
	}
	public String getHomeBranchName() {
		return homeBranchName;
	}
	public void setHomeBranchName(String homeBranchName) {
		this.homeBranchName = homeBranchName;
	}
	public Integer getLedgerifbranch() {
		return ledgerifbranch;
	}
	public void setLedgerifbranch(Integer ledgerifbranch) {
		this.ledgerifbranch = ledgerifbranch;
	}
	public String getIfbranch() {
		return ifbranch;
	}
	public void setIfbranch(String ifbranch) {
		this.ifbranch = ifbranch;
	}
	public Integer getCity() {
		return city;
	}
	public void setCity(Integer city) {
		this.city = city;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getPinCode() {
		return pinCode;
	}
	public void setPinCode(String pinCode) {
		this.pinCode = pinCode;
	}
	public boolean isActive() {
		return isActive;
	}
	public void setActive(boolean isActive) {
		this.isActive = isActive;
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
	public Integer getApprovalStatus() {
		return approvalStatus;
	}
	public void setApprovalStatus(Integer approvalStatus) {
		this.approvalStatus = approvalStatus;
	}
	public String getUnderGroup() {
		return underGroup;
	}
	public void setUnderGroup(String underGroup) {
		this.underGroup = underGroup;
	}
	public byte getAffectInventory() {
		return affectInventory;
	}
	public void setAffectInventory(byte affectInventory) {
		this.affectInventory = affectInventory;
	}
	public List<LedgerBankDetails> getBankDetails() {
		return bankDetails;
	}
	public void setBankDetails(List<LedgerBankDetails> bankDetails) {
		this.bankDetails = bankDetails;
	}
	@Override
	public String toString() {
		return "LedgerDetails [ledgerId=" + ledgerId + ", ledgerCode=" + ledgerCode + ", ledgerName=" + ledgerName
				+ ", ledgerAlias=" + ledgerAlias + ", grouId=" + grouId + ", subgroupId=" + subgroupId
				+ ", subGroupName=" + subGroupName + ", groupName=" + groupName + ", ledgerType=" + ledgerType
				+ ", address1=" + address1 + ", address2=" + address2 + ", associatedHomeBranch=" + associatedHomeBranch
				+ ", homeBranchName=" + homeBranchName + ", ledgerifbranch=" + ledgerifbranch + ", ifbranch=" + ifbranch
				+ ", city=" + city + ", CityName=" + CityName + ", state=" + state + ", stateName=" + stateName
				+ ", pinCode=" + pinCode + ", isActive=" + isActive + ", panno=" + panno + ", gst=" + gst
				+ ", approvalStatus=" + approvalStatus + ", underGroup=" + underGroup + ", affectInventory="
				+ affectInventory + ", bankDetails=" + bankDetails + "]";
	}
		
	
	
}
