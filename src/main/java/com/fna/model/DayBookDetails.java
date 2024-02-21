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
@Table(name = "daybookopeningclosing")

public class DayBookDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int daybookledgerid;
	@Column(name = "ledgerid")
	private Integer ledgerid;
	@Column(name = "companyid")
	private Integer companyid;
	@Column(name = "openingbalance")
	private Double openingbalance;
	@Column(name = "closingbalance")
	private Double closingbalance; 
	@Column(name = "daybookdate")
    private Date daybookdate;
	@Column(name = "daybookopenedby")
	private Integer daybookopenedby;
    @Column(name = "daybookopeneddatetime",updatable = true)
	@CreationTimestamp
	private Date daybookopeneddatetime;
    @Column(name = "daybookclosedby")
	private Integer daybookclosedby;
    @Column(name = "daybookcloseddatetime",updatable = true)
	@CreationTimestamp
	private Date daybookcloseddatetime;
	public int getDaybookledgerid() {
		return daybookledgerid;
	}
	public void setDaybookledgerid(int daybookledgerid) {
		this.daybookledgerid = daybookledgerid;
	}
	public Integer getLedgerid() {
		return ledgerid;
	}
	public void setLedgerid(Integer ledgerid) {
		this.ledgerid = ledgerid;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	public Double getOpeningbalance() {
		return openingbalance;
	}
	public void setOpeningbalance(Double openingbalance) {
		this.openingbalance = openingbalance;
	}
	public Double getClosingbalance() {
		return closingbalance;
	}
	public void setClosingbalance(Double closingbalance) {
		this.closingbalance = closingbalance;
	}
	public Date getDaybookdate() {
		return daybookdate;
	}
	public void setDaybookdate(Date daybookdate) {
		this.daybookdate = daybookdate;
	}
	public Integer getDaybookopenedby() {
		return daybookopenedby;
	}
	public void setDaybookopenedby(Integer daybookopenedby) {
		this.daybookopenedby = daybookopenedby;
	}
	public Date getDaybookopeneddatetime() {
		return daybookopeneddatetime;
	}
	public void setDaybookopeneddatetime(Date daybookopeneddatetime) {
		this.daybookopeneddatetime = daybookopeneddatetime;
	}
	public Integer getDaybookclosedby() {
		return daybookclosedby;
	}
	public void setDaybookclosedby(Integer daybookclosedby) {
		this.daybookclosedby = daybookclosedby;
	}
	public Date getDaybookcloseddatetime() {
		return daybookcloseddatetime;
	}
	public void setDaybookcloseddatetime(Date daybookcloseddatetime) {
		this.daybookcloseddatetime = daybookcloseddatetime;
	}
	@Override
	public String toString() {
		return "DayBookDetails [daybookledgerid=" + daybookledgerid + ", ledgerid=" + ledgerid + ", companyid="
				+ companyid + ", openingbalance=" + openingbalance + ", closingbalance=" + closingbalance
				+ ", daybookdate=" + daybookdate + ", daybookopenedby=" + daybookopenedby + ", daybookopeneddatetime="
				+ daybookopeneddatetime + ", daybookclosedby=" + daybookclosedby + ", daybookcloseddatetime="
				+ daybookcloseddatetime + "]";
	}
	public DayBookDetails(int daybookledgerid, Integer ledgerid, Integer companyid, Double openingbalance,
			Double closingbalance, Date daybookdate, Integer daybookopenedby, Date daybookopeneddatetime,
			Integer daybookclosedby, Date daybookcloseddatetime) {

		this.daybookledgerid = daybookledgerid;
		this.ledgerid = ledgerid;
		this.companyid = companyid;
		this.openingbalance = openingbalance;
		this.closingbalance = closingbalance;
		this.daybookdate = daybookdate;
		this.daybookopenedby = daybookopenedby;
		this.daybookopeneddatetime = daybookopeneddatetime;
		this.daybookclosedby = daybookclosedby;
		this.daybookcloseddatetime = daybookcloseddatetime;
	} 
	public DayBookDetails() {
		
	} 


	
}
