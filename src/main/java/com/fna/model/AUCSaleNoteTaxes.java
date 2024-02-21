package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="aucsalenote_taxes")
public class AUCSaleNoteTaxes {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stid;
	@Column(name="SaleNote_No")
	private int saleNoteNo;
	private int Tax_Id;
	private String  Tax_Desc;
	private int Qty_Type;
	private int VALUE;
	private char Tax_Type;
	private String Sale_Code;
	private Double Tax_Charges;
	private Integer Display_Order;
	private Integer Loan_Tbgrno;
	private Double Normal_Service_Charge;
	private Double Excess_Service_Charge;
	private Double Max_Excess_Service_Charge;
	private Double Scarp_Service_Charge;
	private int checked_by;
	private Date checked_date;
	private int approved_by;
	private Date approved_date;
	private Date inserted_date;
	private int status;
	public int getStid() {
		return stid;
	}
	public void setStid(int stid) {
		this.stid = stid;
	}
	
	
	public int getSaleNoteNo() {
		return saleNoteNo;
	}
	public void setSaleNoteNo(int saleNoteNo) {
		this.saleNoteNo = saleNoteNo;
	}
	public int getTax_Id() {
		return Tax_Id;
	}
	public void setTax_Id(int tax_Id) {
		Tax_Id = tax_Id;
	}
	public String getTax_Desc() {
		return Tax_Desc;
	}
	public void setTax_Desc(String tax_Desc) {
		Tax_Desc = tax_Desc;
	}
	public int getQty_Type() {
		return Qty_Type;
	}
	public void setQty_Type(int qty_Type) {
		Qty_Type = qty_Type;
	}
	public int getVALUE() {
		return VALUE;
	}
	public void setVALUE(int vALUE) {
		VALUE = vALUE;
	}
	public char getTax_Type() {
		return Tax_Type;
	}
	public void setTax_Type(char tax_Type) {
		Tax_Type = tax_Type;
	}
	public String getSale_Code() {
		return Sale_Code;
	}
	public void setSale_Code(String sale_Code) {
		Sale_Code = sale_Code;
	}
	public Double getTax_Charges() {
		return Tax_Charges;
	}
	public void setTax_Charges(Double tax_Charges) {
		Tax_Charges = tax_Charges;
	}
	public Integer getDisplay_Order() {
		return Display_Order;
	}
	public void setDisplay_Order(Integer display_Order) {
		Display_Order = display_Order;
	}
	public Integer getLoan_Tbgrno() {
		return Loan_Tbgrno;
	}
	public void setLoan_Tbgrno(Integer loan_Tbgrno) {
		Loan_Tbgrno = loan_Tbgrno;
	}
	public Double getNormal_Service_Charge() {
		return Normal_Service_Charge;
	}
	public void setNormal_Service_Charge(Double normal_Service_Charge) {
		Normal_Service_Charge = normal_Service_Charge;
	}
	public Double getExcess_Service_Charge() {
		return Excess_Service_Charge;
	}
	public void setExcess_Service_Charge(Double excess_Service_Charge) {
		Excess_Service_Charge = excess_Service_Charge;
	}
	public Double getMax_Excess_Service_Charge() {
		return Max_Excess_Service_Charge;
	}
	public void setMax_Excess_Service_Charge(Double max_Excess_Service_Charge) {
		Max_Excess_Service_Charge = max_Excess_Service_Charge;
	}
	public Double getScarp_Service_Charge() {
		return Scarp_Service_Charge;
	}
	public void setScarp_Service_Charge(Double scarp_Service_Charge) {
		Scarp_Service_Charge = scarp_Service_Charge;
	}
	public int getChecked_by() {
		return checked_by;
	}
	public void setChecked_by(int checked_by) {
		this.checked_by = checked_by;
	}
	public Date getChecked_date() {
		return checked_date;
	}
	public void setChecked_date(Date checked_date) {
		this.checked_date = checked_date;
	}
	public int getApproved_by() {
		return approved_by;
	}
	public void setApproved_by(int approved_by) {
		this.approved_by = approved_by;
	}
	public Date getApproved_date() {
		return approved_date;
	}
	public void setApproved_date(Date approved_date) {
		this.approved_date = approved_date;
	}
	public Date getInserted_date() {
		return inserted_date;
	}
	public void setInserted_date(Date inserted_date) {
		this.inserted_date = inserted_date;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
}
