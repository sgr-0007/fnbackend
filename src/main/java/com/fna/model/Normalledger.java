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
@Table(name = "normalledgermaster")
public class Normalledger {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int ledgerid;
	  @Column(name = "ledgername")
	  private String ledgername;
	  @Column(name = "ledgeralias")
	  private String ledgeralias;
	  @Column(name = "groupid")
	  private Integer groupid;
	  
	  private String groupname;
	  
	  private String subgroupname;
	  
	  private String companyname;
	  
	  @Column(name = "subgroupid")
	  private Integer subgroupid;
	  @Column(name = "ledgersupplierid")
	  private String ledgersupplierid;
	  @Column(name = "ledgercustomerid")
	  private String ledgercustomerid;
	  @Column(name = "ledgertype")
	  private Integer ledgertype;
	  @Column(name = "associatedwithhormobranch")
	  private Integer associatedwithhormobranch;
	  @Column(name = "companyid")
	  private Integer companyid;
	  @Column(name = "doesitsffectinventory")
	  private boolean doesitsffectinventory;
	  @Column(name = "add1")
	  private String add1;
	  @Column(name = "add2")
	  private String add2;
	  @Column(name = "city")
	  private Integer city;
	  @Column(name = "state")
	  private Integer state;
	  @Column(name = "bankname")
	  private String bankname;
	  @Column(name = "bankaccountnumber")
	  private String bankaccountnumber;
	  @Column(name = "ifsccode")
	  private String ifsccode;
	  @Column(name = "bankaddress")
	  private String bankaddress;
	  @Column(name = "gsttin")
	  private String gsttin;
	  @Column(name = "panno")
	  private String panno;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "recordapprovalstatus")
	  private Integer recordapprovalstatus;
	  @Column(name = "createdby")
	  private Integer createdby;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "modifiedby")
	  private Integer modifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  @Column(name = "undergroups")
	  private String undergroups;
	  private Integer accounttypeid;
	  private String accounttype;

	  private Integer companytype;
	  private String companytypename;
	  @Column(name = "cityname")
		String CityName;
	public int getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(int ledgerid) {
		this.ledgerid = ledgerid;
	}
	public String getLedgername() {
		return ledgername;
	}
	public void setLedgername(String ledgername) {
		this.ledgername = ledgername;
	}
	public String getLedgeralias() {
		return ledgeralias;
	}
	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
	}
	public Integer getGroupid() {
		return groupid;
	}
	public void setGroupid(Integer groupid) {
		this.groupid = groupid;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}
	public String getSubgroupname() {
		return subgroupname;
	}
	public void setSubgroupname(String subgroupname) {
		this.subgroupname = subgroupname;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getSubgroupid() {
		return subgroupid;
	}
	public void setSubgroupid(Integer subgroupid) {
		this.subgroupid = subgroupid;
	}
	public String getLedgersupplierid() {
		return ledgersupplierid;
	}
	public void setLedgersupplierid(String ledgersupplierid) {
		this.ledgersupplierid = ledgersupplierid;
	}
	public String getLedgercustomerid() {
		return ledgercustomerid;
	}
	public void setLedgercustomerid(String ledgercustomerid) {
		this.ledgercustomerid = ledgercustomerid;
	}
	public Integer getLedgertype() {
		return ledgertype;
	}
	public void setLedgertype(Integer ledgertype) {
		this.ledgertype = ledgertype;
	}
	public Integer getAssociatedwithhormobranch() {
		return associatedwithhormobranch;
	}
	public void setAssociatedwithhormobranch(Integer associatedwithhormobranch) {
		this.associatedwithhormobranch = associatedwithhormobranch;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public boolean isDoesitsffectinventory() {
		return doesitsffectinventory;
	}
	public void setDoesitsffectinventory(boolean doesitsffectinventory) {
		this.doesitsffectinventory = doesitsffectinventory;
	}
	public String getAdd1() {
		return add1;
	}
	public void setAdd1(String add1) {
		this.add1 = add1;
	}
	public String getAdd2() {
		return add2;
	}
	public void setAdd2(String add2) {
		this.add2 = add2;
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
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankaccountnumber() {
		return bankaccountnumber;
	}
	public void setBankaccountnumber(String bankaccountnumber) {
		this.bankaccountnumber = bankaccountnumber;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public String getBankaddress() {
		return bankaddress;
	}
	public void setBankaddress(String bankaddress) {
		this.bankaddress = bankaddress;
	}
	public String getGsttin() {
		return gsttin;
	}
	public void setGsttin(String gsttin) {
		this.gsttin = gsttin;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public Integer getRecordapprovalstatus() {
		return recordapprovalstatus;
	}
	public void setRecordapprovalstatus(Integer recordapprovalstatus) {
		this.recordapprovalstatus = recordapprovalstatus;
	}
	public Integer getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Integer getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(Integer modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
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
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public Integer getCompanytype() {
		return companytype;
	}
	public void setCompanytype(Integer companytype) {
		this.companytype = companytype;
	}
	public String getCompanytypename() {
		return companytypename;
	}
	public void setCompanytypename(String companytypename) {
		this.companytypename = companytypename;
	}
	public String getCityName() {
		return CityName;
	}
	public void setCityName(String cityName) {
		CityName = cityName;
	}
	@Override
	public String toString() {
		return "Normalledger [ledgerid=" + ledgerid + ", ledgername=" + ledgername + ", ledgeralias=" + ledgeralias
				+ ", groupid=" + groupid + ", groupname=" + groupname + ", subgroupname=" + subgroupname
				+ ", companyname=" + companyname + ", subgroupid=" + subgroupid + ", ledgersupplierid="
				+ ledgersupplierid + ", ledgercustomerid=" + ledgercustomerid + ", ledgertype=" + ledgertype
				+ ", associatedwithhormobranch=" + associatedwithhormobranch + ", companyid=" + companyid
				+ ", doesitsffectinventory=" + doesitsffectinventory + ", add1=" + add1 + ", add2=" + add2 + ", city="
				+ city + ", state=" + state + ", bankname=" + bankname + ", bankaccountnumber=" + bankaccountnumber
				+ ", ifsccode=" + ifsccode + ", bankaddress=" + bankaddress + ", gsttin=" + gsttin + ", panno=" + panno
				+ ", isactive=" + isactive + ", recordapprovalstatus=" + recordapprovalstatus + ", createdby="
				+ createdby + ", createddate=" + createddate + ", modifiedby=" + modifiedby + ", modifieddate="
				+ modifieddate + ", undergroups=" + undergroups + ", accounttypeid=" + accounttypeid + ", accounttype="
				+ accounttype + ", companytype=" + companytype + ", companytypename=" + companytypename + ", CityName="
				+ CityName + "]";
	}
	public Normalledger(int ledgerid, String ledgername, String ledgeralias, Integer groupid, String groupname,
			String subgroupname, String companyname, Integer subgroupid, String ledgersupplierid,
			String ledgercustomerid, Integer ledgertype, Integer associatedwithhormobranch, Integer companyid,
			boolean doesitsffectinventory, String add1, String add2, Integer city, Integer state, String bankname,
			String bankaccountnumber, String ifsccode, String bankaddress, String gsttin, String panno,
			boolean isactive, Integer recordapprovalstatus, Integer createdby, Date createddate, Integer modifiedby,
			Date modifieddate, String undergroups, Integer accounttypeid, String accounttype, Integer companytype,
			String companytypename, String cityName) {
		super();
		this.ledgerid = ledgerid;
		this.ledgername = ledgername;
		this.ledgeralias = ledgeralias;
		this.groupid = groupid;
		this.groupname = groupname;
		this.subgroupname = subgroupname;
		this.companyname = companyname;
		this.subgroupid = subgroupid;
		this.ledgersupplierid = ledgersupplierid;
		this.ledgercustomerid = ledgercustomerid;
		this.ledgertype = ledgertype;
		this.associatedwithhormobranch = associatedwithhormobranch;
		this.companyid = companyid;
		this.doesitsffectinventory = doesitsffectinventory;
		this.add1 = add1;
		this.add2 = add2;
		this.city = city;
		this.state = state;
		this.bankname = bankname;
		this.bankaccountnumber = bankaccountnumber;
		this.ifsccode = ifsccode;
		this.bankaddress = bankaddress;
		this.gsttin = gsttin;
		this.panno = panno;
		this.isactive = isactive;
		this.recordapprovalstatus = recordapprovalstatus;
		this.createdby = createdby;
		this.createddate = createddate;
		this.modifiedby = modifiedby;
		this.modifieddate = modifieddate;
		this.undergroups = undergroups;
		this.accounttypeid = accounttypeid;
		this.accounttype = accounttype;
		this.companytype = companytype;
		this.companytypename = companytypename;
		CityName = cityName;
	}
	
	public Normalledger() {
		
		super();
	}
	  
	  

}
