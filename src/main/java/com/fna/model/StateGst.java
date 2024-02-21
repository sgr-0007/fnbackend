package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class StateGst {
	@Id
	@Column(name = "stateid")
	private int stateid;
	@Column(name = "statename")
	private String statename;
	@Column(name = "gstcode")
	private Integer gstcode;
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public Integer getGstcode() {
		return gstcode;
	}
	public void setGstcode(Integer gstcode) {
		this.gstcode = gstcode;
	}
	
}
