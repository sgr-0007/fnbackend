package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class DayBookDebitLedger {

	@Id
	@Column(name = "debitledger")
	int debitledger;
	@Column(name = "sumdebit")
	Double sumdebit;
	public int getDebitledger() {
		return debitledger;
	}
	public void setDebitledger(int debitledger) {
		this.debitledger = debitledger;
	}
	public Double getSumdebit() {
		return sumdebit;
	}
	public void setSumdebit(Double sumdebit) {
		this.sumdebit = sumdebit;
	}
	public DayBookDebitLedger(int debitledger, Double sumdebit) {
		
		this.debitledger = debitledger;
		this.sumdebit = sumdebit;
	}
public DayBookDebitLedger() {
		
	}
	@Override
	public String toString() {
		return "DayBookDebitLedger [debitledger=" + debitledger + ", sumdebit=" + sumdebit + "]";
	} 
	
	
}
