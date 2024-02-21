package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "balancesheetgroup")
public class BalanceSheetGroup {

	@Id
	  private int balancesheetgroupid;
	  @Column(name = "balancesheetgroup")
	  private String balancesheetgroup;
	  @Column(name = "balancesheetgroupdescription")
	  private String balancesheetgroupdescription;
	  @Column(name = "debitside")
	  private String debitside;
	  @Column(name = "creditside")
	  private String creditside;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	
	  
	public int getBalancesheetgroupid() {
		return balancesheetgroupid;
	}


	public void setBalancesheetgroupid(int balancesheetgroupid) {
		this.balancesheetgroupid = balancesheetgroupid;
	}


	public String getBalancesheetgroup() {
		return balancesheetgroup;
	}


	public void setBalancesheetgroup(String balancesheetgroup) {
		this.balancesheetgroup = balancesheetgroup;
	}


	public String getBalancesheetgroupdescription() {
		return balancesheetgroupdescription;
	}


	public void setBalancesheetgroupdescription(String balancesheetgroupdescription) {
		this.balancesheetgroupdescription = balancesheetgroupdescription;
	}


	public String getDebitside() {
		return debitside;
	}


	public void setDebitside(String debitside) {
		this.debitside = debitside;
	}


	public String getCreditside() {
		return creditside;
	}


	public void setCreditside(String creditside) {
		this.creditside = creditside;
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


	public BalanceSheetGroup(int balancesheetgroupid, String balancesheetgroup, String balancesheetgroupdescription,
			String debitside, String creditside, boolean isactive, Date createddate, Date modifieddate) {
	
		this.balancesheetgroupid = balancesheetgroupid;
		this.balancesheetgroup = balancesheetgroup;
		this.balancesheetgroupdescription = balancesheetgroupdescription;
		this.debitside = debitside;
		this.creditside = creditside;
		this.isactive = isactive;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
	}


	@Override
	public String toString() {
		return "BalanceSheetGroup [balancesheetgroupid=" + balancesheetgroupid + ", balancesheetgroup="
				+ balancesheetgroup + ", balancesheetgroupdescription=" + balancesheetgroupdescription + ", debitside="
				+ debitside + ", creditside=" + creditside + ", isactive=" + isactive + ", createddate=" + createddate
				+ ", modifieddate=" + modifieddate + "]";
	}


	public BalanceSheetGroup() {
		// TODO Auto-generated constructor stub
	}

}
