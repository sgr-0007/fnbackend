package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DebitHsn {

	@Id
	private int debithsnsacid;
	
	@Column(name = "debithsnsaccode")
	private String debithsnsaccode;

	public int getDebithsnsacid() {
		return debithsnsacid;
	}

	public void setDebithsnsacid(int debithsnsacid) {
		this.debithsnsacid = debithsnsacid;
	}

	public String getDebithsnsaccode() {
		return debithsnsaccode;
	}

	public void setDebithsnsaccode(String debithsnsaccode) {
		this.debithsnsaccode = debithsnsaccode;
	}
	
}
