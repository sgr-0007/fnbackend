package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserModuleCheckDetails {

	  @Id
	  private int filemoduletypeid;
	  @Column(name = "filemaodulename")
	  private String filemaodulename;
	
	
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


	public UserModuleCheckDetails(int filemoduletypeid, String filemaodulename) {
		super();
		this.filemoduletypeid = filemoduletypeid;
		this.filemaodulename = filemaodulename;
	}


	public UserModuleCheckDetails() {
		// TODO Auto-generated constructor stub
	}

}
