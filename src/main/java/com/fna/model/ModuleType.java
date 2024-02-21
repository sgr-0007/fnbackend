package com.fna.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "filemoduletype")
public class ModuleType {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int filemoduletypeid;
	private String filemaodulename;
	private int isactive;
	public int getFilemoduletypeid() {
		return filemoduletypeid;
	}
	public void setFilemoduletypeid(int filemoduletypeid) {
		this.filemoduletypeid = filemoduletypeid;
	}
	public String getFilemaodulename() {
		return filemaodulename;
	}
	public void setFilemaodulename(String filemaodulename) {
		this.filemaodulename = filemaodulename;
	}
	public int getIsactive() {
		return isactive;
	}
	public void setIsactive(int isactive) {
		this.isactive = isactive;
	}
	
	
	
}