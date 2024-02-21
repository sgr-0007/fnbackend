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
@Table(name = "yearlybudgetmaster")
public class YearlyBudgetMaster {

	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int yearlybudgetid;
	  @Column(name = "financialyear")
	  private String financialyear;
	  @Column(name = "yearlybudgetname")
	  private String yearlybudgetname;
	  private Integer companyid;
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
	  @Column(name = "checkedby")
	  private Integer checkedby;
	  @Column(name = "approvedby")
	  private Integer approvedby;
	  
	  
	public Integer getCheckedby() {
		return checkedby;
	}



	public void setCheckedby(Integer checkedby) {
		this.checkedby = checkedby;
	}



	public Integer getApprovedby() {
		return approvedby;
	}



	public void setApprovedby(Integer approvedby) {
		this.approvedby = approvedby;
	}



	public Integer getStatusid() {
		return statusid;
	}



	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}



	public Integer getCompanyid() {
		return companyid;
	}



	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}



	



	public YearlyBudgetMaster(int yearlybudgetid, String financialyear, String yearlybudgetname, Integer companyid,
			boolean isactive, Integer createdby, Date createddate, Integer modifiedby, Date modifieddate) {
		super();
		this.yearlybudgetid = yearlybudgetid;
		this.financialyear = financialyear;
		this.yearlybudgetname = yearlybudgetname;
		this.companyid = companyid;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createddate = createddate;
		this.modifiedby = modifiedby;
		this.modifieddate = modifieddate;
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



	public YearlyBudgetMaster() {
		// TODO Auto-generated constructor stub
	}

}
