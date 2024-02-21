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
public class AUCSalenoteLoan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int glid;
	@Column(name="TBGRNO")
	private int tbgrno;
	@Column(name="Loan_Code")
	private int loanCode;
	@Column(name="Opening_Principal")
	private Double openingPrincipal;
	@Column(name="Total_Interest")
	private Double totalInterest;
	@Column(name="Closing_Balance")
    private Double closingBalance;
	@Column(name="Created_By")
    private String createdBy;
	@Column(name="Created_On")
    private Date createdOn;
	@Column(name="Updated_By")
    private String updatedBy;
	@Column(name="Updated_On")
    private Date updatedOn;
	@Column(name="Loan_Sanction_Date")
    private Date loanSanctionDate;
	@Column(name="Interest_Accrued_Till_Date")
    private Date interestAccruedTillDate;
	@Column(name="Loan_Status")
    private String  loanStatus;
	@Column(name="Total_Deductions")
    private Double totalDeductions;
	@Column(name="PLATFORM_CODE")
    private int platformCODE;
	@Column(name="Selected_Guarantor_TbgrNo")
    private Integer selectedGuarantorTbgrNo;
	@Column(name="Defaulter_Flag")
    private char defaulterFlag;
	private Date inserteddate;
	private int status;
	public int getGlid() {
		return glid;
	}
	public void setGlid(int glid) {
		this.glid = glid;
	}
	public int getTbgrno() {
		return tbgrno;
	}
	public void setTbgrno(int tbgrno) {
		this.tbgrno = tbgrno;
	}
	public int getLoanCode() {
		return loanCode;
	}
	public void setLoanCode(int loanCode) {
		this.loanCode = loanCode;
	}
	public Double getOpeningPrincipal() {
		return openingPrincipal;
	}
	public void setOpeningPrincipal(Double openingPrincipal) {
		this.openingPrincipal = openingPrincipal;
	}
	public Double getTotalInterest() {
		return totalInterest;
	}
	public void setTotalInterest(Double totalInterest) {
		this.totalInterest = totalInterest;
	}
	public Double getClosingBalance() {
		return closingBalance;
	}
	public void setClosingBalance(Double closingBalance) {
		this.closingBalance = closingBalance;
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
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public Date getLoanSanctionDate() {
		return loanSanctionDate;
	}
	public void setLoanSanctionDate(Date loanSanctionDate) {
		this.loanSanctionDate = loanSanctionDate;
	}
	public Date getInterestAccruedTillDate() {
		return interestAccruedTillDate;
	}
	public void setInterestAccruedTillDate(Date interestAccruedTillDate) {
		this.interestAccruedTillDate = interestAccruedTillDate;
	}
	public String getLoanStatus() {
		return loanStatus;
	}
	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}
	public Double getTotalDeductions() {
		return totalDeductions;
	}
	public void setTotalDeductions(Double totalDeductions) {
		this.totalDeductions = totalDeductions;
	}
	public int getPlatformCODE() {
		return platformCODE;
	}
	public void setPlatformCODE(int platformCODE) {
		this.platformCODE = platformCODE;
	}
	public Integer getSelectedGuarantorTbgrNo() {
		return selectedGuarantorTbgrNo;
	}
	public void setSelectedGuarantorTbgrNo(Integer selectedGuarantorTbgrNo) {
		this.selectedGuarantorTbgrNo = selectedGuarantorTbgrNo;
	}
	public char getDefaulterFlag() {
		return defaulterFlag;
	}
	public void setDefaulterFlag(char defaulterFlag) {
		this.defaulterFlag = defaulterFlag;
	}
	public Date getInserteddate() {
		return inserteddate;
	}
	public void setInserteddate(Date inserteddate) {
		this.inserteddate = inserteddate;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	
	
	
	
}
