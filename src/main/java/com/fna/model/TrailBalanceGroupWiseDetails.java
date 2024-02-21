package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrailBalanceGroupWiseDetails {

	@Id
	int balancesheetgroupid;
	String balancesheetgroup;	
	Double creditamount;
	Double debitamount;
	
	public int getBalancesheetgroupid() {
		return balancesheetgroupid;
	}

	public void setBalancesheetgroupid(int balancesheetgroupid) {
		this.balancesheetgroupid = balancesheetgroupid;
	}

	public String getBalancesheetgroup() {
		return balancesheetgroup;
	}

	public void setBalancesheetgroup(String balancesheetgroup) {
		this.balancesheetgroup = balancesheetgroup;
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
		return "TrailBalanceGroupWiseDetails [balancesheetgroupid=" + balancesheetgroupid + ", balancesheetgroup="
				+ balancesheetgroup + ", creditamount=" + creditamount + ", debitamount=" + debitamount + "]";
	}

	public TrailBalanceGroupWiseDetails(int balancesheetgroupid, String balancesheetgroup, Double creditamount,
			Double debitamount) {
		super();
		this.balancesheetgroupid = balancesheetgroupid;
		this.balancesheetgroup = balancesheetgroup;
		this.creditamount = creditamount;
		this.debitamount = debitamount;
	}

	public TrailBalanceGroupWiseDetails() {}
	
}
