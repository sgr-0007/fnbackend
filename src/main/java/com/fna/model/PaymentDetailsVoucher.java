package com.fna.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentdetails")
public class PaymentDetailsVoucher {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int paymentdetailsid;
	
	@Column(name = "paymentno")
	private String paymentNo;
	@Column(name = "paymentmode")
	private int paymentMode;
	@Column(name = "chequeno")
	private String chequeNumber;
	@Column(name = "chequedrawnbank")
	private String chequeBank;
	@Column(name = "chequeamount")
	private float chequeAmount;
	@Column(name = "chequedate")
	private Date chequeDate;
	@Column(name = "cdhquedrawnname")
	private String chequeSubmitedBy;
	
	@Column(name="cashpaiddate")
	private Date cashPaidDate;
	@Column(name="cashamount")
	private float cashAmount;
	@Column(name="cashpaidby")
	private String cashPaidBy;
	
	@Column(name = "onlinetransactionrefid")
	private String onlineTransactionId;
	@Column(name="onlinetranamount")
	private float onlineTranAmount;
	@Column(name="onlinetransactiondate")
	private Date onlinetransactiondate;
	/*
	 * @Column(name = "bankmode") private String bankMode;
	 */@Column(name = "onlinetranbankingcharges")
	private float bankingCharges;
	/*
	 * @Column(name = "bank") private String transctionbank;
	 */
	@Column(name = "dddrawnbank")
	private String ddBank;
	@Column(name="dddrawnkdate")
	private Date ddDrawnkDate;
	@Column(name = "ddamount")
	private float ddAmount;
	@Column(name = "ddnumber")
	private String ddNumber;
	@Column(name = "ddissuername")
	private String ddIssuerName;
	
	@Column(name = "paymentid")
	private int paymentId;

	public int getPaymentdetailsid() {
		return paymentdetailsid;
	}

	public void setPaymentdetailsid(int paymentdetailsid) {
		this.paymentdetailsid = paymentdetailsid;
	}

	public String getPaymentNo() {
		return paymentNo;
	}

	public void setPaymentNo(String paymentNo) {
		this.paymentNo = paymentNo;
	}

	public int getPaymentMode() {
		return paymentMode;
	}

	public void setPaymentMode(int paymentMode) {
		this.paymentMode = paymentMode;
	}

	public String getChequeNumber() {
		return chequeNumber;
	}

	public void setChequeNumber(String chequeNumber) {
		this.chequeNumber = chequeNumber;
	}

	public String getChequeBank() {
		return chequeBank;
	}

	public void setChequeBank(String chequeBank) {
		this.chequeBank = chequeBank;
	}

	public float getChequeAmount() {
		return chequeAmount;
	}

	public void setChequeAmount(float chequeAmount) {
		this.chequeAmount = chequeAmount;
	}

	public Date getChequeDate() {
		return chequeDate;
	}

	public void setChequeDate(Date chequeDate) {
		this.chequeDate = chequeDate;
	}

	public String getChequeSubmitedBy() {
		return chequeSubmitedBy;
	}

	public void setChequeSubmitedBy(String chequeSubmitedBy) {
		this.chequeSubmitedBy = chequeSubmitedBy;
	}

	public Date getCashPaidDate() {
		return cashPaidDate;
	}

	public void setCashPaidDate(Date cashPaidDate) {
		this.cashPaidDate = cashPaidDate;
	}

	public float getCashAmount() {
		return cashAmount;
	}

	public void setCashAmount(float cashAmount) {
		this.cashAmount = cashAmount;
	}

	public String getCashPaidBy() {
		return cashPaidBy;
	}

	public void setCashPaidBy(String cashPaidBy) {
		this.cashPaidBy = cashPaidBy;
	}

	public String getOnlineTransactionId() {
		return onlineTransactionId;
	}

	public void setOnlineTransactionId(String onlineTransactionId) {
		this.onlineTransactionId = onlineTransactionId;
	}

	public float getOnlineTranAmount() {
		return onlineTranAmount;
	}

	public void setOnlineTranAmount(float onlineTranAmount) {
		this.onlineTranAmount = onlineTranAmount;
	}

	public Date getOnlinetransactiondate() {
		return onlinetransactiondate;
	}

	public void setOnlinetransactiondate(Date onlinetransactiondate) {
		this.onlinetransactiondate = onlinetransactiondate;
	}

	public float getBankingCharges() {
		return bankingCharges;
	}

	public void setBankingCharges(float bankingCharges) {
		this.bankingCharges = bankingCharges;
	}

	public String getDdBank() {
		return ddBank;
	}

	public void setDdBank(String ddBank) {
		this.ddBank = ddBank;
	}

	public Date getDdDrawnkDate() {
		return ddDrawnkDate;
	}

	public void setDdDrawnkDate(Date ddDrawnkDate) {
		this.ddDrawnkDate = ddDrawnkDate;
	}

	public float getDdAmount() {
		return ddAmount;
	}

	public void setDdAmount(float ddAmount) {
		this.ddAmount = ddAmount;
	}

	public String getDdNumber() {
		return ddNumber;
	}

	public void setDdNumber(String ddNumber) {
		this.ddNumber = ddNumber;
	}

	public String getDdIssuerName() {
		return ddIssuerName;
	}

	public void setDdIssuerName(String ddIssuerName) {
		this.ddIssuerName = ddIssuerName;
	}

	public int getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(int paymentId) {
		this.paymentId = paymentId;
	}
	
	
	
	
	
}
