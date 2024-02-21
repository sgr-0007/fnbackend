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
@Table(name = "vouchergstitdetails")
public class VoucherGst {
	 @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int vgstdetailsid;
	  private Integer voucherid;
	  private Integer invoiceid;
	  private Integer gstbvledgerid;
	  private Double invoicevalue;
	  private Double taxablevalue;
	  private Double igstvalue;
	  private Double cgstvalue;
	  private Double sgstvalue;
	  private Double gsttdsigst;
	  private Double gsttdssgst;
	  private Double gsttdscgst;
      private Boolean supplyattract;
      private String gstbvgsttin; 
      private Integer itbvledgerid;
      private Integer sectionid;
      private Integer returnid;
      private Double grossamount;
	  private Double tds;
	  private Double netamount;
	  private String itbvgsttin;
	  private String invoicenumber;
	  private Integer headofaccount;
	  private Double rate;
	  private String place;
	  private String invtype;
	  private Double cess;
      private Integer transactionnumber;
      private String returnname;
      private String sectionname;
      private String panno;
      private String ledgeralias;
      private String naturetransac;
      private Double tdsremitted;
      private String challanno;
      private String challandate;
      private String nameofthebank;
      private String bankbranch;
      private String bsrcode;
      private String tdsreturnform;
      private String year;
      private String quarter;
      private String branchapf;
      private String duedate;
      private String dateoffiling;
      private String ogreturnackform;

      
	  public String getNaturetransac() {
		return naturetransac;
	}
	public void setNaturetransac(String naturetransac) {
		this.naturetransac = naturetransac;
	}
	public Double getTdsremitted() {
		return tdsremitted;
	}
	public void setTdsremitted(Double tdsremitted) {
		this.tdsremitted = tdsremitted;
	}
	public String getChallanno() {
		return challanno;
	}
	public void setChallanno(String challanno) {
		this.challanno = challanno;
	}
	public String getChallandate() {
		return challandate;
	}
	public void setChallandate(String challandate) {
		this.challandate = challandate;
	}
	public String getNameofthebank() {
		return nameofthebank;
	}
	public void setNameofthebank(String nameofthebank) {
		this.nameofthebank = nameofthebank;
	}
	public String getBankbranch() {
		return bankbranch;
	}
	public void setBankbranch(String bankbranch) {
		this.bankbranch = bankbranch;
	}
	public String getBsrcode() {
		return bsrcode;
	}
	public void setBsrcode(String bsrcode) {
		this.bsrcode = bsrcode;
	}
	public String getTdsreturnform() {
		return tdsreturnform;
	}
	public void setTdsreturnform(String tdsreturnform) {
		this.tdsreturnform = tdsreturnform;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getQuarter() {
		return quarter;
	}
	public void setQuarter(String quarter) {
		this.quarter = quarter;
	}
	public String getBranchapf() {
		return branchapf;
	}
	public void setBranchapf(String branchapf) {
		this.branchapf = branchapf;
	}
	public String getDuedate() {
		return duedate;
	}
	public void setDuedate(String duedate) {
		this.duedate = duedate;
	}
	public String getDateoffiling() {
		return dateoffiling;
	}
	public void setDateoffiling(String dateoffiling) {
		this.dateoffiling = dateoffiling;
	}
	public String getOgreturnackform() {
		return ogreturnackform;
	}
	public void setOgreturnackform(String ogreturnackform) {
		this.ogreturnackform = ogreturnackform;
	}
	public String getLedgeralias() {
		return ledgeralias;
	}
	public void setLedgeralias(String ledgeralias) {
		this.ledgeralias = ledgeralias;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
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
	public Integer getTransactionnumber() {
		return transactionnumber;
	}
	public void setTransactionnumber(Integer transactionnumber) {
		this.transactionnumber = transactionnumber;
	}
	@Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;

	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Double getCess() {
		return cess;
	}
	public void setCess(Double cess) {
		this.cess = cess;
	}
	public Double getRate() {
		return rate;
	}
	public void setRate(Double rate) {
		this.rate = rate;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getInvtype() {
		return invtype;
	}
	public void setInvtype(String invtype) {
		this.invtype = invtype;
	}
	public Integer getHeadofaccount() {
		return headofaccount;
	}
	public void setHeadofaccount(Integer headofaccount) {
		this.headofaccount = headofaccount;
	}
	public String getInvoicenumber() {
		return invoicenumber;
	}
	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	public int getVgstdetailsid() {
		return vgstdetailsid;
	}
	public void setVgstdetailsid(int vgstdetailsid) {
		this.vgstdetailsid = vgstdetailsid;
	}
	public Integer getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}
	public Integer getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(Integer invoiceid) {
		this.invoiceid = invoiceid;
	}
	public Integer getGstbvledgerid() {
		return gstbvledgerid;
	}
	public void setGstbvledgerid(Integer gstbvledgerid) {
		this.gstbvledgerid = gstbvledgerid;
	}
	public Double getInvoicevalue() {
		return invoicevalue;
	}
	public void setInvoicevalue(Double invoicevalue) {
		this.invoicevalue = invoicevalue;
	}
	public Double getTaxablevalue() {
		return taxablevalue;
	}
	public void setTaxablevalue(Double taxablevalue) {
		this.taxablevalue = taxablevalue;
	}
	public Double getIgstvalue() {
		return igstvalue;
	}
	public void setIgstvalue(Double igstvalue) {
		this.igstvalue = igstvalue;
	}
	public Double getCgstvalue() {
		return cgstvalue;
	}
	public void setCgstvalue(Double cgstvalue) {
		this.cgstvalue = cgstvalue;
	}
	public Double getSgstvalue() {
		return sgstvalue;
	}
	public void setSgstvalue(Double sgstvalue) {
		this.sgstvalue = sgstvalue;
	}
	public Double getGsttdsigst() {
		return gsttdsigst;
	}
	public void setGsttdsigst(Double gsttdsigst) {
		this.gsttdsigst = gsttdsigst;
	}
	public Double getGsttdssgst() {
		return gsttdssgst;
	}
	public void setGsttdssgst(Double gsttdssgst) {
		this.gsttdssgst = gsttdssgst;
	}
	public Double getGsttdscgst() {
		return gsttdscgst;
	}
	public void setGsttdscgst(Double gsttdscgst) {
		this.gsttdscgst = gsttdscgst;
	}
	public Boolean getSupplyattract() {
		return supplyattract;
	}
	public void setSupplyattract(Boolean supplyattract) {
		this.supplyattract = supplyattract;
	}
	public String getGstbvgsttin() {
		return gstbvgsttin;
	}
	public void setGstbvgsttin(String gstbvgsttin) {
		this.gstbvgsttin = gstbvgsttin;
	}
	public Integer getItbvledgerid() {
		return itbvledgerid;
	}
	public void setItbvledgerid(Integer itbvledgerid) {
		this.itbvledgerid = itbvledgerid;
	}
	public Integer getSectionid() {
		return sectionid;
	}
	public void setSectionid(Integer sectionid) {
		this.sectionid = sectionid;
	}
	public Integer getReturnid() {
		return returnid;
	}
	public void setReturnid(Integer returnid) {
		this.returnid = returnid;
	}
	public Double getGrossamount() {
		return grossamount;
	}
	public void setGrossamount(Double grossamount) {
		this.grossamount = grossamount;
	}
	public Double getTds() {
		return tds;
	}
	public void setTds(Double tds) {
		this.tds = tds;
	}
	public Double getNetamount() {
		return netamount;
	}
	public void setNetamount(Double netamount) {
		this.netamount = netamount;
	}
	public String getItbvgsttin() {
		return itbvgsttin;
	}
	public void setItbvgsttin(String itbvgsttin) {
		this.itbvgsttin = itbvgsttin;
	}
	  

}
