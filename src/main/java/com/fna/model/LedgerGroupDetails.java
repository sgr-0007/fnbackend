package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class LedgerGroupDetails {

	@Id
	@Column(name = "groupid")
	int groupId;
	@Column(name = "groupname")
	String groupName;
	public int getGroupId() {
		return groupId;
	}
	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public LedgerGroupDetails(int groupId, String groupName) {
		
		this.groupId = groupId;
		this.groupName = groupName;
	}
	public LedgerGroupDetails()
	{
		
		
	}
	@Override
	public String toString() {
		return "LedgerGroupDetails [groupId=" + groupId + ", groupName=" + groupName + "]";
	}
	
	
}
