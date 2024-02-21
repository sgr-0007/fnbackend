package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRoleMappingView {

	 @Id
	  private int rolemappingid;
	  @Column(name = "roleid")
	  private int roleid;
	  @Column(name = "userid")
	  private int userid;
	  @Column(name = "moduleid")
	  private int moduleid;
	public int getRolemappingid() {
		return rolemappingid;
	}
	public void setRolemappingid(int rolemappingid) {
		this.rolemappingid = rolemappingid;
	}
	public int getRoleid() {
		return roleid;
	}
	public void setRoleid(int roleid) {
		this.roleid = roleid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getModuleid() {
		return moduleid;
	}
	public void setModuleid(int moduleid) {
		this.moduleid = moduleid;
	}
	  
	  
	
}
