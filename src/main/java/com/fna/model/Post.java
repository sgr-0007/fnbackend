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
@Table(name = "postmaster")


public class Post {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int postid;
	@Column(name = "postname")
	private String Postname;
	@Column(name = "postdescription")
	private String Postdescription;
	private boolean isactive;
	private int createdby;
	@Column(name = "createddate",updatable = true)
	  @CreationTimestamp
	  private Date Createddate;
	private int modifiedby;
	@Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date Modifieddate;
	public int getPostid() {
		return postid;
	}
	public void setPostid(int postid) {
		this.postid = postid;
	}
	public String getPostname() {
		return Postname;
	}
	public void setPostname(String postname) {
		Postname = postname;
	}
	public String getPostdescription() {
		return Postdescription;
	}
	public void setPostdescription(String postdescription) {
		Postdescription = postdescription;
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
	public Date getModifieddate() {
		return Modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		Modifieddate = modifieddate;
	}
	@Override
	public String toString() {
		return "Post [postid=" + postid + ", Postname=" + Postname + ", Postdescription=" + Postdescription
				+ ", isactive=" + isactive + ", createdby=" + createdby + ", Createddate=" + Createddate
				+ ", modifiedby=" + modifiedby + ", Modifieddate=" + Modifieddate + "]";
	}
	public Post(int postid, String postname, String postdescription, boolean isactive, int createdby, Date createddate,
			int modifiedby, Date modifieddate) {
		super();
		this.postid = postid;
		Postname = postname;
		Postdescription = postdescription;
		this.isactive = isactive;
		this.createdby = createdby;
		Createddate = createddate;
		this.modifiedby = modifiedby;
		Modifieddate = modifieddate;
	}
	public Post() {
		super();
	}
	

}
