package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoucherReportView {
	
	
@Id
private int voucherid;
private String vouchernumber;
private Date voucherdate;
private String vouchertypename;
public int getVoucherid() {
	return voucherid;
}
public void setVoucherid(int voucherid) {
	this.voucherid = voucherid;
}
public String getVouchernumber() {
	return vouchernumber;
}
public void setVouchernumber(String vouchernumber) {
	this.vouchernumber = vouchernumber;
}
public Date getVoucherdate() {
	return voucherdate;
}
public void setVoucherdate(Date voucherdate) {
	this.voucherdate = voucherdate;
}
public String getVouchertypename() {
	return vouchertypename;
}
public void setVouchertypename(String vouchertypename) {
	this.vouchertypename = vouchertypename;
}





}
