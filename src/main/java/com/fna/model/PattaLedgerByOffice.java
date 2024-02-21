package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pattaledgermapping")
public class PattaLedgerByOffice {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int pid;
	private Integer officeid;
	private Integer pledgerid;
	private Integer bpattacharges;
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public Integer getOfficeid() {
		return officeid;
	}
	public void setOfficeid(Integer officeid) {
		this.officeid = officeid;
	}
	public Integer getPledgerid() {
		return pledgerid;
	}
	public void setPledgerid(Integer pledgerid) {
		this.pledgerid = pledgerid;
	}
	public Integer getBpattacharges() {
		return bpattacharges;
	}
	public void setBpattacharges(Integer bpattacharges) {
		this.bpattacharges = bpattacharges;
	}
	
	
	
}
