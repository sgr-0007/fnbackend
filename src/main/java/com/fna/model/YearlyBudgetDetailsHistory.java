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
@Table(name = "yearlybudgetdetailshistory")
public class YearlyBudgetDetailsHistory {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int yearlybudgetdetailshistoryid;
	 @Column(name = "yearlybudgetid")
	  private int yearlybudgetid;
	  @Column(name = "ledgerid")
	  private int ledgerid;
	  @Column(name = "companyid")
	  private int companyid;
	  private String financialyear;
	  @Column(name = "estimatedbudget")
      private Double estimatedbudget;
	  @Column(name = "sanctionedbudget")
	  private Double sanctionedbudget;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "createdby")
	  private Integer createdby;
	  @Column(name = "checkeddate",updatable = true)
	  @CreationTimestamp
	  private Date checkeddate;
	  @Column(name = "approveddate",updatable = true)
	  @CreationTimestamp
	  private Date approveddate;
	  @Column(name = "statusid")
	  private Integer statusid;
	  @Column(name = "checkedby")
	  private Integer checkedby;
	  @Column(name = "approvedby")
	  private Integer approvedby;
	  private Double additional;
	  private Double revise;
	  
	  
	public Double getAdditional() {
		return additional;
	}

	public void setAdditional(Double additional) {
		this.additional = additional;
	}

	public Double getRevise() {
		return revise;
	}

	public void setRevise(Double revise) {
		this.revise = revise;
	}

	public Double getSanctionedbudget() {
		return sanctionedbudget;
	}

	public void setSanctionedbudget(Double sanctionedbudget) {
		this.sanctionedbudget = sanctionedbudget;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public Date getCheckeddate() {
		return checkeddate;
	}

	public void setCheckeddate(Date checkeddate) {
		this.checkeddate = checkeddate;
	}

	public Date getApproveddate() {
		return approveddate;
	}

	public void setApproveddate(Date approveddate) {
		this.approveddate = approveddate;
	}

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

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

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}

	public int getYearlybudgetdetailshistoryid() {
		return yearlybudgetdetailshistoryid;
	}
	
	public void setYearlybudgetdetailshistoryid(int yearlybudgetdetailshistoryid) {
		this.yearlybudgetdetailshistoryid = yearlybudgetdetailshistoryid;
	}
	public int getYearlybudgetid() {
		return yearlybudgetid;
	}
	public void setYearlybudgetid(int yearlybudgetid) {
		this.yearlybudgetid = yearlybudgetid;
	}
	public int getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(int ledgerid) {
		this.ledgerid = ledgerid;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getFinancialyear() {
		return financialyear;
	}
	public void setFinancialyear(String financialyear) {
		this.financialyear = financialyear;
	}
	public Double getEstimatedbudget() {
		return estimatedbudget;
	}
	public void setEstimatedbudget(Double estimatedbudget) {
		this.estimatedbudget = estimatedbudget;
	}
	
	public YearlyBudgetDetailsHistory(int yearlybudgetdetailshistoryid, int yearlybudgetid, int ledgerid, int companyid,
			String financialyear, Double estimatedbudget, Double sanctionedbudget, Date createddate, Integer createdby,
			Date checkeddate, Date approveddate, Integer statusid, Integer checkedby, Integer approvedby) {
		super();
		this.yearlybudgetdetailshistoryid = yearlybudgetdetailshistoryid;
		this.yearlybudgetid = yearlybudgetid;
		this.ledgerid = ledgerid;
		this.companyid = companyid;
		this.financialyear = financialyear;
		this.estimatedbudget = estimatedbudget;
		this.sanctionedbudget = sanctionedbudget;
		this.createddate = createddate;
		this.createdby = createdby;
		this.checkeddate = checkeddate;
		this.approveddate = approveddate;
		this.statusid = statusid;
		this.checkedby = checkedby;
		this.approvedby = approvedby;
	}

	public YearlyBudgetDetailsHistory()
	{
		
		
	}
	  
	
}
