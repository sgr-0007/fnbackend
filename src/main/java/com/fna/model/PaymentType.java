package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymenttypemaster")
public class PaymentType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="paymentstatusid")
	int paymentStatusId;
	@Column(name="paymentstatusname")
	String paymentStatusName;
	@Column(name="paymentstatusdescription")
	String paymentStatusDes;
	@Column(name="isactive")
	byte isActive;
	public int getPaymentStatusId() {
		return paymentStatusId;
	}
	public void setPaymentStatusId(int paymentStatusId) {
		this.paymentStatusId = paymentStatusId;
	}
	public String getPaymentStatusName() {
		return paymentStatusName;
	}
	public void setPaymentStatusName(String paymentStatusName) {
		this.paymentStatusName = paymentStatusName;
	}
	public String getPaymentStatusDes() {
		return paymentStatusDes;
	}
	public void setPaymentStatusDes(String paymentStatusDes) {
		this.paymentStatusDes = paymentStatusDes;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}	
	
	

}
