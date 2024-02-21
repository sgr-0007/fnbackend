package com.fna.model;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity

public class Department {
	@Id
	private int officenameid;
	@Column(name = "officename")
	private String officename;
	@Column(name="departmentdescription")
	private String Departmentdescription;
	private boolean isactive;
	private int createdby;
	@Column(name = "createddate",updatable = true)
	  @CreationTimestamp
	  private Date Createddate;
	private int modifiedby;
	@Column(name = "modieddate",updatable = true)
	  @CreationTimestamp
	  private Date Modieddate
	  ;
	public int getOfficenameid() {
		return officenameid;
	}
	public void setOfficenameid(int officenameid) {
		this.officenameid = officenameid;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public String getDepartmentdescription() {
		return Departmentdescription;
	}
	public void setDepartmentdescription(String departmentdescription) {
		Departmentdescription = departmentdescription;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public int getCreatedby() {
		return createdby;
	}
	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return Createddate;
	}
	public void setCreateddate(Date createddate) {
		Createddate = createddate;
	}
	public int getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModieddate() {
		return Modieddate;
	}
	public void setModieddate(Date modieddate) {
		Modieddate = modieddate;
	}
	
	
}