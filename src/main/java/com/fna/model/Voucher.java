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
@Table(name = "voucher")
public class Voucher {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int voucherid;
	 
	  @Column(name = "companyid")	  
	  private int companyid;
	  
	  @Column(name = "companyname")	  
	  private String companyname;
	 
	  @Column(name = "vouchernumber")
	  private String vouchernumber;
	  
	  @Column(name = "voucherdate")
	  private Date voucherdate;
	  
	  @Column(name = "vouchertypeid")
	  private Integer vouchertypeid;
	  
	  @Column(name = "vouchertypename")
	  private String vouchertypename;
	  
	  @Column(name = "totaldebitamount")	  
	  private Double totaldebitamount;
	  
	  @Column(name = "totalcreditamount")	  
	  private Double totalcreditamount; 
	  
	  @Column(name = "narration")	  
	  private String narration;
	  
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  
	  @Column(name = "createdby")	  
	  private Integer createdby; 
	  
	  @Column(name = "vouchercheckedby")	  
	  private Integer vouchercheckedby; 
	
	  
	  @Column(name = "voucherapprovedby")	  
	  private Integer voucherapprovedby; 
	  
	  @Column(name = "statusid")	  
	  private Integer statusid;   
	  
	@Column(name = "vouchercheckeddate",updatable = true)
	  @CreationTimestamp
	  private Date vouchercheckeddate;
	  
	  @Column(name = "voucherapproveddate",updatable = true)
	  @CreationTimestamp
	  private Date voucherapproveddate;
	  
	  @Column(name = "invoiceno")	  
	  private String invoiceNo; 
	  
	  private Integer accounttypeid;
	  
	  private String remarks;

	  public String getRemarks() {
			return remarks;
		}

		public void setRemarks(String remarks) {
			this.remarks = remarks;
		}
	
	public Integer getAccounttypeid() {
		return accounttypeid;
	}

	public void setAccounttypeid(Integer accounttypeid) {
		this.accounttypeid = accounttypeid;
	}

	public Integer getCreatedby() {
		return createdby;
	}

	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}

	public Integer getVouchercheckedby() {
		return vouchercheckedby;
	}

	public void setVouchercheckedby(Integer vouchercheckedby) {
		this.vouchercheckedby = vouchercheckedby;
	}

	public Integer getVoucherapprovedby() {
		return voucherapprovedby;
	}

	public void setVoucherapprovedby(Integer voucherapprovedby) {
		this.voucherapprovedby = voucherapprovedby;
	}

	public Integer getStatusid() {
		return statusid;
	}

	public void setStatusid(Integer statusid) {
		this.statusid = statusid;
	}

	public Date getVouchercheckeddate() {
		return vouchercheckeddate;
	}

	public void setVouchercheckeddate(Date vouchercheckeddate) {
		this.vouchercheckeddate = vouchercheckeddate;
	}

	public Date getVoucherapproveddate() {
		return voucherapproveddate;
	}

	public void setVoucherapproveddate(Date voucherapproveddate) {
		this.voucherapproveddate = voucherapproveddate;
	}

	public int getVoucherid() {
		return voucherid;
	}

	public void setVoucherid(int voucherid) {
		this.voucherid = voucherid;
	}

	public int getCompanyid() {
		return companyid;
	}

	public void setCompanyid(int companyid) {
		this.companyid = companyid;
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

	public Integer getVouchertypeid() {
		return vouchertypeid;
	}

	public void setVouchertypeid(Integer vouchertype) {
		this.vouchertypeid = vouchertype;
	}

	public Double getTotaldebitamount() {
		return totaldebitamount;
	}

	public void setTotaldebitamount(Double totaldebitamount) {
		this.totaldebitamount = totaldebitamount;
	}

	public Double getTotalcreditamount() {
		return totalcreditamount;
	}

	public void setTotalcreditamount(Double totalcreditamount) {
		this.totalcreditamount = totalcreditamount;
	}

	public String getNarration() {
		return narration;
	}

	public void setNarration(String narration) {
		this.narration = narration;
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

	public String getCompanyname() {
		return companyname;
	}

	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}

	

	public String getInvoiceNo() {
		return invoiceNo;
	}

	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}

	public String getVouchertypename() {
		return vouchertypename;
	}

	public void setVouchertypename(String vouchertypename) {
		this.vouchertypename = vouchertypename;
	}

	public Voucher(int voucherid, int companyid,String companyname, String vouchernumber, Date voucherdate, Integer vouchertypeid,String vouchertypename,
			Double totaldebitamount, Double totalcreditamount, String narration, Date createddate, Date modifieddate) {
		
		this.voucherid = voucherid;
		this.companyid = companyid;
		this.companyname = companyname;
		this.vouchernumber = vouchernumber;
		this.voucherdate = voucherdate;
		this.vouchertypeid = vouchertypeid;
		this.vouchertypename = vouchertypename;
		this.totaldebitamount = totaldebitamount;
		this.totalcreditamount = totalcreditamount;
		this.narration = narration;
		this.createddate = createddate;
		this.modifieddate = modifieddate;
	}
	public Voucher() {
		
	}

	@Override
	public String toString() {
		return "Voucher [voucherid=" + voucherid + ", companyid=" + companyid + ", companyname=" + companyname
				+ ", vouchernumber=" + vouchernumber + ", voucherdate=" + voucherdate + ", vouchertypeid="
				+ vouchertypeid + ", vouchertypename=" + vouchertypename + ", totaldebitamount=" + totaldebitamount
				+ ", totalcreditamount=" + totalcreditamount + ", narration=" + narration + ", createddate="
				+ createddate + ", modifieddate=" + modifieddate + "]";
	}

	  
	  
	  

}
