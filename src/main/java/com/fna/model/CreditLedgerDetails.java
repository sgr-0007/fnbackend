package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditLedgerDetails {

	
	@Id
	int creditledger;
	String crledgeralias;
	Integer companyid;
	Integer subgroupid;
	String gsttin;
	Integer accounttypeid;
	Integer companytype;
	String crledgername;

	public String getCrledgername() {
		return crledgername;
	}
	public void setCrledgername(String crledgername) {
		this.crledgername = crledgername;
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
	public int getCreditledger() {
		return creditledger;
	}
	public void setCreditledger(int creditledger) {
		this.creditledger = creditledger;
	}
	public String getCrledgeralias() {
		return crledgeralias;
	}
	public void setCrledgeralias(String crledgeralias) {
		this.crledgeralias = crledgeralias;
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
