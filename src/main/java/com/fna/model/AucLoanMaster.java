package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
@Table(name="auc_loan_master")
public class AucLoanMaster {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int lmid;
	private Integer loancode;
	private String loanhead;
	private Integer priority;
	private char defermenttype;
	private Integer defermentvalue;
	private String createdby;
	private Date createdon;
	private char active;
	private String updatedby;
	private Date updatedon;
	private double interest;
	private int status;
	private Date cdate;
	private Date mdate;
	public int getLmid() {
		return lmid;
	}
	public void setLmid(int lmid) {
		this.lmid = lmid;
	}
	public Integer getLoancode() {
		return loancode;
	}
	public void setLoancode(Integer loancode) {
		this.loancode = loancode;
	}
	public String getLoanhead() {
		return loanhead;
	}
	public void setLoanhead(String loanhead) {
		this.loanhead = loanhead;
	}
	public Integer getPriority() {
		return priority;
	}
	public void setPriority(Integer priority) {
		this.priority = priority;
	}
	public char getDefermenttype() {
		return defermenttype;
	}
	public void setDefermenttype(char defermenttype) {
		this.defermenttype = defermenttype;
	}
	public Integer getDefermentvalue() {
		return defermentvalue;
	}
	public void setDefermentvalue(Integer defermentvalue) {
		this.defermentvalue = defermentvalue;
	}
	public String getCreatedby() {
		return createdby;
	}
	public void setCreatedby(String createdby) {
		this.createdby = createdby;
	}
	public Date getCreatedon() {
		return createdon;
	}
	public void setCreatedon(Date createdon) {
		this.createdon = createdon;
	}
	public char getActive() {
		return active;
	}
	public void setActive(char active) {
		this.active = active;
	}
	public String getUpdatedby() {
		return updatedby;
	}
	public void setUpdatedby(String updatedby) {
		this.updatedby = updatedby;
	}
	public Date getUpdatedon() {
		return updatedon;
	}
	public void setUpdatedon(Date updatedon) {
		this.updatedon = updatedon;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public Date getCdate() {
		return cdate;
	}
	public void setCdate(Date cdate) {
		this.cdate = cdate;
	}
	public Date getMdate() {
		return mdate;
	}
	public void setMdate(Date mdate) {
		this.mdate = mdate;
	}
	
	
	
	
}
