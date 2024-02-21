package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="drolemodule")
public class DefaultRoleModule {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int rmid;
	private int roleid;
	private int moduleid;
	private Date createddate;
	public int getRmid() {
		return rmid;
	}
	public void setRmid(int rmid) {
		this.rmid = rmid;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	
	
	
}
