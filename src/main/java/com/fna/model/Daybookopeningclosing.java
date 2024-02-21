package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "daybookopeningclosing")
public class Daybookopeningclosing {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "daybookledgerid")
	int daybookledgerid;
	@Column(name = "ledgerid")
	int ledgerid;
	@Column(name = "companyid")
	Integer companyid;
	@Column(name = "openingbalance")
	Double openingbalance;
	@Column(name = "closingbalance")
	Double closingbalance;
	@Column(name = "daybookdate")
	Date daybookdate;
	public int getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(int ledgerid) {
		this.ledgerid = ledgerid;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
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
	public int getDaybookledgerid() {
		return daybookledgerid;
	}
	public void setDaybookledgerid(int daybookledgerid) {
		this.daybookledgerid = daybookledgerid;
	}
	
	

}
