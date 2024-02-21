package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoucherPettyCashView {

	  @Id
	  private int voucherdetailid;
	  private int voucherid;
	  private Boolean enclosures;
	  private String vouchernumber;
	  private Date voucherdate;
	  private String ledgeralias;
	  private String subledgername;
	  private Double amount;
	  private String narration;
	  private Boolean submit;
	  private String statuspetty;
	  private Integer statusid;
	  private Integer companyid;
	  
	public Integer getStatusid() {
		return statusid;
	}
	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}
	public int getVoucherdetailid() {
		return voucherdetailid;
	}
	public void setVoucherdetailid(int voucherdetailid) {
		this.voucherdetailid = voucherdetailid;
	}
	public int getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(int voucherid) {
		this.voucherid = voucherid;
	}
	public Boolean getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(Boolean enclosures) {
		this.enclosures = enclosures;
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
	public String getLedgeralias() {
		return ledgeralias;
	}
	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
	}
	public String getSubledgername() {
		return subledgername;
	}
	public void setSubledgername(String subledgername) {
		this.subledgername = subledgername;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
	public String getNarration() {
		return narration;
	}
	public void setNarration(String narration) {
		this.narration = narration;
	}
	public Boolean getSubmit() {
		return submit;
	}
	public void setSubmit(Boolean submit) {
		this.submit = submit;
	}
	public String getStatuspetty() {
		return statuspetty;
	}
	public void setStatuspetty(String statuspetty) {
		this.statuspetty = statuspetty;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	} 

	  
	  

}
