package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cashbankofficemapping")
public class Ledgermapping {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="cashbankofficemappingid")
	private int cashofficeid;
	@Column(name="officeid")
	private int officeid;
	@Column(name="cashledgerofofficeid")
	private int cashid;
	@Column(name="bankledgerofofficeid")
	private int bankid;
	@Column(name="cgstledgerofofficeid")
	private int cgstid;
	@Column(name="sgstledgerofofficeid")
	private int sgstid;
	
	@Column(name="igstledgerofofficeid")
	private int igstid;

	private int tds;
	private int tcs;
	private int gsttds;
	
	
	private int gsttdsigst;
	private int gsttdssgst;
	private int gsttdscgst;


	public int getGsttdsigst() {
		return gsttdsigst;
	}

	public void setGsttdsigst(int gsttdsigst) {
		this.gsttdsigst = gsttdsigst;
	}

	public int getGsttdssgst() {
		return gsttdssgst;
	}

	public void setGsttdssgst(int gsttdssgst) {
		this.gsttdssgst = gsttdssgst;
	}

	public int getGsttdscgst() {
		return gsttdscgst;
	}

	public void setGsttdscgst(int gsttdscgst) {
		this.gsttdscgst = gsttdscgst;
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

	public int getCashofficeid() {
		return cashofficeid;
	}

	public void setCashofficeid(int cashofficeid) {
		this.cashofficeid = cashofficeid;
	}

	public int getOfficeid() {
		return officeid;
	}

	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}

	public int getCashid() {
		return cashid;
	}

	public void setCashid(int cashid) {
		this.cashid = cashid;
	}

	public int getBankid() {
		return bankid;
	}

	public void setBankid(int bankid) {
		this.bankid = bankid;
	}

	public int getCgstid() {
		return cgstid;
	}

	public void setCgstid(int cgstid) {
		this.cgstid = cgstid;
	}

	public int getSgstid() {
		return sgstid;
	}

	public void setSgstid(int sgstid) {
		this.sgstid = sgstid;
	}

	public int getIgstid() {
		return igstid;
	}

	public void setIgstid(int igstid) {
		this.igstid = igstid;
	}
	
	
}
