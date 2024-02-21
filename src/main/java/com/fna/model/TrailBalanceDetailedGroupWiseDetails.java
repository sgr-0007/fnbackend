package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TrailBalanceDetailedGroupWiseDetails {
	@Id
	int voucherdetailid;
	int ledgerid;
	String ledgeralias;
	int balancesheetgroupid;
	String balancesheetgroup;	
	Double creditamount;
	Double debitamount;
	public int getVoucherdetailid() {
		return voucherdetailid;
	}
	public void setVoucherdetailid(int voucherdetailid) {
		this.voucherdetailid = voucherdetailid;
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
		return "TrailBalanceDetailedGroupWiseDetails [voucherdetailid=" + voucherdetailid + ", ledgerid=" + ledgerid
				+ ", ledgeralias=" + ledgeralias + ", balancesheetgroupid=" + balancesheetgroupid
				+ ", balancesheetgroup=" + balancesheetgroup + ", creditamount=" + creditamount + ", debitamount="
				+ debitamount + "]";
	}
	public TrailBalanceDetailedGroupWiseDetails(int voucherdetailid, int ledgerid, String ledgeralias,
			int balancesheetgroupid, String balancesheetgroup, Double creditamount, Double debitamount) {
		super();
		this.voucherdetailid = voucherdetailid;
		this.ledgerid = ledgerid;
		this.ledgeralias = ledgeralias;
		this.balancesheetgroupid = balancesheetgroupid;
		this.balancesheetgroup = balancesheetgroup;
		this.creditamount = creditamount;
		this.debitamount = debitamount;
	}
	public TrailBalanceDetailedGroupWiseDetails() {}
	
}
