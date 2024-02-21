package com.fna.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class itBuyerVendorLedger {

	@Id
	private int itbvledgerid;
	private int voucherid; 
	private String itbvledgeralias;
	private Integer sectionid;
	private String sectionname;
	private Integer returnid;
	private String returnname;
	private Integer grossamount;
	private Integer tdsrate;
	private Integer tds;
	private Integer netamount;
	public int getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(int voucherid) {
		this.voucherid = voucherid;
	}
	public int getItbvledgerid() {
		return itbvledgerid;
	}
	public void setItbvledgerid(int itbvledgerid) {
		this.itbvledgerid = itbvledgerid;
	}
	public String getItbvledgeralias() {
		return itbvledgeralias;
	}
	public void setItbvledgeralias(String itbvledgeralias) {
		this.itbvledgeralias = itbvledgeralias;
	}
	public Integer getSectionid() {
		return sectionid;
	}
	public void setSectionid(Integer sectionid) {
		this.sectionid = sectionid;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}
	public Integer getReturnid() {
		return returnid;
	}
	public void setReturnid(Integer returnid) {
		this.returnid = returnid;
	}
	public String getReturnname() {
		return returnname;
	}
	public void setReturnname(String returnname) {
		this.returnname = returnname;
	}
	public Integer getGrossamount() {
		return grossamount;
	}
	public void setGrossamount(Integer grossamount) {
		this.grossamount = grossamount;
	}
	public Integer getTdsrate() {
		return tdsrate;
	}
	public void setTdsrate(Integer tdsrate) {
		this.tdsrate = tdsrate;
	}
	public Integer getTds() {
		return tds;
	}
	public void setTds(Integer tds) {
		this.tds = tds;
	}
	public Integer getNetamount() {
		return netamount;
	}
	public void setNetamount(Integer netamount) {
		this.netamount = netamount;
	}
	public itBuyerVendorLedger(int itbvledgerid, int voucherid, String itbvledgeralias, Integer sectionid,
			String sectionname, Integer returnid, String returnname, Integer grossamount, Integer tdsrate, Integer tds,
			Integer netamount) {
		super();
		this.itbvledgerid = itbvledgerid;
		this.voucherid = voucherid;
		this.itbvledgeralias = itbvledgeralias;
		this.sectionid = sectionid;
		this.sectionname = sectionname;
		this.returnid = returnid;
		this.returnname = returnname;
		this.grossamount = grossamount;
		this.tdsrate = tdsrate;
		this.tds = tds;
		this.netamount = netamount;
	}
	public itBuyerVendorLedger() {
		
	}
	
}
