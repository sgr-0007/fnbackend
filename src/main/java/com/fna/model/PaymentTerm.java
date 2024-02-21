package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="paymentterms")
public class PaymentTerm {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paymenttermsid")
	int paymentTermsId;
	@Column(name = "paymenttermsname")
	String paymentTermsName;
	@Column(name = "paymenttermsdescription")
	String paymentTermsDescription;
	@Column(name = "noofcreditdays")
	int noofCreditDays;
	public int getPaymentTermsId() {
		return paymentTermsId;
	}
	public void setPaymentTermsId(int paymentTermsId) {
		this.paymentTermsId = paymentTermsId;
	}
	public String getPaymentTermsName() {
		return paymentTermsName;
	}
	public void setPaymentTermsName(String paymentTermsName) {
		this.paymentTermsName = paymentTermsName;
	}
	public String getPaymentTermsDescription() {
		return paymentTermsDescription;
	}
	public void setPaymentTermsDescription(String paymentTermsDescription) {
		this.paymentTermsDescription = paymentTermsDescription;
	}
	public int getNoofCreditDays() {
		return noofCreditDays;
	}
	public void setNoofCreditDays(int noofCreditDays) {
		this.noofCreditDays = noofCreditDays;
	}
	
	

}
