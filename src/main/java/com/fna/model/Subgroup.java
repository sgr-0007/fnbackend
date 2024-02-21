package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import org.hibernate.annotations.CreationTimestamp;


@Entity

@Table(name = "subgroupmaster")
public class Subgroup {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int subgroupid;
	  @Column(name = "subgroupname")
	  private String subgroupname;
	  @Column(name = "subgroupcode")
	  private String subgroupcode;
	  @Column(name = "subgroupdescription")
	  private String subgroupdescription;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "groupid")
	  private int groupid;
	  @Column(name = "groupname")
	  private String groupname;
	  private int modifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  @Column(name = "balancesheetgroup")
	  private String balancesheetgroup;

	  
	  
			public int getSubgroupid() {
		return subgroupid;
	}



	public void setSubgroupid(int subgroupid) {
		this.subgroupid = subgroupid;
	}



	public String getSubgroupname() {
		return subgroupname;
	}



	public void setSubgroupname(String subgroupname) {
		this.subgroupname = subgroupname;
	}



	public String getSubgroupcode() {
		return subgroupcode;
	}



	public void setSubgroupcode(String subgroupcode) {
		this.subgroupcode = subgroupcode;
	}



	public String getSubgroupdescription() {
		return subgroupdescription;
	}



	public void setSubgroupdescription(String subgroupdescription) {
		this.subgroupdescription = subgroupdescription;
	}



	public boolean isIsactive() {
		return isactive;
	}



	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}



	public Date getCreateddate() {
		return createddate;
	}



	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}



	public int getGroupid() {
		return groupid;
	}



	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}



	public String getGroupname() {
		return groupname;
	}



	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}



	public int getModifiedby() {
		return modifiedby;
	}



	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}



	public Date getModifieddate() {
		return modifieddate;
	}



	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}



	public String getBalancesheetgroup() {
		return balancesheetgroup;
	}



	public void setBalancesheetgroup(String balancesheetgroup) {
		this.balancesheetgroup = balancesheetgroup;
	}



			@Override
	public String toString() {
		return "Subgroup [subgroupid=" + subgroupid + ", subgroupname=" + subgroupname + ", subgroupcode="
				+ subgroupcode + ", subgroupdescription=" + subgroupdescription + ", isactive=" + isactive
				+ ", createddate=" + createddate + ", groupid=" + groupid + ", groupname=" + groupname + ", modifiedby="
				+ modifiedby + ", modifieddate=" + modifieddate + ", balancesheetgroup=" + balancesheetgroup + "]";
	}



			public Subgroup(int subgroupid, String subgroupname, String subgroupcode, String subgroupdescription,
					boolean isactive, Date createddate, int groupid, String groupname, int modifiedby,
					Date modifieddate, String balancesheetgroup) {
				super();
				this.subgroupid = subgroupid;
				this.subgroupname = subgroupname;
				this.subgroupcode = subgroupcode;
				this.subgroupdescription = subgroupdescription;
				this.isactive = isactive;
				this.createddate = createddate;
				this.groupid = groupid;
				this.groupname = groupname;
				this.modifiedby = modifiedby;
				this.modifieddate = modifieddate;
				this.balancesheetgroup = balancesheetgroup;
			}



			public Subgroup() {
		
	}
	  
	

}
