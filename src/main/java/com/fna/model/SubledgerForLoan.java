package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "subledgermaster")
public class SubledgerForLoan {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int subledgerid;
	private Integer ledgerid;
	private String subledgername;
	private int loancode;
	private int auctionoradmin;

	public int getSubledgerid() {
		return subledgerid;
	}

	public void setSubledgerid(int subledgerid) {
		this.subledgerid = subledgerid;
	}

	public Integer getLedgerid() {
		return ledgerid;
	}

	public void setLedgerid(Integer ledgerid) {
		this.ledgerid = ledgerid;
	}

	public String getSubledgername() {
		return subledgername;
	}

	public void setSubledgername(String subledgername) {
		this.subledgername = subledgername;
	}

	public int getLoancode() {
		return loancode;
	}

	public void setLoancode(int loancode) {
		this.loancode = loancode;
	}

	public int getAuctionoradmin() {
		return auctionoradmin;
	}

	public void setAuctionoradmin(int auctionoradmin) {
		this.auctionoradmin = auctionoradmin;
	}

}
