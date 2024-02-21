package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class CompanyLedgerDetails {

	
	int companyid;
	
	@Id
	int ledgerid;
		
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public int getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(int ledgerid) {
		this.ledgerid = ledgerid;
	}
	
	@Override
	public String toString() {
		return "CompanyLedgerDetails [companyid=" + companyid + ", ledgerid=" + ledgerid + "]";
	}
	public CompanyLedgerDetails(int companyid, int ledgerid) {
	
		this.companyid = companyid;
		this.ledgerid = ledgerid;
		
	}
	public CompanyLedgerDetails() {

	}
	
}
