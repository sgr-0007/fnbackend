package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class InvoiceMasterView {
	@Id
	@Column(name="invoiceid")
	private int invoiceid;
	@Column(name="invoicenumber")
	private String invoicenumber;	
	@Column(name="invoicedate")
	private Date invoicedate;
	@Column(name="cgstvalue")
	private float cgstvalue;
	@Column(name="cgstrate")
	private float cgstrate;
	@Column(name="sgstvalue")
	private float sgstvalue;
	@Column(name="sgstrate")
	private float sgstrate;
	@Column(name="igstvalue")
	private float igstvalue;
	@Column(name="igstrate")
	private float igstrate;
	@Column(name="invoicetotal")
	private float invoicevalue;
	public float getInvoicevalue() {
		return invoicevalue;
	}
	public void setInvoicevalue(float invoicevalue) {
		this.invoicevalue = invoicevalue;
	}
	public int getInvoiceid() {
		return invoiceid;
	}
	public void setInvoiceid(int invoiceid) {
		this.invoiceid = invoiceid;
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
	public float getCgstvalue() {
		return cgstvalue;
	}
	public void setCgstvalue(float cgstvalue) {
		this.cgstvalue = cgstvalue;
	}
	public float getCgstrate() {
		return cgstrate;
	}
	public void setCgstrate(float cgstrate) {
		this.cgstrate = cgstrate;
	}
	public float getSgstvalue() {
		return sgstvalue;
	}
	public void setSgstvalue(float sgstvalue) {
		this.sgstvalue = sgstvalue;
	}
	public float getSgstrate() {
		return sgstrate;
	}
	public void setSgstrate(float sgstrate) {
		this.sgstrate = sgstrate;
	}
	public float getIgstvalue() {
		return igstvalue;
	}
	public void setIgstvalue(float igstvalue) {
		this.igstvalue = igstvalue;
	}
	public float getIgstrate() {
		return igstrate;
	}
	public void setIgstrate(float igstrate) {
		this.igstrate = igstrate;
	}
	
	
}
