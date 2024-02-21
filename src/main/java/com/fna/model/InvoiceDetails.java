package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="invoice")
public class InvoiceDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="invoiceid",updatable = false)
	private int invoiceid;
	@Column(name="invoicenumber")
	private String invoicenumber;
	@Column(name="groupid")
	private int groupid;
	@Column(name="subgroupid")
	private int subgroupid;
	@Column(name="companyid")
	private int companyid;
	@Column(name="invoicedate")
	private Date invoicedate;
	@Column(name="buyerid")
	private int buyerid;
	@Column(name="supplierid")
	private int supplierid;
	@Column(name="buyerbillingadd1")
	private String buyerbillingadd1;
	@Column(name="buyerbillingadd2")
	private String buyerbillingadd2;
	@Column(name="city")
	private int city;
	@Column(name="state")
	private int state;
	@Column(name="pincode")
	private String pincode;
	@Column(name="gsttin")
	private String gsttin;
	@Column(name="paymenttermsid")
	private int paymenttermsid;
	@Column(name="invoicetotal")
	private float invoicetotal;
	@Column(name="totalinwords")
	private String totalinwords;
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
	@Column(name="discount")
	private float discount;
	@Column(name="discountvalue")
	private float discountvalue;
	@Column(name="duedate")
	private Date duedate;
	@Column(name="invoicestatus")
	private int invoicestatus;
	@Column(name="invoicebalancedue")
	private float invoicebalancedue;
	@Column(name="currency")
	private int currency;
	@Column(name="tdsrate")
	private float tdsrate;
	@Column(name="tdsvalue")
	private float tdsvalue;
	@Column(name="tcsrate")
	private float tcsrate;
	@Column(name="tcsvalue")
	private float tcsvalue;
	@Column(name="pattachargerate")
	private float pattaRate;
	@Column(name="pattachargevalue")
	private float pattavalue;
	@Column(name="servicechargerate")
	private float serviceRate;
	@Column(name="servicechargevalue")
	private float serviceValue;
	@Column(name="deliveryinstructions")
	private String deliveryinstructions;
	@Column(name="createdby")
	private int createdby;
	@Column(name="createddate")
	@CreationTimestamp
	private Date createddate;
	@Column(name="modifiedby")
	private int modifiedby;
	@Column(name="modifieddate")
	@UpdateTimestamp
	private Date modifieddate;
	@Column(name="voucherid")
	private int voucherid;
	@Column(name="vouchernumber")
	private String vouchernumber;
	@Column(name="vouchertype")
	private int vouchertype;
	@Column(name="invoicefromadminorauction")
	private int invoicefromadminorauction;
	@Column(name="makerverifiedby")
	private int makerverifiedby;
	@Column(name="makerverifiedstatus")
	private int makerverifiedstatu;
	@Column(name="makerverifieddate")
	private Date makerverifieddate;
	@Column(name="approververifiedby")
	private int approververifiedby;
	@Column(name="approververifiedstatus")
	private int approververifiedstatus;
	@Column(name="approververifieddate")
	private Date approververifieddate;
	private int deliveryid;
	private int  financialyearid;
	private Date invoiceperiodstart;
	private Date invoiceperiodend;
	
	
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
	public int getGroupid() {
		return groupid;
	}
	public void setGroupid(int groupid) {
		this.groupid = groupid;
	}
	public int getSubgroupid() {
		return subgroupid;
	}
	public void setSubgroupid(int subgroupid) {
		this.subgroupid = subgroupid;
	}
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public Date getInvoicedate() {
		return invoicedate;
	}
	public void setInvoicedate(Date invoicedate) {
		this.invoicedate = invoicedate;
	}
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public int getSupplierid() {
		return supplierid;
	}
	public void setSupplierid(int supplierid) {
		this.supplierid = supplierid;
	}
	public String getBuyerbillingadd1() {
		return buyerbillingadd1;
	}
	public void setBuyerbillingadd1(String buyerbillingadd1) {
		this.buyerbillingadd1 = buyerbillingadd1;
	}
	public String getBuyerbillingadd2() {
		return buyerbillingadd2;
	}
	public void setBuyerbillingadd2(String buyerbillingadd2) {
		this.buyerbillingadd2 = buyerbillingadd2;
	}
	public int getCity() {
		return city;
	}
	public void setCity(int city) {
		this.city = city;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	public String getGsttin() {
		return gsttin;
	}
	public void setGsttin(String gsttin) {
		this.gsttin = gsttin;
	}
	public int getPaymenttermsid() {
		return paymenttermsid;
	}
	public void setPaymenttermsid(int paymenttermsid) {
		this.paymenttermsid = paymenttermsid;
	}
	public float getInvoicetotal() {
		return invoicetotal;
	}
	public void setInvoicetotal(float invoicetotal) {
		this.invoicetotal = invoicetotal;
	}
	public String getTotalinwords() {
		return totalinwords;
	}
	public void setTotalinwords(String totalinwords) {
		this.totalinwords = totalinwords;
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
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public float getDiscountvalue() {
		return discountvalue;
	}
	public void setDiscountvalue(float discountvalue) {
		this.discountvalue = discountvalue;
	}
	public Date getDuedate() {
		return duedate;
	}
	public void setDuedate(Date duedate) {
		this.duedate = duedate;
	}
	public int getInvoicestatus() {
		return invoicestatus;
	}
	public void setInvoicestatus(int invoicestatus) {
		this.invoicestatus = invoicestatus;
	}
	public float getInvoicebalancedue() {
		return invoicebalancedue;
	}
	public void setInvoicebalancedue(float invoicebalancedue) {
		this.invoicebalancedue = invoicebalancedue;
	}
	public int getCurrency() {
		return currency;
	}
	public void setCurrency(int currency) {
		this.currency = currency;
	}
	public float getTdsrate() {
		return tdsrate;
	}
	public void setTdsrate(float tdsrate) {
		this.tdsrate = tdsrate;
	}
	public float getTdsvalue() {
		return tdsvalue;
	}
	public void setTdsvalue(float tdsvalue) {
		this.tdsvalue = tdsvalue;
	}
	public float getTcsrate() {
		return tcsrate;
	}
	public void setTcsrate(float tcsrate) {
		this.tcsrate = tcsrate;
	}
	public float getTcsvalue() {
		return tcsvalue;
	}
	public void setTcsvalue(float tcsvalue) {
		this.tcsvalue = tcsvalue;
	}
	public String getDeliveryinstructions() {
		return deliveryinstructions;
	}
	public void setDeliveryinstructions(String deliveryinstructions) {
		this.deliveryinstructions = deliveryinstructions;
	}
	public int getCreatedby() {
		return createdby;
	}
	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public int getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(int modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	public int getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(int voucherid) {
		this.voucherid = voucherid;
	}
	public String getVouchernumber() {
		return vouchernumber;
	}
	
	public Date getInvoiceperiodstart() {
		return invoiceperiodstart;
	}
	public void setInvoiceperiodstart(Date invoiceperiodstart) {
		this.invoiceperiodstart = invoiceperiodstart;
	}
	public Date getInvoiceperiodend() {
		return invoiceperiodend;
	}
	public void setInvoiceperiodend(Date invoiceperiodend) {
		this.invoiceperiodend = invoiceperiodend;
	}
	public void setVouchernumber(String vouchernumber) {
		this.vouchernumber = vouchernumber;
	}
	public int getVouchertype() {
		return vouchertype;
	}
	public void setVouchertype(int vouchertype) {
		this.vouchertype = vouchertype;
	}
	public int getInvoicefromadminorauction() {
		return invoicefromadminorauction;
	}
	public void setInvoicefromadminorauction(int invoicefromadminorauction) {
		this.invoicefromadminorauction = invoicefromadminorauction;
	}
	public int getMakerverifiedby() {
		return makerverifiedby;
	}
	public void setMakerverifiedby(int makerverifiedby) {
		this.makerverifiedby = makerverifiedby;
	}
	public int getMakerverifiedstatu() {
		return makerverifiedstatu;
	}
	public void setMakerverifiedstatu(int makerverifiedstatu) {
		this.makerverifiedstatu = makerverifiedstatu;
	}
	public Date getMakerverifieddate() {
		return makerverifieddate;
	}
	public void setMakerverifieddate(Date makerverifieddate) {
		this.makerverifieddate = makerverifieddate;
	}
	public int getApproververifiedby() {
		return approververifiedby;
	}
	public void setApproververifiedby(int approververifiedby) {
		this.approververifiedby = approververifiedby;
	}
	public int getApproververifiedstatus() {
		return approververifiedstatus;
	}
	public void setApproververifiedstatus(int approververifiedstatus) {
		this.approververifiedstatus = approververifiedstatus;
	}
	public Date getApproververifieddate() {
		return approververifieddate;
	}
	public void setApproververifieddate(Date approververifieddate) {
		this.approververifieddate = approververifieddate;
	}
	
	public float getPattaRate() {
		return pattaRate;
	}
	public void setPattaRate(float pattaRate) {
		this.pattaRate = pattaRate;
	}
	public float getPattavalue() {
		return pattavalue;
	}
	public void setPattavalue(float pattavalue) {
		this.pattavalue = pattavalue;
	}
	public float getServiceRate() {
		return serviceRate;
	}
	public void setServiceRate(float serviceRate) {
		this.serviceRate = serviceRate;
	}
	public float getServiceValue() {
		return serviceValue;
	}
	public void setServiceValue(float serviceValue) {
		this.serviceValue = serviceValue;
	}
	public int getDeliveryid() {
		return deliveryid;
	}
	public void setDeliveryid(int deliveryid) {
		this.deliveryid = deliveryid;
	}
	public int getFinancialyearid() {
		return financialyearid;
	}
	public void setFinancialyearid(int financialyearid) {
		this.financialyearid = financialyearid;
	}
	@Override
	public String toString() {
		return "InvoiceDetails [invoiceid=" + invoiceid + ", invoicenumber=" + invoicenumber + ", groupid=" + groupid
				+ ", subgroupid=" + subgroupid + ", companyid=" + companyid + ", invoicedate=" + invoicedate
				+ ", buyerid=" + buyerid + ", supplierid=" + supplierid + ", buyerbillingadd1=" + buyerbillingadd1
				+ ", buyerbillingadd2=" + buyerbillingadd2 + ", city=" + city + ", state=" + state + ", pincode="
				+ pincode + ", gsttin=" + gsttin + ", paymenttermsid=" + paymenttermsid + ", invoicetotal="
				+ invoicetotal + ", totalinwords=" + totalinwords + ", cgstvalue=" + cgstvalue + ", cgstrate="
				+ cgstrate + ", sgstvalue=" + sgstvalue + ", sgstrate=" + sgstrate + ", igstvalue=" + igstvalue
				+ ", igstrate=" + igstrate + ", discount=" + discount + ", discountvalue=" + discountvalue
				+ ", duedate=" + duedate + ", invoicestatus=" + invoicestatus + ", invoicebalancedue="
				+ invoicebalancedue + ", currency=" + currency + ", tdsrate=" + tdsrate + ", tdsvalue=" + tdsvalue
				+ ", tcsrate=" + tcsrate + ", tcsvalue=" + tcsvalue + ", pattaRate=" + pattaRate + ", pattavalue="
				+ pattavalue + ", serviceRate=" + serviceRate + ", serviceValue=" + serviceValue
				+ ", deliveryinstructions=" + deliveryinstructions + ", createdby=" + createdby + ", createddate="
				+ createddate + ", modifiedby=" + modifiedby + ", modifieddate=" + modifieddate + ", voucherid="
				+ voucherid + ", vouchernumber=" + vouchernumber + ", vouchertype=" + vouchertype
				+ ", invoicefromadminorauction=" + invoicefromadminorauction + ", makerverifiedby=" + makerverifiedby
				+ ", makerverifiedstatu=" + makerverifiedstatu + ", makerverifieddate=" + makerverifieddate
				+ ", approververifiedby=" + approververifiedby + ", approververifiedstatus=" + approververifiedstatus
				+ ", approververifieddate=" + approververifieddate + ", deliveryid=" + deliveryid + ", financialyearid="
				+ financialyearid + ", invoiceperiodstart=" + invoiceperiodstart + ", invoiceperiodend="
				+ invoiceperiodend + "]";
	}
	
	
	
		
}
