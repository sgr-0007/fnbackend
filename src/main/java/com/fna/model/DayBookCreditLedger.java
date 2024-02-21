package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DayBookCreditLedger {

	@Id
	@Column(name = "creditledger")
	int creditledger;
	@Column(name = "sumcredit")
	Double sumcredit;
	public int getCreditledger() {
		return creditledger;
	}
	public void setCreditledger(int creditledger) {
		this.creditledger = creditledger;
	}
	public Double getSumcredit() {
		return sumcredit;
	} 
	public void setSumcredit(Double sumcredit) {
		this.sumcredit = sumcredit;
	}
	public DayBookCreditLedger(int creditledger, Double sumcredit) {
		
		this.creditledger = creditledger;
		this.sumcredit = sumcredit;
	}
	public DayBookCreditLedger() {
		
		
	}
	@Override
	public String toString() {
		return "DayBookCreditLedger [creditledger=" + creditledger + ", sumcredit=" + sumcredit + "]";
	}
	
	
}
