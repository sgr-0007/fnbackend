package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VoucherDetailsPaymentMode {

	@Id
	  private int voucherdetailid;
	 
	  @Column(name = "voucherid")	  
	  private int voucherid; 
	 
	  @Column(name = "voucherseq")	  
	  private int voucherseq; 
	  
	  @Column(name = "creditledger")
	  private Integer creditledger;
	  
	  @Column(name = "creditamount")	  
	  private Double creditamount;
	  
	  @Column(name = "debitledger")	  
	  private Integer debitledger;
	  
	  @Column(name = "debitamount")	  
	  private Double debitamount;
	  
	  @Column(name = "ledgeralias")	  
	  private String ledgeralias;
	  
	  private String vouchernumber;
	  private Date voucherdate;
	  private String vouchertypename;
	  
	  @Column(name = "narration")	  
	  private String narration; 
	  
	  
	  @Column(name = "hsnsacid")
	  private Integer hsnsacid;
	  @Column(name = "hsnsaccode")	  
	  private String hsnsaccode; 
	  
	  private Integer branchid;
	  private String companyname;

	  private Double rate;

	  @Column(name = "subledgerid")	  
	  private Integer subledgerid;
	  
	  @Column(name = "subledgername")	  
	  private String subledgername;
	  
	  @Column(name = "flag")	  
	  private String flag;

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

	public int getVoucherseq() {
		return voucherseq;
	}

	public void setVoucherseq(int voucherseq) {
		this.voucherseq = voucherseq;
	}

	public Integer getCreditledger() {
		return creditledger;
	}

	public void setCreditledger(Integer creditledger) {
		this.creditledger = creditledger;
	}

	public Double getCreditamount() {
		return creditamount;
	}

	public void setCreditamount(Double creditamount) {
		this.creditamount = creditamount;
	}

	public Integer getDebitledger() {
		return debitledger;
	}

	public void setDebitledger(Integer debitledger) {
		this.debitledger = debitledger;
	}

	public Double getDebitamount() {
		return debitamount;
	}

	public void setDebitamount(Double debitamount) {
		this.debitamount = debitamount;
	}

	public String getLedgeralias() {
		return ledgeralias;
	}

	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
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

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
	}

	public Integer getHsnsacid() {
		return hsnsacid;
	}

	public void setHsnsacid(Integer hsnsacid) {
		this.hsnsacid = hsnsacid;
	}

	public String getHsnsaccode() {
		return hsnsaccode;
	}

	public void setHsnsaccode(String hsnsaccode) {
		this.hsnsaccode = hsnsaccode;
	}

	public Integer getBranchid() {
		return branchid;
	}

	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Integer getSubledgerid() {
		return subledgerid;
	}

	public void setSubledgerid(Integer subledgerid) {
		this.subledgerid = subledgerid;
	}

	public String getSubledgername() {
		return subledgername;
	}

	public void setSubledgername(String subledgername) {
		this.subledgername = subledgername;
	}

	public String getFlag() {
		return flag;
	}

	public void setFlag(String flag) {
		this.flag = flag;
	}
	  
}
