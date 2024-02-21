package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pensionerfamily")
public class PensionerFamily {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int pensionerfamilyid;
	private String annuitynofamily;	
	private String pensionerfamily;
	private String wo;
	private String designationpensionerfamily;
	private String accnopensionerfamily;
	private String ifscpensionerfamily;
	public int getPensionerfamilyid() {
		return pensionerfamilyid;
	}
	public void setPensionerfamilyid(int pensionerfamilyid) {
		this.pensionerfamilyid = pensionerfamilyid;
	}
	public String getAnnuitynofamily() {
		return annuitynofamily;
	}
	public void setAnnuitynofamily(String annuitynofamily) {
		this.annuitynofamily = annuitynofamily;
	}
	public String getPensionerfamily() {
		return pensionerfamily;
	}
	public void setPensionerfamily(String pensionerfamily) {
		this.pensionerfamily = pensionerfamily;
	}
	public String getWo() {
		return wo;
	}
	public void setWo(String wo) {
		this.wo = wo;
	}
	public String getDesignationpensionerfamily() {
		return designationpensionerfamily;
	}
	public void setDesignationpensionerfamily(String designationpensionerfamily) {
		this.designationpensionerfamily = designationpensionerfamily;
	}
	public String getAccnopensionerfamily() {
		return accnopensionerfamily;
	}
	public void setAccnopensionerfamily(String accnopensionerfamily) {
		this.accnopensionerfamily = accnopensionerfamily;
	}
	public String getIfscpensionerfamily() {
		return ifscpensionerfamily;
	}
	public void setIfscpensionerfamily(String ifscpensionerfamily) {
		this.ifscpensionerfamily = ifscpensionerfamily;
	}

}
