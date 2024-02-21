package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cashbook {

	
	@Id
	@Column(name = "daybookledgerid")
	int daybookledgerid;
	@Column(name = "companyname")
	String companyname;
	@Column(name = "ledgeralias")
	String ledgeralias;
	@Column(name = "openingbalance")
	Double openingbalance;
	@Column(name = "closingbalance")
	Double closingbalance;
	@Column(name = "daybookdate")
	Date daybookdate;
	@Column(name = "statusdaybook")
	String statusdaybook;
	public int getDaybookledgerid() {
		return daybookledgerid;
	}
	public void setDaybookledgerid(int daybookledgerid) {
		this.daybookledgerid = daybookledgerid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getLedgeralias() {
		return ledgeralias;
	}
	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
	}
	public Double getOpeningbalance() {
		return openingbalance;
	}
	public void setOpeningbalance(Double openingbalance) {
		this.openingbalance = openingbalance;
	}
	public Double getClosingbalance() {
		return closingbalance;
	}
	public void setClosingbalance(Double closingbalance) {
		this.closingbalance = closingbalance;
	}
	public Date getDaybookdate() {
		return daybookdate;
	}
	public void setDaybookdate(Date daybookdate) {
		this.daybookdate = daybookdate;
	}
	public String getStatusdaybook() {
		return statusdaybook;
	}
	public void setStatusdaybook(String statusdaybook) {
		this.statusdaybook = statusdaybook;
	}
	@Override
	public String toString() {
		return "cashbook [daybookledgerid=" + daybookledgerid + ", companyname=" + companyname + ", ledgeralias="
				+ ledgeralias + ", openingbalance=" + openingbalance + ", closingbalance=" + closingbalance
				+ ", daybookdate=" + daybookdate + ", statusdaybook=" + statusdaybook + "]";
	}
	public Cashbook(int daybookledgerid, String companyname, String ledgeralias, Double openingbalance,
			Double closingbalance, Date daybookdate, String statusdaybook) {
	
		this.daybookledgerid = daybookledgerid;
		this.companyname = companyname;
		this.ledgeralias = ledgeralias;
		this.openingbalance = openingbalance;
		this.closingbalance = closingbalance;
		this.daybookdate = daybookdate;
		this.statusdaybook = statusdaybook;
	}
	public Cashbook()
	{
		
		
	}
	
	

}
