package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class YearlyBudgetDetailsHistoryView {
	
	@Id
	  private int yearlybudgetdetailshistoryid;
	 @Column(name = "yearlybudgetid")
	  private int yearlybudgetid;
	  @Column(name = "ledgerid")
	  private int ledgerid;
	  @Column(name = "ledgeralias")
	  private String ledgeralias;
	  @Column(name = "estimatedbudget")
      private Double estimatedbudget;
	  @Column(name = "sanctionedbudget")
      private Double sanctionedbudget;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "statusid")
	  private Integer statusid;
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

	public Integer getStatusid() {
			return statusid;
		}

		public void setStatusid(Integer statusid) {
			this.statusid = statusid;
		}
	  
	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public YearlyBudgetDetailsHistoryView(int yearlybudgetdetailshistoryid, int yearlybudgetid, int ledgerid,
			String ledgeralias, Double estimatedbudget) {
		super();
		this.yearlybudgetdetailshistoryid = yearlybudgetdetailshistoryid;
		this.yearlybudgetid = yearlybudgetid;
		this.ledgerid = ledgerid;
		this.ledgeralias = ledgeralias;
		this.estimatedbudget = estimatedbudget;
	}
	
	public YearlyBudgetDetailsHistoryView()
	{
		
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
	public String getLedgeralias() {
		return ledgeralias;
	}
	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
	}
	public Double getEstimatedbudget() {
		return estimatedbudget;
	}


	public void setEstimatedbudget(Double estimatedbudget) {
		this.estimatedbudget = estimatedbudget;
	}

	  
	  

}
