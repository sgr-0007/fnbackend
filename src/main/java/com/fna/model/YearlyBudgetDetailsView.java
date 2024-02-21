package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class YearlyBudgetDetailsView {

	@Id
	  private int yearlybudgetdetailsid;
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
	  @Column(name = "usedbudgetamount")
	  private Double usedbudgetamount;
    @Column(name = "balancebudgetamount")
	   private Double balancebudgetamount;
    @Column(name = "balancecarriedforwardforledger")
	   private Double balancecarriedforwardforledger;
    @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
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

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	


	public YearlyBudgetDetailsView(int yearlybudgetdetailsid, int yearlybudgetid, int ledgerid, String ledgeralias,
			Double estimatedbudget, Double usedbudgetamount, Double balancebudgetamount,
			Double balancecarriedforwardforledger) {
		super();
		this.yearlybudgetdetailsid = yearlybudgetdetailsid;
		this.yearlybudgetid = yearlybudgetid;
		this.ledgerid = ledgerid;
		this.ledgeralias = ledgeralias;
		this.estimatedbudget = estimatedbudget;
		this.usedbudgetamount = usedbudgetamount;
		this.balancebudgetamount = balancebudgetamount;
		this.balancecarriedforwardforledger = balancecarriedforwardforledger;
	}




	public int getYearlybudgetdetailsid() {
		return yearlybudgetdetailsid;
	}




	public void setYearlybudgetdetailsid(int yearlybudgetdetailsid) {
		this.yearlybudgetdetailsid = yearlybudgetdetailsid;
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





	public Double getUsedbudgetamount() {
		return usedbudgetamount;
	}




	public void setUsedbudgetamount(Double usedbudgetamount) {
		this.usedbudgetamount = usedbudgetamount;
	}




	public Double getBalancebudgetamount() {
		return balancebudgetamount;
	}




	public void setBalancebudgetamount(Double balancebudgetamount) {
		this.balancebudgetamount = balancebudgetamount;
	}




	public Double getBalancecarriedforwardforledger() {
		return balancecarriedforwardforledger;
	}




	public void setBalancecarriedforwardforledger(Double balancecarriedforwardforledger) {
		this.balancecarriedforwardforledger = balancecarriedforwardforledger;
	}




	public YearlyBudgetDetailsView() {
		// TODO Auto-generated constructor stub
	}

}
