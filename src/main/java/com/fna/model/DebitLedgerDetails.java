package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DebitLedgerDetails {

	
	@Id
	int debitledger;
	String drledgeralias;
	Integer companyid;
	Integer accounttypeid;
	Integer subgroupid;
	String gsttin;
	Integer companytype;
	String panno;
	String drledgername;

	public String getDrledgername() {
		return drledgername;
	}
	public void setDrledgername(String drledgername) {
		this.drledgername = drledgername;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public Integer getCompanytype() {
		return companytype;
	}
	public void setCompanytype(Integer companytype) {
		this.companytype = companytype;
	}
	public Integer getAccounttypeid() {
		return accounttypeid;
	}
	public void setAccounttypeid(Integer accounttypeid) {
		this.accounttypeid = accounttypeid;
	}
	public String getGsttin() {
		return gsttin;
	}
	public void setGsttin(String gsttin) {
		this.gsttin = gsttin;
	}
	public int getDebitledger() {
		return debitledger;
	}
	public void setDebitledger(int debitledger) {
		this.debitledger = debitledger;
	}
	public String getDrledgeralias() {
		return drledgeralias;
	}
	public void setDrledgeralias(String drledgeralias) {
		this.drledgeralias = drledgeralias;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public Integer getSubgroupid() {
		return subgroupid;
	}
	public void setSubgroupid(Integer subgroupid) {
		this.subgroupid = subgroupid;
	}
	
}
