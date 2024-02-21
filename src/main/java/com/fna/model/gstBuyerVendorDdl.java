package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class gstBuyerVendorDdl {
	@Id
	private int gstbvledgerid;
	private String gstbvledgeralias;
	public int getGstbvledgerid() {
		return gstbvledgerid;
	}
	public void setGstbvledgerid(int gstbvledgerid) {
		this.gstbvledgerid = gstbvledgerid;
	}
	public String getGstbvledgeralias() {
		return gstbvledgeralias;
	}
	public void setGstbvledgeralias(String gstbvledgeralias) {
		this.gstbvledgeralias = gstbvledgeralias;
	}
}
