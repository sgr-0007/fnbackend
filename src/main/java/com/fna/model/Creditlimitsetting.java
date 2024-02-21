package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "creditlimitsetting")
public class Creditlimitsetting {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int creditlimitid;
	  @Column(name = "buyerid")
	  private int buyerid;
//	  @Column(name = "ledgerid")
//	  private int ledgerid;
	  @Column(name = "creditlimitamount")
	  private double creditlimitamount;
	  @Column(name = "creditlimitutilize")
	  private double creditlimitutilize;
	  @Column(name = "creditlimitbalance")
	  private double creditlimitbalance;
	  @Column(name = "creditlimitcreateddate",updatable = false)
	  @CreationTimestamp
	  private Date creditlimitcreateddate;
	  private int creditlimitcreatedby;
	  private int creditlimitcheckedby;
	  private int creditlimitapprovedby;
	  @Column(name = "creditlimitapproveddate",updatable = false)
	  @CreationTimestamp
	  private Date creditlimitapproveddate;
	  @Column(name = "creditlimitcheckeddate",updatable = false)
	  @CreationTimestamp
	  private Date creditlimitcheckeddate;
	  @Column(name = "ledgername")
	  private String ledgername;
	  
	public int getBuyerid() {
		return buyerid;
	}
	public void setBuyerid(int buyerid) {
		this.buyerid = buyerid;
	}
	public String getLedgername() {
		return ledgername;
	}
	public void setLedgername(String ledgername) {
		this.ledgername = ledgername;
	}
	/**
	 * @return the creditlimitid
	 */
	public int getCreditlimitid() {
		return creditlimitid;
	}
	/**
	 * @param creditlimitid the creditlimitid to set
	 */
	public void setCreditlimitid(int creditlimitid) {
		this.creditlimitid = creditlimitid;
	}
	/**
	 * @return the buyerid
	 */
//	public int getBuyerid() {
//		return buyerid;
//	}
//	/**
//	 * @param buyerid the buyerid to set
//	 */
//	public void setBuyerid(int buyerid) {
//		this.buyerid = buyerid;
//	}
	/**
	 * @return the creditlimitamount
	 */
	public double getCreditlimitamount() {
		return creditlimitamount;
	}
	/**
	 * @param creditlimitamount the creditlimitamount to set
	 */
	public void setCreditlimitamount(double creditlimitamount) {
		this.creditlimitamount = creditlimitamount;
	}
	/**
	 * @return the creditlimitutilize
	 */
	public double getCreditlimitutilize() {
		return creditlimitutilize;
	}
	/**
	 * @param creditlimitutilize the creditlimitutilize to set
	 */
	public void setCreditlimitutilize(double creditlimitutilize) {
		this.creditlimitutilize = creditlimitutilize;
	}
	/**
	 * @return the creditlimitbalance
	 */
	public double getCreditlimitbalance() {
		return creditlimitbalance;
	}
	/**
	 * @param creditlimitbalance the creditlimitbalance to set
	 */
	public void setCreditlimitbalance(double creditlimitbalance) {
		this.creditlimitbalance = creditlimitbalance;
	}
	/**
	 * @return the creditlimitcreateddate
	 */
	public Date getCreditlimitcreateddate() {
		return creditlimitcreateddate;
	}
	/**
	 * @param creditlimitcreateddate the creditlimitcreateddate to set
	 */
	public void setCreditlimitcreateddate(Date creditlimitcreateddate) {
		this.creditlimitcreateddate = creditlimitcreateddate;
	}
	/**
	 * @return the creditlimitcreatedby
	 */
	public int getCreditlimitcreatedby() {
		return creditlimitcreatedby;
	}
	/**
	 * @param creditlimitcreatedby the creditlimitcreatedby to set
	 */
	public void setCreditlimitcreatedby(int creditlimitcreatedby) {
		this.creditlimitcreatedby = creditlimitcreatedby;
	}
	/**
	 * @return the creditlimitcheckedby
	 */
	public int getCreditlimitcheckedby() {
		return creditlimitcheckedby;
	}
	/**
	 * @param creditlimitcheckedby the creditlimitcheckedby to set
	 */
	public void setCreditlimitcheckedby(int creditlimitcheckedby) {
		this.creditlimitcheckedby = creditlimitcheckedby;
	}
	/**
	 * @return the creditlimitcheckeddate
	 */
	public Date getCreditlimitcheckeddate() {
		return creditlimitcheckeddate;
	}
	/**
	 * @param creditlimitcheckeddate the creditlimitcheckeddate to set
	 */
	public void setCreditlimitcheckeddate(Date creditlimitcheckeddate) {
		this.creditlimitcheckeddate = creditlimitcheckeddate;
	}
	/**
	 * @return the creditlimitapprovedby
	 */
	public int getCreditlimitapprovedby() {
		return creditlimitapprovedby;
	}
	/**
	 * @param creditlimitapprovedby the creditlimitapprovedby to set
	 */
	public void setCreditlimitapprovedby(int creditlimitapprovedby) {
		this.creditlimitapprovedby = creditlimitapprovedby;
	}
	/**
	 * @return the creditlimitapproveddate
	 */
	public Date getCreditlimitapproveddate() {
		return creditlimitapproveddate;
	}
	/**
	 * @param creditlimitapproveddate the creditlimitapproveddate to set
	 */
	public void setCreditlimitapproveddate(Date creditlimitapproveddate) {
		this.creditlimitapproveddate = creditlimitapproveddate;
	}
	
	@Override
	public String toString() {
		return "Creditlimitsetting [creditlimitid=" + creditlimitid + ", buyerid=" + buyerid + ", creditlimitamount="
				+ creditlimitamount + ", creditlimitutilize=" + creditlimitutilize + ", creditlimitbalance="
				+ creditlimitbalance + ", creditlimitcreateddate=" + creditlimitcreateddate + ", creditlimitcreatedby="
				+ creditlimitcreatedby + ", creditlimitcheckedby=" + creditlimitcheckedby + ", creditlimitcheckeddate="
				+ creditlimitcheckeddate + ", creditlimitapprovedby=" + creditlimitapprovedby
				+ ", creditlimitapproveddate=" + creditlimitapproveddate + ", ledgername=" + ledgername + "]";
	}
	
	public Creditlimitsetting(int creditlimitid, int buyerid, double creditlimitamount, double creditlimitutilize,
			double creditlimitbalance, Date creditlimitcreateddate, int creditlimitcreatedby, int creditlimitcheckedby,
			int creditlimitapprovedby, Date creditlimitapproveddate, Date creditlimitcheckeddate, String ledgername) {
		super();
		this.creditlimitid = creditlimitid;
		this.buyerid = buyerid;
		this.creditlimitamount = creditlimitamount;
		this.creditlimitutilize = creditlimitutilize;
		this.creditlimitbalance = creditlimitbalance;
		this.creditlimitcreateddate = creditlimitcreateddate;
		this.creditlimitcreatedby = creditlimitcreatedby;
		this.creditlimitcheckedby = creditlimitcheckedby;
		this.creditlimitapprovedby = creditlimitapprovedby;
		this.creditlimitapproveddate = creditlimitapproveddate;
		this.creditlimitcheckeddate = creditlimitcheckeddate;
		this.ledgername = ledgername;
	}
	public Creditlimitsetting() {
		super();
	}
	

}
