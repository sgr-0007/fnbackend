package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "voucherdetails")
public class VoucherDetails {
	
	@Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
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

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	public Integer getBranchid() {
		return branchid;
	}

	public void setBranchid(Integer branchid) {
		this.branchid = branchid;
	}

	public int getVoucherseq() {
		return voucherseq;
	}

	public void setVoucherseq(int voucherseq) {
		this.voucherseq = voucherseq;
	}

	public String getHsnsaccode() {
		return hsnsaccode;
	}

	public void setHsnsaccode(String hsnsaccode) {
		this.hsnsaccode = hsnsaccode;
	}

	public Integer getHsnsacid() {
		return hsnsacid;
	}

	public void setHsnsacid(Integer hsnsacid) {
		this.hsnsacid = hsnsacid;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
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

	
	public VoucherDetails(int voucherdetailid, int voucherid, Integer creditledger, Double creditamount,
			Integer debitledger, Double debitamount, String ledgeralias, String vouchernumber, Date voucherdate,
			String vouchertypename) {
		super();
		this.voucherdetailid = voucherdetailid;
		this.voucherid = voucherid;
		this.creditledger = creditledger;
		this.creditamount = creditamount;
		this.debitledger = debitledger;
		this.debitamount = debitamount;
		this.ledgeralias = ledgeralias;
		this.vouchernumber = vouchernumber;
		this.voucherdate = voucherdate;
		this.vouchertypename = vouchertypename;
	}

	public VoucherDetails() {
	
	}

	@Override
	public String toString() {
		return "VoucherDetails [voucherdetailid=" + voucherdetailid + ", voucherid=" + voucherid + ", creditledger="
				+ creditledger + ", creditamount=" + creditamount + ", debitledger=" + debitledger + ", debitamount="
				+ debitamount + ", ledgeralias=" + ledgeralias + ", vouchernumber=" + vouchernumber + ", voucherdate="
				+ voucherdate + ", vouchertypename=" + vouchertypename + "]";
	}

	
	  
	  
}
