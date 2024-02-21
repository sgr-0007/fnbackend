package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SubLedgerView {
	 @Id
	  private int subledgerid;
	  private String ledgername;
	  private String subledgername;
	  private String subgroupname;
	  private String groupname;
	  private Integer ledgerid;

	public Integer getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(Integer ledgerid) {
		this.ledgerid = ledgerid;
	}
	public int getSubledgerid() {
		return subledgerid;
	}
	public void setSubledgerid(int subledgerid) {
		this.subledgerid = subledgerid;
	}
	public String getLedgername() {
		return ledgername;
	}
	public void setLedgername(String ledgername) {
		this.ledgername = ledgername;
	}
	public String getSubledgername() {
		return subledgername;
	}
	public void setSubledgername(String subledgername) {
		this.subledgername = subledgername;
	}
	public String getSubgroupname() {
		return subgroupname;
	}
	public void setSubgroupname(String subgroupname) {
		this.subgroupname = subgroupname;
	}
	public String getGroupname() {
		return groupname;
	}
	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}

}
