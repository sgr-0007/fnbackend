package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "paymentfailureupload")
public class PaymentFailure {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int frid;
	 private Double sno;
	 private String date;
	 private String ccode;
	 private String apfname;
	 private String apfaccno;
	 private String mode;
	 private Integer tbgrno; 
	 private String salenoteno;
	 private String growername;
	 private String groweraccno;
	 private String ifsccode;
	 private Double netamount;
	 private String paymentprocessfor;
	 private String paymentdate;
	 private String status;
	 private String ackno;
	 private String failureremarks;
	public Double getSno() {
		return sno;
	}
	public void setSno(Double sno) {
		this.sno = sno;
	}
	public int getFrid() {
		return frid;
	}
	public void setFrid(int frid) {
		this.frid = frid;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getCcode() {
		return ccode;
	}
	public void setCcode(String ccode) {
		this.ccode = ccode;
	}
	public String getApfname() {
		return apfname;
	}
	public void setApfname(String apfname) {
		this.apfname = apfname;
	}
	public String getApfaccno() {
		return apfaccno;
	}
	public void setApfaccno(String apfaccno) {
		this.apfaccno = apfaccno;
	}
	public String getMode() {
		return mode;
	}
	public void setMode(String mode) {
		this.mode = mode;
	}
	public Integer getTbgrno() {
		return tbgrno;
	}
	public void setTbgrno(Integer tbgrno) {
		this.tbgrno = tbgrno; 
	}
	public String getSalenoteno() {
		return salenoteno;
	}
	public void setSalenoteno(String salenoteno) {
		this.salenoteno = salenoteno;
	}
	public String getGrowername() {
		return growername;
	}
	public void setGrowername(String growername) {
		this.growername = growername;
	}
	public String getGroweraccno() {
		return groweraccno;
	}
	public void setGroweraccno(String groweraccno) {
		this.groweraccno = groweraccno;
	}
	public String getIfsccode() {
		return ifsccode;
	}
	public void setIfsccode(String ifsccode) {
		this.ifsccode = ifsccode;
	}
	public Double getNetamount() {
		return netamount;
	}
	public void setNetamount(Double netamount) {
		this.netamount = netamount;
	}
	public String getPaymentprocessfor() {
		return paymentprocessfor;
	}
	public void setPaymentprocessfor(String paymentprocessfor) {
		this.paymentprocessfor = paymentprocessfor;
	}
	public String getPaymentdate() {
		return paymentdate;
	}
	public void setPaymentdate(String paymentdate) {
		this.paymentdate = paymentdate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAckno() {
		return ackno;
	}
	public void setAckno(String ackno) {
		this.ackno = ackno;
	}
	public String getFailureremarks() {
		return failureremarks;
	}
	public void setFailureremarks(String failureremarks) {
		this.failureremarks = failureremarks;
	}
	 
	 
	 
	 
	 
	 
 
}
