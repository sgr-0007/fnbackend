package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="hsnsacmaster")
public class HsnSacDetails {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int hsnsacid;
	
	@Column(name = "hsnsaccode")
	private String hsnsaccode;
	@Column(name = "hsnsacdescription")
	private String hsnsacdescription;
	public int getHsnsacid() {
		return hsnsacid;
	}
	public void setHsnsacid(int hsnsacid) {
		this.hsnsacid = hsnsacid;
	}
	public String getHsnsaccode() {
		return hsnsaccode;
	}
	public void setHsnsaccode(String hsnsaccode) {
		this.hsnsaccode = hsnsaccode;
	}
	public String getHsnsacdescription() {
		return hsnsacdescription;
	}
	public void setHsnsacdescription(String hsnsacdescription) {
		this.hsnsacdescription = hsnsacdescription;
	}
	
	

}
