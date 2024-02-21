package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class YearlyBudgetMasterView {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int yearlybudgetid;
	  @Column(name = "financialyear")
	  private String financialyear;
	  @Column(name = "yearlybudgetname")
	  private String yearlybudgetname;
	  private Integer companyid;
	  private String companyname;
	  @Column(name = "isactive")
	  private boolean isactive;
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
	  @Column(name = "statusid")
	  private Integer statusid;
	  
	public Integer getStatusid() {
		return statusid;
	}
	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}
	public int getYearlybudgetid() {
		return yearlybudgetid;
	}
	public void setYearlybudgetid(int yearlybudgetid) {
		this.yearlybudgetid = yearlybudgetid;
	}
	public String getFinancialyear() {
		return financialyear;
	}
	public void setFinancialyear(String financialyear) {
		this.financialyear = financialyear;
	}
	public String getYearlybudgetname() {
		return yearlybudgetname;
	}
	public void setYearlybudgetname(String yearlybudgetname) {
		this.yearlybudgetname = yearlybudgetname;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
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
	public YearlyBudgetMasterView(int yearlybudgetid, String financialyear, String yearlybudgetname, Integer companyid,
			String companyname, boolean isactive, Integer createdby, Date createddate, Integer modifiedby,
			Date modifieddate) {
		super();
		this.yearlybudgetid = yearlybudgetid;
		this.financialyear = financialyear;
		this.yearlybudgetname = yearlybudgetname;
		this.companyid = companyid;
		this.companyname = companyname;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createddate = createddate;
		this.modifiedby = modifiedby;
		this.modifieddate = modifieddate;
	}

	public YearlyBudgetMasterView()
	{
		
	}
}
