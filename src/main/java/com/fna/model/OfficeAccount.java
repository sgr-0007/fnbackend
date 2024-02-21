package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class OfficeAccount {
	@Id
	@Column(name = "accounttypeid")
	int accounttypeid;
	@Column(name = "accounttype")
	String accounttype;
	public int getAccounttypeid() {
		return accounttypeid;
	}
	public void setAccounttypeid(int accounttypeid) {
		this.accounttypeid = accounttypeid;
	}
	public String getAccounttype() {
		return accounttype;
	}
	public void setAccounttype(String accounttype) {
		this.accounttype = accounttype;
	}
	public OfficeAccount(int accounttypeid, String accounttype) {
		super();
		this.accounttypeid = accounttypeid;
		this.accounttype = accounttype;
	}
	
	public OfficeAccount() {
	
	}
}
