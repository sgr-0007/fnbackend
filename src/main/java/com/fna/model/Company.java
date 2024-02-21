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
@Table(name = "companymaster")
public class Company {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int companyid;
	  @Column(name = "companyname")
	  private String companyname;
	  @Column(name = "tannumber")
	  private String tannumber;
	  @Column(name = "companyaddress1")
	  private String companyaddress1;
	  @Column(name = "companyaddress2")
	  private String companyaddress2;
	  private int cityid;
	  private int stateid;
	  @Column(name = "pin")
	  private String pin;
	  @Column(name = "website")
	  private String website;
	  @Column(name = "emailid")
	  private String emailid;
	  @Column(name = "gsttin")
	  private String gsttin;
	  @Column(name = "pan")
	  private String pan;
	  @Column(name = "phoneama")
	  private String phoneama;
	  @Column(name = "phoneas")
	  private String phoneas;
	  @Column(name = "mobile")
	  private String mobile;
	  private int companytypeid;
	  @Column(name = "regionaloffice")
	  private String regionaloffice;
	  private String branchid;
	  private boolean  isactive;
	  private int createdby;
	  @Column(name = "createddate",updatable = true)
	  @CreationTimestamp
	  private Date createddate;
	  private int modifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  
	  private String vcode;

	public String getVcode() {
		return vcode;
	}
	public void setVcode(String vcode) {
		this.vcode = vcode;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getTannumber() {
		return tannumber;
	}
	public void setTannumber(String tannumber) {
		this.tannumber = tannumber;
	}
	public String getCompanyaddress1() {
		return companyaddress1;
	}
	public void setCompanyaddress1(String companyaddress1) {
		this.companyaddress1 = companyaddress1;
	}
	public String getCompanyaddress2() {
		return companyaddress2;
	}
	public void setCompanyaddress2(String companyaddress2) {
		this.companyaddress2 = companyaddress2;
	}
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public String getGsttin() {
		return gsttin;
	}
	public void setGsttin(String gsttin) {
		this.gsttin = gsttin;
	}
	public String getPan() {
		return pan;
	}
	public void setPan(String pan) {
		this.pan = pan;
	}
	
	public String getPhoneama() {
		return phoneama;
	}
	public void setPhoneama(String phoneama) {
		this.phoneama = phoneama;
	}
	public String getPhoneas() {
		return phoneas;
	}
	public void setPhoneas(String phoneas) {
		this.phoneas = phoneas;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public int getCompanytypeid() {
		return companytypeid;
	}
	public void setCompanytypeid(int companytypeid) {
		this.companytypeid = companytypeid;
	}
	public String getRegionaloffice() {
		return regionaloffice;
	}
	public void setRegionaloffice(String regionaloffice) {
		this.regionaloffice = regionaloffice;
	}
	public String getBranchid() {
		return branchid;
	}
	public void setBranchid(String branchid) {
		this.branchid = branchid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public int getCreatedby() {
		return createdby;
	}
	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public int getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	
	public Company(int companyid, String companyname, String tannumber, String companyaddress1, String companyaddress2,
			int cityid, int stateid, String pin, String website, String emailid, String gsttin, String pan,
			String phoneama,String phoneas, String mobile, int companytypeid, String regionaloffice, String branchid, boolean isactive,
			int createdby, Date createddate, int modifiedby, Date modifieddate) {
		super();
		this.companyid = companyid;
		this.companyname = companyname;
		this.tannumber = tannumber;
		this.companyaddress1 = companyaddress1;
		this.companyaddress2 = companyaddress2;
		this.cityid = cityid;
		this.stateid = stateid;
		this.pin = pin;
		this.website = website;
		this.emailid = emailid;
		this.gsttin = gsttin;
		this.pan = pan;
		this.phoneama = phoneama;
		this.phoneas=phoneas;
		this.mobile = mobile;
		this.companytypeid = companytypeid;
		this.regionaloffice = regionaloffice;
		this.branchid = branchid;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createddate = createddate;
		this.modifiedby = modifiedby;
		this.modifieddate = modifieddate;
	}
	public Company() {
		super();
	} 
	

}

