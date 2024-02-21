package com.fna.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;
@Entity
@Table(name="aucinvoice_header")
public class AucInvoiceHeaderDetails {

	@Id
	private int invid;
	@Column(name="Invoice_No")
	private int invoiceNo;
	@Column(name="Buyer_Id")
	private String buyerId;
	@Column(name="Buyer_No")
	private int buyerNo;
	@Column(name="No_Of_Bales")
	private int noOfBales;
	@Column(name="Quantity_Purchased")
	private float quantityPurchased;
	@Column(name="Value")
	private float value;
	@Column(name="Invoice_Date")
	private Date invoiceDate;
	@Column(name="companyid")
	private int companyId;
	@Column(name="Payment_Due_Date")
	private Date paymentDueDate;
	@Column(name="BG_Balance")
	private float bgBalance;
	@Column(name="Created_By")
	private String createdBy;
	@Column(name="Created_On")
	private Date createdOn;
	@Column(name="Updated_By")
	private String updatedBy;
	@Column(name="Update_On")
	private Date updateOn;
	@Column(name="PLATFORM_CODE")
	private int platformCode;
	@Column(name="Buyer_Name")
	private String buyerName;
	@Column(name="Is_Demurr_Calculated")
	private String isDemurrCalculated;
	@Column(name="Balance_aftr_dlv")
	private int balanceAfterDlv;
	@Column(name="No_Of_Bales_Relaxed")
	private int noOfBalesRelaxed;
	@Column(name="inserteddate")
	private Date insertedDate;
	@Column(name="status")
	private int status;
	@Column(name="voucherstatus")
	private int voucherStatus;
	@Transient
	private List<AucInvoiceDetails> aucinvDetails;
	@Transient
	private List<AUCInvoiceTaxes> aucinvTaxes;
	public int getInvid() {
		return invid;
	}
	public void setInvid(int invid) {
		this.invid = invid;
	}
	public int getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(int invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}
	public int getBuyerNo() {
		return buyerNo;
	}
	public void setBuyerNo(int buyerNo) {
		this.buyerNo = buyerNo;
	}
	public int getNoOfBales() {
		return noOfBales;
	}
	public void setNoOfBales(int noOfBales) {
		this.noOfBales = noOfBales;
	}
	public float getQuantityPurchased() {
		return quantityPurchased;
	}
	public void setQuantityPurchased(float quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
	}
	public float getValue() {
		return value;
	}
	public void setValue(float value) {
		this.value = value;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	
	
	
	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	public float getBgBalance() {
		return bgBalance;
	}
	public void setBgBalance(float bgBalance) {
		this.bgBalance = bgBalance;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdateOn() {
		return updateOn;
	}
	public void setUpdateOn(Date updateOn) {
		this.updateOn = updateOn;
	}
	public int getPlatformCode() {
		return platformCode;
	}
	public void setPlatformCode(int platformCode) {
		this.platformCode = platformCode;
	}
	public String getBuyerName() {
		return buyerName;
	}
	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}
	public String getIsDemurrCalculated() {
		return isDemurrCalculated;
	}
	public void setIsDemurrCalculated(String isDemurrCalculated) {
		this.isDemurrCalculated = isDemurrCalculated;
	}
	public int getBalanceAfterDlv() {
		return balanceAfterDlv;
	}
	public void setBalanceAfterDlv(int balanceAfterDlv) {
		this.balanceAfterDlv = balanceAfterDlv;
	}
	public int getNoOfBalesRelaxed() {
		return noOfBalesRelaxed;
	}
	public void setNoOfBalesRelaxed(int noOfBalesRelaxed) {
		this.noOfBalesRelaxed = noOfBalesRelaxed;
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
	public int getVoucherStatus() {
		return voucherStatus;
	}
	public void setVoucherStatus(int voucherStatus) {
		this.voucherStatus = voucherStatus;
	}
	
	public List<AucInvoiceDetails> getAucinvDetails() {
		return aucinvDetails;
	}
	public void setAucinvDetails(List<AucInvoiceDetails> aucinvDetails) {
		this.aucinvDetails = aucinvDetails;
	}
	public List<AUCInvoiceTaxes> getAucinvTaxes() {
		return aucinvTaxes;
	}
	public void setAucinvTaxes(List<AUCInvoiceTaxes> aucinvTaxes) {
		this.aucinvTaxes = aucinvTaxes;
	}
	@Override
	public String toString() {
		return "AucInvoiceHeaderDetails [invid=" + invid + ", invoiceNo=" + invoiceNo + ", buyerId=" + buyerId
				+ ", buyerNo=" + buyerNo + ", noOfBales=" + noOfBales + ", quantityPurchased=" + quantityPurchased
				+ ", value=" + value + ", invoiceDate=" + invoiceDate + ", paymentDueDate=" + paymentDueDate
				+ ", bgBalance=" + bgBalance + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", updatedBy="
				+ updatedBy + ", updateOn=" + updateOn + ", platformCode=" + platformCode + ", buyerName=" + buyerName
				+ ", isDemurrCalculated=" + isDemurrCalculated + ", balanceAfterDlv=" + balanceAfterDlv
				+ ", noOfBalesRelaxed=" + noOfBalesRelaxed + ", insertedDate=" + insertedDate + ", status=" + status
				+ ", voucherStatus=" + voucherStatus + ", aucinvDetails=" + aucinvDetails + ", aucinvTaxes="
				+ aucinvTaxes + "]";
	}
	
	
	
}
