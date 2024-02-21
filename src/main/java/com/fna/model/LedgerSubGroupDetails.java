package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LedgerSubGroupDetails {

	@Id
	@Column(name = "subgroupid")
	int subgroupId;
	@Column(name = "subgroupname")
	String subgroupName;
	public int getSubgroupId() {
		return subgroupId;
	}
	public void setSubgroupId(int subgroupId) {
		this.subgroupId = subgroupId;
	}
	public String getSubgroupName() {
		return subgroupName;
	}
	public void setSubgroupName(String subgroupName) {
		this.subgroupName = subgroupName;
	}
	public LedgerSubGroupDetails(int subgroupId, String subgroupName) {
		super();
		this.subgroupId = subgroupId;
		this.subgroupName = subgroupName;
	}
	public LedgerSubGroupDetails()
	{
		
	}
	@Override
	public String toString() {
		return "LedgerSubGroupDetails [subgroupId=" + subgroupId + ", subgroupName=" + subgroupName + "]";
	}
	
	
}
