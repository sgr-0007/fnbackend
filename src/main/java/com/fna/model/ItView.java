package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItView {

	
	@Id
	int vgstdetailsid;
	String panno;
	Integer voucherid;
	Integer netamount;
	Integer grossamount;
	String ledgeralias;
	String returnname;
	String sectionname;
	public int getVgstdetailsid() {
		return vgstdetailsid;
	}
	public void setVgstdetailsid(int vgstdetailsid) {
		this.vgstdetailsid = vgstdetailsid;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public Integer getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}
	public Integer getNetamount() {
		return netamount;
	}
	public void setNetamount(Integer netamount) {
		this.netamount = netamount;
	}
	public Integer getGrossamount() {
		return grossamount;
	}
	public void setGrossamount(Integer grossamount) {
		this.grossamount = grossamount;
	}
	public String getLedgeralias() {
		return ledgeralias;
	}
	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
	}
	public String getReturnname() {
		return returnname;
	}
	public void setReturnname(String returnname) {
		this.returnname = returnname;
	}
	public String getSectionname() {
		return sectionname;
	}
	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}

}
