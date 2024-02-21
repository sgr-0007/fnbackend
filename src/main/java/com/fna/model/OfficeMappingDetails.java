package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cashbankofficemapping")
public class OfficeMappingDetails {

	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
		private int cashbankofficemappingid;
	private int officeid;
	private int cashledgerofofficeid;
	private int bankledgerofofficeid;
	private int cgstledgerofofficeid;
	private int sgstledgerofofficeid;
	private int igstledgerofofficeid;
	private int tds;
	private int tcs;
	private int gsttds;
	public int getCashbankofficemappingid() {
		return cashbankofficemappingid;
	}
	public void setCashbankofficemappingid(int cashbankofficemappingid) {
		this.cashbankofficemappingid = cashbankofficemappingid;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public int getCashledgerofofficeid() {
		return cashledgerofofficeid;
	}
	public void setCashledgerofofficeid(int cashledgerofofficeid) {
		this.cashledgerofofficeid = cashledgerofofficeid;
	}
	public int getBankledgerofofficeid() {
		return bankledgerofofficeid;
	}
	public void setBankledgerofofficeid(int bankledgerofofficeid) {
		this.bankledgerofofficeid = bankledgerofofficeid;
	}
	public int getCgstledgerofofficeid() {
		return cgstledgerofofficeid;
	}
	public void setCgstledgerofofficeid(int cgstledgerofofficeid) {
		this.cgstledgerofofficeid = cgstledgerofofficeid;
	}
	public int getSgstledgerofofficeid() {
		return sgstledgerofofficeid;
	}
	public void setSgstledgerofofficeid(int sgstledgerofofficeid) {
		this.sgstledgerofofficeid = sgstledgerofofficeid;
	}
	public int getIgstledgerofofficeid() {
		return igstledgerofofficeid;
	}
	public void setIgstledgerofofficeid(int igstledgerofofficeid) {
		this.igstledgerofofficeid = igstledgerofofficeid;
	}
	public int getTds() {
		return tds;
	}
	public void setTds(int tds) {
		this.tds = tds;
	}
	public int getTcs() {
		return tcs;
	}
	public void setTcs(int tcs) {
		this.tcs = tcs;
	}
	public int getGsttds() {
		return gsttds;
	}
	public void setGsttds(int gsttds) {
		this.gsttds = gsttds;
	}
	
	
}
