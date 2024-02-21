package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vouchertype")
public class VoucherType {
	
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int vouchertypeid;
	@Column(name = "vouchertypename")
	  private String vouchertypename;
	  @Column(name = "vouchertypedescription")
	  private String vouchertypedescription;
	public int getVouchertypeid() {
		return vouchertypeid;
	}
	public void setVouchertypeid(int vouchertypeid) {
		this.vouchertypeid = vouchertypeid;
	}
	public String getVouchertypename() {
		return vouchertypename;
	}
	public void setVouchertypename(String vouchertypename) {
		this.vouchertypename = vouchertypename;
	}
	public String getVouchertypedescription() {
		return vouchertypedescription;
	}
	public void setVouchertypedescription(String vouchertypedescription) {
		this.vouchertypedescription = vouchertypedescription;
	}
	public VoucherType(int vouchertypeid, String vouchertypename, String vouchertypedescription) {
		super();
		this.vouchertypeid = vouchertypeid;
		this.vouchertypename = vouchertypename;
		this.vouchertypedescription = vouchertypedescription;
	}
	public VoucherType() {
		
		
	}
	@Override
	public String toString() {
		return "VoucherType [vouchertypeid=" + vouchertypeid + ", vouchertypename=" + vouchertypename
				+ ", vouchertypedescription=" + vouchertypedescription + "]";
	} 
	


}
