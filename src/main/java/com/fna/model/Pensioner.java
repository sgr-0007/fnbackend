package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pensioner")
public class Pensioner {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pensionerid;
	private String annuityno;
	private String pensioner;
	private String designationpensioner;
	private String accnopensioner;
	private String ifscpensioner;
	public int getPensionerid() {
		return pensionerid;
	}
	public void setPensionerid(int pensionerid) {
		this.pensionerid = pensionerid;
	}
	public String getAnnuityno() {
		return annuityno;
	}
	public void setAnnuityno(String annuityno) {
		this.annuityno = annuityno;
	}
	public String getPensioner() {
		return pensioner;
	}
	public void setPensioner(String pensioner) {
		this.pensioner = pensioner;
	}
	public String getDesignationpensioner() {
		return designationpensioner;
	}
	public void setDesignationpensioner(String designationpensioner) {
		this.designationpensioner = designationpensioner;
	}
	public String getAccnopensioner() {
		return accnopensioner;
	}
	public void setAccnopensioner(String accnopensioner) {
		this.accnopensioner = accnopensioner;
	}
	public String getIfscpensioner() {
		return ifscpensioner;
	}
	public void setIfscpensioner(String ifscpensioner) {
		this.ifscpensioner = ifscpensioner;
	}
}
