package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "branchinfavourdetails")
public class BranchInfavourDetails {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int branchdetailsid;	
	private String apfname;
	private String acctype;
	private String infavourof;
	private String place;
	private String bank;
	private String ifsc;
	private String accno;
	public int getBranchdetailsid() {
		return branchdetailsid;
	}
	public void setBranchdetailsid(int branchdetailsid) {
		this.branchdetailsid = branchdetailsid;
	}
	public String getApfname() {
		return apfname;
	}
	public void setApfname(String apfname) {
		this.apfname = apfname;
	}
	public String getAcctype() {
		return acctype;
	}
	public void setAcctype(String acctype) {
		this.acctype = acctype;
	}
	public String getInfavourof() {
		return infavourof;
	}
	public void setInfavourof(String infavourof) {
		this.infavourof = infavourof;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	
	
}
