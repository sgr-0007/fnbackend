package com.fna.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Transient;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.LastModifiedBy;

@Entity
public class PaymentView {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentid;
	@Column(name = "paymentno")
	private String paymentNo;
	@Column(name = "invoiceid")
	private int invoiceId;
	@Column(name = "invoiceno")
	private String invoiceNo;
	@Column(name="buyername")
	private String buyername;
	@Column(name="officename")
	private String officename;
	@Column(name="companyid")
	private String companyid;
	@Column(name="cashledger")
	private String cashledger;
	@Column(name="bankledger")
	private String bankledger;
	@Column(name = "paymentstatus")
	private int paymentStatus;
	@Column(name = "paymentduedate")
	private Date paymentDueDate;
	@Column(name = "invoicedate")
	private Date invoiceDate;
	@Column(name = "paymentdate")
	private Date paymentDate;
	@Column(name = "paymentamount")
	private float paymentAmount;
	@Column(name = "paymentmode")
	private int paymentMode;
	@Column(name = "paymentbalance")
	private float pBalance;
	@Column(name = "paymentamountpaid")
	private float pAmountPaid;
	@Column(name = "tds")
	private String pTds;
	@Column(name = "createdby")
	@LastModifiedBy
	private int createdBy;
	@Column(name = "createddate")
	@CreationTimestamp
	private Date createdDate;
	@Column(name = "modifiedby")
	@LastModifiedBy
	private int modifiedBy;
	@Column(name = "modifieddate")
	@UpdateTimestamp
	private Date modifiedDate;
	@Column(name = "makerverifiedby")
	private int makerVerifiedBy;
	@Column(name = "makerverifiedstatus")
	private int makerVerifiedStatus;
	@Column(name = "makerverifieddate")
	private Date makerVerifiedDate;
	@Column(name = "approververifiedby")
	private int approverVerifiedBy;
	@Column(name = "approververifiedstatus")
	private int approverVerifiedStatus;
	@Column(name = "approververifieddate")
	private Date approverVerifiedDate;
	@Transient
	private List<PaymentDetailsView> paymentDetails;
	public int getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
	}
	public String getPaymentNo() {
		return paymentNo;
	}
	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}
	public int getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(int invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getInvoiceNo() {
		return invoiceNo;
	}
	public void setInvoiceNo(String invoiceNo) {
		this.invoiceNo = invoiceNo;
	}
	public String getBuyername() {
		return buyername;
	}
	public void setBuyername(String buyername) {
		this.buyername = buyername;
	}
	public String getOfficename() {
		return officename;
	}
	public void setOfficename(String officename) {
		this.officename = officename;
	}
	public String getCompanyid() {
		return companyid;
	}
	public void setCompanyid(String companyid) {
		this.companyid = companyid;
	}
	public String getCashledger() {
		return cashledger;
	}
	public void setCashledger(String cashledger) {
		this.cashledger = cashledger;
	}
	public String getBankledger() {
		return bankledger;
	}
	public void setBankledger(String bankledger) {
		this.bankledger = bankledger;
	}
	public int getPaymentStatus() {
		return paymentStatus;
	}
	public void setPaymentStatus(int paymentStatus) {
		this.paymentStatus = paymentStatus;
	}
	public Date getPaymentDueDate() {
		return paymentDueDate;
	}
	public void setPaymentDueDate(Date paymentDueDate) {
		this.paymentDueDate = paymentDueDate;
	}
	public Date getInvoiceDate() {
		return invoiceDate;
	}
	public void setInvoiceDate(Date invoiceDate) {
		this.invoiceDate = invoiceDate;
	}
	public Date getPaymentDate() {
		return paymentDate;
	}
	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}
	public float getPaymentAmount() {
		return paymentAmount;
	}
	public void setPaymentAmount(float paymentAmount) {
		this.paymentAmount = paymentAmount;
	}
	public int getPaymentMode() {
		return paymentMode;
	}
	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}
	public float getpBalance() {
		return pBalance;
	}
	public void setpBalance(float pBalance) {
		this.pBalance = pBalance;
	}
	public float getpAmountPaid() {
		return pAmountPaid;
	}
	public void setpAmountPaid(float pAmountPaid) {
		this.pAmountPaid = pAmountPaid;
	}
	public String getpTds() {
		return pTds;
	}
	public void setpTds(String pTds) {
		this.pTds = pTds;
	}
	public int getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(int createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getModifiedBy() {
		return modifiedBy;
	}
	public void setModifiedBy(int modifiedBy) {
		this.modifiedBy = modifiedBy;
	}
	public Date getModifiedDate() {
		return modifiedDate;
	}
	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	public int getMakerVerifiedBy() {
		return makerVerifiedBy;
	}
	public void setMakerVerifiedBy(int makerVerifiedBy) {
		this.makerVerifiedBy = makerVerifiedBy;
	}
	public int getMakerVerifiedStatus() {
		return makerVerifiedStatus;
	}
	public void setMakerVerifiedStatus(int makerVerifiedStatus) {
		this.makerVerifiedStatus = makerVerifiedStatus;
	}
	public Date getMakerVerifiedDate() {
		return makerVerifiedDate;
	}
	public void setMakerVerifiedDate(Date makerVerifiedDate) {
		this.makerVerifiedDate = makerVerifiedDate;
	}
	public int getApproverVerifiedBy() {
		return approverVerifiedBy;
	}
	public void setApproverVerifiedBy(int approverVerifiedBy) {
		this.approverVerifiedBy = approverVerifiedBy;
	}
	public int getApproverVerifiedStatus() {
		return approverVerifiedStatus;
	}
	public void setApproverVerifiedStatus(int approverVerifiedStatus) {
		this.approverVerifiedStatus = approverVerifiedStatus;
	}
	public Date getApproverVerifiedDate() {
		return approverVerifiedDate;
	}
	public void setApproverVerifiedDate(Date approverVerifiedDate) {
		this.approverVerifiedDate = approverVerifiedDate;
	}
	public List<PaymentDetailsView> getPaymentDetails() {
		return paymentDetails;
	}
	public void setPaymentDetails(List<PaymentDetailsView> paymentDetails) {
		this.paymentDetails = paymentDetails;
	}
	
	
	
	
}
