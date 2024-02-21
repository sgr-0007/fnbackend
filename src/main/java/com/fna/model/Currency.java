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

@Table(name = "currencymaster")
public class Currency {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.AUTO)
	  private int currencyid;
	  @Column(name = "currencyname")
	  private String currencyname;
	  @Column(name = "currencydisplay")
	  private String currencydisplay;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "createdby")
	  private int createdby;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  @Column(name = "modifiedby")
	  private int modifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  
	public int getCurrencyid() {
		return currencyid;
	}
	public void setCurrencyid(int currencyid) {
		this.currencyid = currencyid;
	}
	public String getCurrencyname() {
		return currencyname;
	}
	public void setCurrencyname(String currencyname) {
		this.currencyname = currencyname;
	}
	public String getCurrencydisplay() {
		return currencydisplay;
	}
	public void setCurrencydisplay(String currencydisplay) {
		this.currencydisplay = currencydisplay;
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
	public int getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	@Override
	public String toString() {
		return "Currency [currencyid=" + currencyid + ", currencyname=" + currencyname + ", currencydisplay="
				+ currencydisplay + ", isactive=" + isactive + ", createdby=" + createdby + ", createddate="
				+ createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate + "]";
	}
	public Currency(int currencyid, String currencyname, String currencydisplay, boolean isactive, int createdby,
			Date createddate, int modifiedby, Date modifieddate) {
		
		this.currencyid = currencyid;
		this.currencyname = currencyname;
		this.currencydisplay = currencydisplay;
		this.isactive = isactive;
		this.createdby = createdby;
		this.createddate = createddate;
		this.modifiedby = modifiedby;
		this.modifieddate = modifieddate;
	}
	
	public Currency() {
	
	}
	

}
