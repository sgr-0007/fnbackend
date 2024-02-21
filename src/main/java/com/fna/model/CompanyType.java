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

@Table(name = "companttype")
public class CompanyType {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int companytype;
	@Column(name = "companytypename")
	private String companytypename;
	@Column(name = "companytypedescription")
	private String companytypedescription;
	private boolean isactive;
	private int createdby;
	 @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "midifieddate",updatable = true)
	  @CreationTimestamp
	  private Date midifieddate;
	private int modifiedby;
	


	public int getCompanytype() {
		return companytype;
	}
	public void setCompanytype(int companytype) {
		this.companytype = companytype;
	}
	public String getCompanytypename() {
		return companytypename;
	}
	public void setCompanytypename(String companytypename) {
		this.companytypename = companytypename;
	}
	public String getCompanytypedescription() {
		return companytypedescription;
	}
	public void setCompanytypedescription(String companytypedescription) {
		this.companytypedescription = companytypedescription;
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
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Date getMidifieddate() {
		return midifieddate;
	}
	public void setMidifieddate(Date midifieddate) {
		this.midifieddate = midifieddate;
	}
	public int getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}
	@Override
	public String toString() {
		return "CompanyType [companytype=" + companytype + ", companytypename=" + companytypename
				+ ", companytypedescription=" + companytypedescription + ", isactive=" + isactive + ", createdby="
				+ createdby + ", createddate=" + createddate + ", midifieddate=" + midifieddate + ", modifiedby="
				+ modifiedby + "]";
	}
	public CompanyType(int companytype, String companytypename, String companytypedescription, boolean isactive,
			int createdby, Date createddate, Date midifieddate, int modifiedby) {
		
		this.companytype = companytype;
		this.companytypename = companytypename;
		this.companytypedescription = companytypedescription;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createddate = createddate;
		this.midifieddate = midifieddate;
		this.modifiedby = modifiedby;
	}
	public CompanyType()
	{
		
	}
}
