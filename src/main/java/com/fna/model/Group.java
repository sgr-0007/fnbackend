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

@Table(name = "groupmaster")
public  class Group {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int groupid;
	  @Column(name = "groupcode")
	  private String groupcode;
	  @Column(name = "groupname")
	  private String groupname;
	  @Column(name = "groupdescription")
	  private String groupdescription;
	  @Column(name = "balancesheetgroupid")
	  private Integer balancesheetgroupid;
	  @Column(name = "balancesheetgroup")
	  private String balancesheetgroup;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  
	  
		public int getGroupid() {
		return groupid;
	}


	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}


	public String getGroupcode() {
		return groupcode;
	}


	public void setGroupcode(String groupcode) {
		this.groupcode = groupcode;
	}


	public String getGroupname() {
		return groupname;
	}


	public void setGroupname(String groupname) {
		this.groupname = groupname;
	}


	public String getGroupdescription() {
		return groupdescription;
	}


	public void setGroupdescription(String groupdescription) {
		this.groupdescription = groupdescription;
	}


	public Integer getBalancesheetgroupid() {
		return balancesheetgroupid;
	}


	public void setBalancesheetgroupid(Integer balancesheetgroupid) {
		this.balancesheetgroupid = balancesheetgroupid;
	}


	public String getBalancesheetgroup() {
		return balancesheetgroup;
	}


	public void setBalancesheetgroup(String balancesheetgroup) {
		this.balancesheetgroup = balancesheetgroup;
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


	public Date getModifieddate() {
		return modifieddate;
	}


	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}


		@Override
	public String toString() {
		return "Group [groupid=" + groupid + ", groupcode=" + groupcode + ", groupname=" + groupname
				+ ", groupdescription=" + groupdescription + ", balancesheetgroupid=" + balancesheetgroupid
				+ ", balancesheetgroup=" + balancesheetgroup + ", isactive=" + isactive + ", createddate=" + createddate
				+ ", modifieddate=" + modifieddate + "]";
	}


		public Group(int groupid, String groupcode, String groupname, String groupdescription,
				Integer balancesheetgroupid, String balancesheetgroup, boolean isactive, Date createddate,
				Date modifieddate) {
			super();
			this.groupid = groupid;
			this.groupcode = groupcode;
			this.groupname = groupname;
			this.groupdescription = groupdescription;
			this.balancesheetgroupid = balancesheetgroupid;
			this.balancesheetgroup = balancesheetgroup;
			this.isactive = isactive;
			this.createddate = createddate;
			this.modifieddate = modifieddate;
		}


		public Group() {	
		
	}
	

}
