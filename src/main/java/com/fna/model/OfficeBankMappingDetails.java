package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cashbankoffice")
public class OfficeBankMappingDetails {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cashbankid;
	private Integer officeid;
	private Integer cashid;
	private Integer bankid;
	
	public int getCashbankid() {
		return cashbankid;
	}
	public void setCashbankid(int cashbankid) {
		this.cashbankid = cashbankid;
	}
	public Integer getOfficeid() {
		return officeid;
	}
	public void setOfficeid(Integer officeid) {
		this.officeid = officeid;
	}
	public Integer getCashid() {
		return cashid;
	}
	public void setCashid(Integer cashid) {
		this.cashid = cashid;
	}
	public Integer getBankid() {
		return bankid;
	}
	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}
	@Override
	public String toString() {
		return "OfficeBankMappingDetails [cashbankid=" + cashbankid + ", officeid=" + officeid + ", cashid=" + cashid
				+ ", bankid=" + bankid + "]";
	}
	
	
	
	
}
