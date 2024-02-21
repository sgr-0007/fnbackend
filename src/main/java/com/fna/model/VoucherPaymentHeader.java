package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voucherpaymentheader")
public class VoucherPaymentHeader {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer voucherpaymentheaderid;
	
	private Integer voucherid;
	public Integer getVoucherpaymentheaderid() {
		return voucherpaymentheaderid;
	}
	public void setVoucherpaymentheaderid(Integer voucherpaymentheaderid) {
		this.voucherpaymentheaderid = voucherpaymentheaderid;
	}
	public Integer getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	private String bank;

}
