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

@Table(name = "designationmaster")

public class Designation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int designationid;
	@Column(name = "designationname")
	private String Designationname;
	@Column(name="designationdescription")
	private String Designationdescription;
	private boolean isactive;
	private int createdby;
	  @Column(name = "createddate",updatable = true)
	  @CreationTimestamp
	  private Date Createddate;
	  private int modifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date Modifieddate;
	public int getDesignationid() {
		return designationid;
	}
	public void setDesignationid(int designationid) {
		this.designationid = designationid;
	}
	public String getDesignationname() {
		return Designationname;
	}
	public void setDesignationname(String designationname) {
		Designationname = designationname;
	}
	public String getDesignationdescription() {
		return Designationdescription;
	}
	public void setDesignationdescription(String designationdescription) {
		Designationdescription = designationdescription;
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
		return "Designation [designationid=" + designationid + ", Designationname=" + Designationname
				+ ", Designationdescription=" + Designationdescription + ", isactive=" + isactive + ", createdby="
				+ createdby + ", Createddate=" + Createddate + ", modifiedby=" + modifiedby + ", Modifieddate="
				+ Modifieddate + "]";
	}
	public Designation(int designationid, String designationname, String designationdescription, boolean isactive,
			int createdby, Date createddate, int modifiedby, Date modifieddate) {
		super();
		this.designationid = designationid;
		Designationname = designationname;
		Designationdescription = designationdescription;
		this.isactive = isactive;
		this.createdby = createdby;
		Createddate = createddate;
		this.modifiedby = modifiedby;
		Modifieddate = modifieddate;
	}
	public Designation() {
		super();
	}
	

}
