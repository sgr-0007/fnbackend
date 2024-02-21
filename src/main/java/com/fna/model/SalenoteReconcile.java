package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name="auc_salenote_reconcile")
public class SalenoteReconcile {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int srid;
	private Integer salenoteno;
	private Integer tbgrno;
	private String growername;
	private Integer voucherid;
	private String voucherno; 
	private Integer bankid;
	private String bankname;
	private double netamount;
	private Integer approvalstatus;
	private Date salenotedate;
	private String remark;
	@CreationTimestamp
	private Date createddate;
	private Integer createdby;
	private Integer updatedby;
	@UpdateTimestamp
	private Date updateddate;
	public int getSrid() {
		return srid;
	}
	public void setSrid(int srid) {
		this.srid = srid;
	}
	public Integer getSalenoteno() {
		return salenoteno;
	}
	public void setSalenoteno(Integer salenoteno) {
		this.salenoteno = salenoteno;
	}
	public Integer getTbgrno() {
		return tbgrno;
	}
	public void setTbgrno(Integer tbgrno) {
		this.tbgrno = tbgrno;
	}
	public String getGrowername() {
		return growername;
	}
	public void setGrowername(String growername) {
		this.growername = growername;
	}
	public Integer getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}
	public String getVoucherno() {
		return voucherno;
	}
	public void setVoucherno(String voucherno) {
		this.voucherno = voucherno;
	}
	public Integer getBankid() {
		return bankid;
	}
	public void setBankid(Integer bankid) {
		this.bankid = bankid;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public double getNetamount() {
		return netamount;
	}
	public void setNetamount(double netamount) {
		this.netamount = netamount;
	}
	public Integer getApprovalstatus() {
		return approvalstatus;
	}
	public void setApprovalstatus(Integer approvalstatus) {
		this.approvalstatus = approvalstatus;
	}
	public Date getSalenotedate() {
		return salenotedate;
	}
	public void setSalenotedate(Date salenotedate) {
		this.salenotedate = salenotedate;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public Date getCreateddate() {
		return createddate;
	}
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	public Integer getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}
	public Integer getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(Integer updatedby) {
		this.updatedby = updatedby;
	}
	public Date getUpdateddate() {
		return updateddate;
	}
	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	
	
}
