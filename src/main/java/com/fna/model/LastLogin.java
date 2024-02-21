package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name="lastlogindetails")
public class LastLogin {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int loginid;
	@CreationTimestamp
	private Date logindate;
	private int userid;
	@CreationTimestamp
	private Date creationdate;
	public int getLoginid() {
		return loginid;
	}
	public void setLoginid(int loginid) {
		this.loginid = loginid;
	}
	public Date getLogindate() {
		return logindate;
	}
	public void setLogindate(Date logindate) {
		this.logindate = logindate;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public Date getCreationdate() {
		return creationdate;
	}
	public void setCreationdate(Date creationdate) {
		this.creationdate = creationdate;
	}
	
	
	
}
