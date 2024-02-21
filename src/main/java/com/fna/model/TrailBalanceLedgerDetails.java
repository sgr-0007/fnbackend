package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrailBalanceLedgerDetails {
 	
	@Id
	int ledgerid;
	String ledgeralias;
	Double creditamount;
	Double debitamount;
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
	public Double getCreditamount() {
		return creditamount;
	}
	public void setCreditamount(Double creditamount) {
		this.creditamount = creditamount;
	}
	public Double getDebitamount() {
		return debitamount;
	}
	public void setDebitamount(Double debitamount) {
		this.debitamount = debitamount;
	}
	
	
	@Override
	public String toString() {
		return "TrailBalanceLedgerDetails [ledgerid=" + ledgerid
				+ ", ledgeralias=" + ledgeralias + ", creditamount=" + creditamount + ", debitamount=" + debitamount
				+ "]";
	}
	
	public TrailBalanceLedgerDetails(int ledgerid, String ledgeralias, Double creditamount,
			Double debitamount) {
		super();
		
		this.ledgerid = ledgerid;
		this.ledgeralias = ledgeralias;
		this.creditamount = creditamount;
		this.debitamount = debitamount;
	}
	public TrailBalanceLedgerDetails() { }
	
}
