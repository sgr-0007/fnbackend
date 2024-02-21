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
@Table(name = "yearlybudgetdetailshistoryofhistory")
public class YearlyBudgetDetailsHistoryOfHistory {
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int yearlybudgetdetailshistoryhid;
	 @Column(name = "yearlybudgetdetailshistoryid")
	  private int yearlybudgetdetailshistoryid;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "createdby")
	  private Integer createdby;
	  private Double additional;
	  private Double revise;
	public int getYearlybudgetdetailshistoryhid() {
		return yearlybudgetdetailshistoryhid;
	}
	public void setYearlybudgetdetailshistoryhid(int yearlybudgetdetailshistoryhid) {
		this.yearlybudgetdetailshistoryhid = yearlybudgetdetailshistoryhid;
	}
	public int getYearlybudgetdetailshistoryid() {
		return yearlybudgetdetailshistoryid;
	}
	public void setYearlybudgetdetailshistoryid(int yearlybudgetdetailshistoryid) {
		this.yearlybudgetdetailshistoryid = yearlybudgetdetailshistoryid;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Integer getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}
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
	  
	 
}
