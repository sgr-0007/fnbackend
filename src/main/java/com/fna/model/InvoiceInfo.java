package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
public class InvoiceInfo {
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
	@Column(name="buyername")
	String buyerName;
	@Column(name="buyergst")
	String buyergst;
	@Column(name="buyercityid")
	int buyerCityId;
	@Column(name="buyercityname")
	String buyerCityName;
	@Column(name="buyersateid")
	int buyerSateId;
	@Column(name="buyerstatename")
	String buyerStateName;
	@Column(name="suppliername")
	String supplierName;
	@Column(name="suppliergst")
	String supplierGst;
	@Column(name="suppliercityid")
	int supplierCityId;
	@Column(name="suppliercityname")
	String supplierCityName;
	@Column(name="suppliersatate")
	int supplierStateId;
	@Column(name="supplierstatename")
	String supplierStateName;
	@Column(name="paymenttermsname")
	String paymentTermsName;
	@Column(name="deliveryname")
	String deliveryName;
	@Column(name="deliverygst")
	String deliveryGst;
	@Column(name="deliverycityid")
	int deliveryCityId;
	@Column(name="deliverycityname")
	String deliveryCityName;
	@Column(name="deliverystateid")
	int deliveryStateId;
	@Column(name="deliverystatename")
	String deliveryStateName;
	@Column(name="financialyearname")
	String financialYearName;
	private int deliveryid;
	private int  financialyearid;
	@Column(name="invoicefromadminorauction")
	private int invoicefromadminorauction;
	private float creditlimit;
	@Transient
	private float amountlimit;
	private float paymentbalance;
	private float paymentamountpaid;
	private float paymentamount;
	private Date paymentduedate;
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
	
	public float getCreditlimit() {
		return creditlimit;
	}
	public void setCreditlimit(float creditlimit) {
		this.creditlimit = creditlimit;
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
	public int getInvoicefromadminorauction() {
		return invoicefromadminorauction;
	}
	public void setInvoicefromadminorauction(int invoicefromadminorauction) {
		this.invoicefromadminorauction = invoicefromadminorauction;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getBuyergst() {
		return buyergst;
	}
	public void setBuyergst(String buyergst) {
		this.buyergst = buyergst;
	}
	public int getBuyerCityId() {
		return buyerCityId;
	}
	public void setBuyerCityId(int buyerCityId) {
		this.buyerCityId = buyerCityId;
	}
	public String getBuyerCityName() {
		return buyerCityName;
	}
	public void setBuyerCityName(String buyerCityName) {
		this.buyerCityName = buyerCityName;
	}
	public int getBuyerSateId() {
		return buyerSateId;
	}
	public void setBuyerSateId(int buyerSateId) {
		this.buyerSateId = buyerSateId;
	}
	public String getBuyerStateName() {
		return buyerStateName;
	}
	public void setBuyerStateName(String buyerStateName) {
		this.buyerStateName = buyerStateName;
	}
	
	
	public void setSupplierGst(String supplierGst) {
		this.supplierGst = supplierGst;
	}
	public int getSupplierCityId() {
		return supplierCityId;
	}
	public void setSupplierCityId(int supplierCityId) {
		this.supplierCityId = supplierCityId;
	}
	public String getSupplierCityName() {
		return supplierCityName;
	}
	public void setSupplierCityName(String supplierCityName) {
		this.supplierCityName = supplierCityName;
	}
	public int getSupplierStateId() {
		return supplierStateId;
	}
	public void setSupplierStateId(int supplierStateId) {
		this.supplierStateId = supplierStateId;
	}
	public String getSupplierStateName() {
		return supplierStateName;
	}
	public void setSupplierStateName(String supplierStateName) {
		this.supplierStateName = supplierStateName;
	}
	public String getPaymentTermsName() {
		return paymentTermsName;
	}
	public void setPaymentTermsName(String paymentTermsName) {
		this.paymentTermsName = paymentTermsName;
	}
	public String getDeliveryName() {
		return deliveryName;
	}
	public void setDeliveryName(String deliveryName) {
		this.deliveryName = deliveryName;
	}
	public String getDeliveryGst() {
		return deliveryGst;
	}
	public void setDeliveryGst(String deliveryGst) {
		this.deliveryGst = deliveryGst;
	}
	public int getDeliveryCityId() {
		return deliveryCityId;
	}
	public void setDeliveryCityId(int deliveryCityId) {
		this.deliveryCityId = deliveryCityId;
	}
	public String getDeliveryCityName() {
		return deliveryCityName;
	}
	public void setDeliveryCityName(String deliveryCityName) {
		this.deliveryCityName = deliveryCityName;
	}
	public int getDeliveryStateId() {
		return deliveryStateId;
	}
	public void setDeliveryStateId(int deliveryStateId) {
		this.deliveryStateId = deliveryStateId;
	}
	public String getDeliveryStateName() {
		return deliveryStateName;
	}
	public void setDeliveryStateName(String deliveryStateName) {
		this.deliveryStateName = deliveryStateName;
	}
	public String getFinancialYearName() {
		return financialYearName;
	}
	public void setFinancialYearName(String financialYearName) {
		this.financialYearName = financialYearName;
	}
	public String getSupplierName() {
		return supplierName;
	}
	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}
	public String getSupplierGst() {
		return supplierGst;
	}
	public float getAmountlimit() {
		return amountlimit;
	}
	public void setAmountlimit(float amountlimit) {
		this.amountlimit = amountlimit;
	}
	public float getPaymentbalance() {
		return paymentbalance;
	}
	public void setPaymentbalance(float paymentbalance) {
		this.paymentbalance = paymentbalance;
	}
	public float getPaymentamountpaid() {
		return paymentamountpaid;
	}
	public void setPaymentamountpaid(float paymentamountpaid) {
		this.paymentamountpaid = paymentamountpaid;
	}
	public float getPaymentamount() {
		return paymentamount;
	}
	public void setPaymentamount(float paymentamount) {
		this.paymentamount = paymentamount;
	}
	public Date getPaymentduedate() {
		return paymentduedate;
	}
	public void setPaymentduedate(Date paymentduedate) {
		this.paymentduedate = paymentduedate;
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

	
	
	
}
