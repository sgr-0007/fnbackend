package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "ledgeropeningtemp")
public class Ledgeropeningtemp {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int loid;
	 @Column(name = "ledgerid")
	  private Integer ledgerid;
	 
	 @Column(name = "ledgername")
	  private String ledgername;
	 @Column(name = "openingbalance")
	  private Double openingbalance;
	 @Column(name = "subledgername")
	  private String subledgername;
	  private String companyname;

	  private Integer companyid;

	  
	  private Date createddate;

	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public int getLoid() {
		return loid;
	}
	public void setLoid(int loid) {
		this.loid = loid;
	}
	public Integer getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(Integer ledgerid) {
		this.ledgerid = ledgerid;
	}
	public Double getOpeningbalance() {
		return openingbalance;
	}
	public void setOpeningbalance(Double openingbalance) {
		this.openingbalance = openingbalance;
	}
	public String getLedgername() {
		return ledgername;
	}
	public void setLedgername(String ledgername) {
		this.ledgername = ledgername;
	}
	public String getSubledgername() {
		return subledgername;
	}
	public void setSubledgername(String subledgername) {
		this.subledgername = subledgername;
	}
	 
	 
}
