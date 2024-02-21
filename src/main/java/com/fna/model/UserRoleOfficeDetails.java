package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRoleOfficeDetails {

	@Id
	int roleid;
	String rolename;
	String companyname;
	String designationname;
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
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public String getDesignationname() {
		return designationname;
	}
	public void setDesignationname(String designationname) {
		this.designationname = designationname;
	}
	
	
	
	
	
	
}
