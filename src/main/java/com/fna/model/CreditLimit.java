package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="creditlimitsetting")
public class CreditLimit {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int creditlimitid;
	@Column(name="buyerid")
	private int buyerId;
	@Column(name="creditlimitamount")
	private float limitAmount;
	@Column(name="creditlimitutilize")
	private float limitUtilize;
	@Column(name="creditlimitbalance")
	private float limitBalance;
	public int getCreditlimitid() {
		return creditlimitid;
	}
	public void setCreditlimitid(int creditlimitid) {
		this.creditlimitid = creditlimitid;
	}
	public int getBuyerId() {
		return buyerId;
	}
	public void setBuyerId(int buyerId) {
		this.buyerId = buyerId;
	}
	public float getLimitAmount() {
		return limitAmount;
	}
	public void setLimitAmount(float limitAmount) {
		this.limitAmount = limitAmount;
	}
	public float getLimitUtilize() {
		return limitUtilize;
	}
	public void setLimitUtilize(float limitUtilize) {
		this.limitUtilize = limitUtilize;
	}
	public float getLimitBalance() {
		return limitBalance;
	}
	public void setLimitBalance(float limitBalance) {
		this.limitBalance = limitBalance;
	}
	
	
	
}
