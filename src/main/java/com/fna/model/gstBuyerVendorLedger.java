package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gstBuyerVendorLedger {

	@Id
	private int gstbvledgerid;
	private int voucherid; 
	private String gstbvledgeralias;
	private String invoicenumber;
	private Date invoicedate;
	private Integer invoicevalue;
	private Integer igstrate;
	private Integer sgstrate;
	private Integer cgstrate;
	private Integer taxablevalue;
	private Integer igst;
	private Integer cgst;
	private Integer sgst;
	public int getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(int voucherid) {
		this.voucherid = voucherid;
	}
	public int getGstbvledgerid() {
		return gstbvledgerid;
	}
	public void setGstbvledgerid(int gstbvledgerid) {
		this.gstbvledgerid = gstbvledgerid;
	}
	public String getGstbvledgeralias() {
		return gstbvledgeralias;
	}
	public void setGstbvledgeralias(String gstbvledgeralias) {
		this.gstbvledgeralias = gstbvledgeralias;
	}
	public String getInvoicenumber() {
		return invoicenumber;
	}
	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	public Date getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}
	public Integer getInvoicevalue() {
		return invoicevalue;
	}
	public void setInvoicevalue(Integer invoicevalue) {
		this.invoicevalue = invoicevalue;
	}
	public Integer getIgstrate() {
		return igstrate;
	}
	public void setIgstrate(Integer igstrate) {
		this.igstrate = igstrate;
	}
	public Integer getSgstrate() {
		return sgstrate;
	}
	public void setSgstrate(Integer sgstrate) {
		this.sgstrate = sgstrate;
	}
	public Integer getCgstrate() {
		return cgstrate;
	}
	public void setCgstrate(Integer cgstrate) {
		this.cgstrate = cgstrate;
	}
	public Integer getTaxablevalue() {
		return taxablevalue;
	}
	public void setTaxablevalue(Integer taxablevalue) {
		this.taxablevalue = taxablevalue;
	}
	public Integer getIgst() {
		return igst;
	}
	public void setIgst(Integer igst) {
		this.igst = igst;
	}
	public Integer getCgst() {
		return cgst;
	}
	public void setCgst(Integer cgst) {
		this.cgst = cgst;
	}
	public Integer getSgst() {
		return sgst;
	}
	public void setSgst(Integer sgst) {
		this.sgst = sgst;
	}
	public gstBuyerVendorLedger(int gstbvledgerid, int voucherid, String gstbvledgeralias, String invoicenumber,
			Date invoicedate, Integer invoicevalue, Integer igstrate, Integer sgstrate, Integer cgstrate,
			Integer taxablevalue, Integer igst, Integer cgst, Integer sgst) {
		super();
		this.gstbvledgerid = gstbvledgerid;
		this.voucherid = voucherid;
		this.gstbvledgeralias = gstbvledgeralias;
		this.invoicenumber = invoicenumber;
		this.invoicedate = invoicedate;
		this.invoicevalue = invoicevalue;
		this.igstrate = igstrate;
		this.sgstrate = sgstrate;
		this.cgstrate = cgstrate;
		this.taxablevalue = taxablevalue;
		this.igst = igst;
		this.cgst = cgst;
		this.sgst = sgst;
	}
	public gstBuyerVendorLedger()
	{
		
	}


}
