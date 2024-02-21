package com.fna.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="userofficemapping")
public class AssignOffice {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) 
	private int rolemappingid;
	private int userid;
	private int officeid;
	@Transient
	private List<Integer> officelist;
	public int getRolemappingid() {
		return rolemappingid;
	}
	public void setRolemappingid(int rolemappingid) {
		this.rolemappingid = rolemappingid;
	}
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	public int getOfficeid() {
		return officeid;
	}
	public void setOfficeid(int officeid) {
		this.officeid = officeid;
	}
	public List<Integer> getOfficelist() {
		return officelist;
	}
	public void setOfficelist(List<Integer> officelist) {
		this.officelist = officelist;
	}
	
	
}
