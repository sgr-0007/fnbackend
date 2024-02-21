package com.fna.model;


import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class GstView {
	@Id
	int vgstdetailsid;
	String invoicenumber;
	Integer voucherid;
	Integer invoicevalue;
	Integer taxablevalue;
	String gstbvledgeralias;
	String gstbvgsttin;
	String invtype;
	Double igstvalue;
	Double cgstvalue;
	Double sgstvalue;
	Double gsttdsigst;
	Double gsttdscgst;
	Double gsttdssgst;
	
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
	public Double getGsttdscgst() {
		return gsttdscgst;
	}
	public void setGsttdscgst(Double gsttdscgst) {
		this.gsttdscgst = gsttdscgst;
	}
	public Double getGsttdssgst() {
		return gsttdssgst;
	}
	public void setGsttdssgst(Double gsttdssgst) {
		this.gsttdssgst = gsttdssgst;
	}
	public int getVgstdetailsid() {
		return vgstdetailsid;
	}
	public void setVgstdetailsid(int vgstdetailsid) {
		this.vgstdetailsid = vgstdetailsid;
	}
	public String getInvoicenumber() {
		return invoicenumber;
	}
	public void setInvoicenumber(String invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	public Integer getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}
	public Integer getInvoicevalue() {
		return invoicevalue;
	}
	public void setInvoicevalue(Integer invoicevalue) {
		this.invoicevalue = invoicevalue;
	}
	public Integer getTaxablevalue() {
		return taxablevalue;
	}
	public void setTaxablevalue(Integer taxablevalue) {
		this.taxablevalue = taxablevalue;
	}
	public String getGstbvledgeralias() {
		return gstbvledgeralias;
	}
	public void setGstbvledgeralias(String gstbvledgeralias) {
		this.gstbvledgeralias = gstbvledgeralias;
	}
	public String getGstbvgsttin() {
		return gstbvgsttin;
	}
	public void setGstbvgsttin(String gstbvgsttin) {
		this.gstbvgsttin = gstbvgsttin;
	}
	public String getInvtype() {
		return invtype;
	}
	public void setInvtype(String invtype) {
		this.invtype = invtype;
	}
	
	
	


}
