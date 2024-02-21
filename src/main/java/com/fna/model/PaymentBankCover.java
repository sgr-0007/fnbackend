package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "paymentbankcoverdetails")
public class PaymentBankCover {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int bankcoverpayid;
	 
	  @Column(name = "infavourof")	  
	  private String infavourof;
	  
	  public String getInfavourof() {
		return infavourof;
	}

	public void setInfavourof(String infavourof) {
		this.infavourof = infavourof;
	}

	@Column(name = "buyerinfavourof")	  
	  private String buyerinfavourof;
	  
	  @Column(name = "employeeinfavourof")	  
	  private String employeeinfavourof;
	  
	  @Column(name = "voucherid")	  
	  private Integer voucherid;
	 
	  @Column(name = "voucherdetailid")
	  private Integer voucherdetailid;
	  
	  @Column(name = "amount")
	  private Double amount;
	  
	  @Column(name = "ban")
	  private String ban;
	  
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;

	  private String pensionerinfavourof;
	  private String pensionerfamilyinfavourof;
	  private String branchdetailsinfavourof;

	  
	public String getBranchdetailsinfavourof() {
		return branchdetailsinfavourof;
	}

	public void setBranchdetailsinfavourof(String branchdetailsinfavourof) {
		this.branchdetailsinfavourof = branchdetailsinfavourof;
	}

	public String getPensionerinfavourof() {
		return pensionerinfavourof;
	}

	public void setPensionerinfavourof(String pensionerinfavourof) {
		this.pensionerinfavourof = pensionerinfavourof;
	}

	public String getPensionerfamilyinfavourof() {
		return pensionerfamilyinfavourof;
	}

	public void setPensionerfamilyinfavourof(String pensionerfamilyinfavourof) {
		this.pensionerfamilyinfavourof = pensionerfamilyinfavourof;
	}

	public int getBankcoverpayid() {
		return bankcoverpayid;
	}

	public void setBankcoverpayid(int bankcoverpayid) {
		this.bankcoverpayid = bankcoverpayid;
	}



	public String getBuyerinfavourof() {
		return buyerinfavourof;
	}

	public void setBuyerinfavourof(String buyerinfavourof) {
		this.buyerinfavourof = buyerinfavourof;
	}

	public String getEmployeeinfavourof() {
		return employeeinfavourof;
	}

	public void setEmployeeinfavourof(String employeeinfavourof) {
		this.employeeinfavourof = employeeinfavourof;
	}

	public Integer getVoucherid() {
		return voucherid;
	}

	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}

	public Integer getVoucherdetailid() {
		return voucherdetailid;
	}

	public void setVoucherdetailid(Integer voucherdetailid) {
		this.voucherdetailid = voucherdetailid;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public String getBan() {
		return ban;
	}

	public void setBan(String ban) {
		this.ban = ban;
	}

	public Date getCreateddate() {
		return createddate;
	}

	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	  
	  

}
