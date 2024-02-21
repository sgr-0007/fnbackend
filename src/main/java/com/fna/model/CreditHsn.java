package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CreditHsn {
	@Id
	private int credithsnsacid;
	
	@Column(name = "credithsnsaccode")
	private String credithsnsaccode;

	public int getCredithsnsacid() {
		return credithsnsacid;
	}

	public void setCredithsnsacid(int credithsnsacid) {
		this.credithsnsacid = credithsnsacid;
	}

	public String getCredithsnsaccode() {
		return credithsnsaccode;
	}

	public void setCredithsnsaccode(String credithsnsaccode) {
		this.credithsnsaccode = credithsnsaccode;
	}
	
	
}
