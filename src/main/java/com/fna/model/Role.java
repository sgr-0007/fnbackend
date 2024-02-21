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
@Table(name = "rolemaster")
public class Role {
	
	 @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int roleid;
	  @Column(name = "rolename")
	  private String rolename;
	  @Column(name = "roledescription")
	  private String roledescription;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public String getRolename() {
		return rolename;
	}
	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	public String getRoledescription() {
		return roledescription;
	}
	public void setRoledescription(String roledescription) {
		this.roledescription = roledescription;
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
	public Role(int roleid, String rolename, String roledescription, boolean isactive, Date createddate,
			Date modifieddate) {
		
		this.roleid = roleid;
		this.rolename = rolename;
		this.roledescription = roledescription;
		this.isactive = isactive;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
	}
	public Role() {
		

	}
	@Override
	public String toString() {
		return "Role [roleid=" + roleid + ", rolename=" + rolename + ", roledescription=" + roledescription
				+ ", isactive=" + isactive + ", createddate=" + createddate + ", modifieddate=" + modifieddate + "]";
	}  
	

}
