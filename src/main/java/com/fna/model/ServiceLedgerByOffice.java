package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "serviceledgermapping")
public class ServiceLedgerByOffice {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int sid;
	private Integer officeid;
	private Integer sledgerid;
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public Integer getOfficeid() {
		return officeid;
	}
	public void setOfficeid(Integer officeid) {
		this.officeid = officeid;
	}
	public Integer getSledgerid() {
		return sledgerid;
	}
	public void setSledgerid(Integer sledgerid) {
		this.sledgerid = sledgerid;
	}
	
	
	
}
