package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class itBuyerVendorDdl {
	@Id
	private int itbvledgerid;
	private String itbvledgeralias;
	public int getItbvledgerid() {
		return itbvledgerid;
	}
	public void setItbvledgerid(int itbvledgerid) {
		this.itbvledgerid = itbvledgerid;
	}
	public String getItbvledgeralias() {
		return itbvledgeralias;
	}
	public void setItbvledgeralias(String itbvledgeralias) {
		this.itbvledgeralias = itbvledgeralias;
	}
}
