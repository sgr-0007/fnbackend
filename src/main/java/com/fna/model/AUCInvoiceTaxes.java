package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="aucinvoice_taxes")
public class AUCInvoiceTaxes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int itid;
	@Column(name="Invoice_No")
	private int invoiceNo;
	@Column(name="Tax_Id")
	private int taxId;
	@Column(name="Tax_Desc")
	private String taxDesc;
	@Column(name="Value")
	private float value;
	@Column(name="Tax_Type")
	private char taxType;
	@Column(name="Tax_Charges")
	private float taxCharges;
	@Column(name="Display_Order")
	private String displayOrder;
	@Column(name="inserteddate")
	private Date insertedDate;
	@Column(name="status")
	private int status;
	public int getItid() {
		return itid;
	}
	public void setItid(int itid) {
		this.itid = itid;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public String getTaxDesc() {
		return taxDesc;
	}
	public void setTaxDesc(String taxDesc) {
		this.taxDesc = taxDesc;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	
	public char getTaxType() {
		return taxType;
	}
	public void setTaxType(char taxType) {
		this.taxType = taxType;
	}
	public float getTaxCharges() {
		return taxCharges;
	}
	public void setTaxCharges(float taxCharges) {
		this.taxCharges = taxCharges;
	}
	public String getDisplayOrder() {
		return displayOrder;
	}
	public void setDisplayOrder(String displayOrder) {
		this.displayOrder = displayOrder;
	}
	public Date getInsertedDate() {
		return insertedDate;
	}
	public void setInsertedDate(Date insertedDate) {
		this.insertedDate = insertedDate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	

}
