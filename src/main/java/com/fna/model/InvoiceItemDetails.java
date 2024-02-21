package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "invoicedetails")
public class InvoiceItemDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="invoicedetailsid",updatable = false)
	private int invoiceDetailsId;
	@Column(name="invoiceid")
	private int invoiceId;
	@Column(name="itemid")
	private int itemid;
	@Column(name="itemdescription")
	private String itemdescription;
	@Column(name="sachsncode")
	private String hsnorsaccode;
	@Column(name="qty")
	private int qty;
	@Column(name="itemrate")
	private int itemrate;
	
	@Column(name="currency")
	private int currency;
	@Column(name="totalvalue")
	private int totalvalue;
	@Column(name="cgstrate")
	private int cgstrate;
	@Column(name="cgstvalue")
	private float cgstvalue;
	@Column(name="sgstrate")
	private int sgstrate;
	@Column(name="sgstvalue")
	private float sgstvalue;
	@Column(name="igstrate")
	private int igstrate;
	@Column(name="igstvalue")
	private float igstvalue;
	
	@Column(name="discountrate")
	private int discountRate;
	@Column(name="discountvalue")
	private float discountValue;
	@Column(name="cessrate")
	private int cessrate;
	@Column(name="cessvalue")
	private int cessvalue;
	@Column(name="taxvalue")
	private float taxvalue;
	
	@Column(name="servicevalue")
	private float servicevalue;
	@Column(name="total")
	private float total;
	public int getInvoiceDetailsId() {
		return invoiceDetailsId;
	}
	public void setInvoiceDetailsId(int invoiceDetailsId) {
		this.invoiceDetailsId = invoiceDetailsId;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public int getItemid() {
		return itemid;
	}
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	public String getItemdescription() {
		return itemdescription;
	}
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	public String getHsnorsaccode() {
		return hsnorsaccode;
	}
	public void setHsnorsaccode(String hsnorsaccode) {
		this.hsnorsaccode = hsnorsaccode;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getItemrate() {
		return itemrate;
	}
	public void setItemrate(int itemrate) {
		this.itemrate = itemrate;
	}
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public int getTotalvalue() {
		return totalvalue;
	}
	public void setTotalvalue(int totalvalue) {
		this.totalvalue = totalvalue;
	}
	public int getCgstrate() {
		return cgstrate;
	}
	public void setCgstrate(int cgstrate) {
		this.cgstrate = cgstrate;
	}
	public float getCgstvalue() {
		return cgstvalue;
	}
	public void setCgstvalue(float cgstvalue) {
		this.cgstvalue = cgstvalue;
	}
	public int getSgstrate() {
		return sgstrate;
	}
	public void setSgstrate(int sgstrate) {
		this.sgstrate = sgstrate;
	}
	public float getSgstvalue() {
		return sgstvalue;
	}
	public void setSgstvalue(float sgstvalue) {
		this.sgstvalue = sgstvalue;
	}
	public int getIgstrate() {
		return igstrate;
	}
	public void setIgstrate(int igstrate) {
		this.igstrate = igstrate;
	}
	public float getIgstvalue() {
		return igstvalue;
	}
	public void setIgstvalue(float igstvalue) {
		this.igstvalue = igstvalue;
	}
	public int getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}
	public float getDiscountValue() {
		return discountValue;
	}
	public void setDiscountValue(float discountValue) {
		this.discountValue = discountValue;
	}
	public int getCessrate() {
		return cessrate;
	}
	public void setCessrate(int cessrate) {
		this.cessrate = cessrate;
	}
	public int getCessvalue() {
		return cessvalue;
	}
	public void setCessvalue(int cessvalue) {
		this.cessvalue = cessvalue;
	}
	public float getTaxvalue() {
		return taxvalue;
	}
	public void setTaxvalue(float taxvalue) {
		this.taxvalue = taxvalue;
	}
	public float getServicevalue() {
		return servicevalue;
	}
	public void setServicevalue(float servicevalue) {
		this.servicevalue = servicevalue;
	}
	public float getTotal() {
		return total;
	}
	public void setTotal(float total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "InvoiceItemDetails [invoiceDetailsId=" + invoiceDetailsId + ", invoiceId=" + invoiceId + ", itemid="
				+ itemid + ", itemdescription=" + itemdescription + ", hsnorsaccode=" + hsnorsaccode + ", qty=" + qty
				+ ", itemrate=" + itemrate + ", currency=" + currency + ", totalvalue=" + totalvalue + ", cgstrate="
				+ cgstrate + ", cgstvalue=" + cgstvalue + ", sgstrate=" + sgstrate + ", sgstvalue=" + sgstvalue
				+ ", igstrate=" + igstrate + ", igstvalue=" + igstvalue + ", discountRate=" + discountRate
				+ ", discountValue=" + discountValue + ", cessrate=" + cessrate + ", cessvalue=" + cessvalue
				+ ", taxvalue=" + taxvalue + ", servicevalue=" + servicevalue + ", total=" + total + "]";
	}
	
		
	
}
