package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "uommaster")
public class Uom {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int uomid;
	  @Column(name = "uomname")
	  private String uomname;
	  @Column(name = "uomdescription")
	  private String uomdescription;
	  @Column(name = "isactive")
	  private boolean isactive;
	/**
	 * @return the uomid
	 */
	public int getUomid() {
		return uomid;
	}
	/**
	 * @param uomid the uomid to set
	 */
	public void setUomid(int uomid) {
		this.uomid = uomid;
	}
	/**
	 * @return the uomname
	 */
	public String getUomname() {
		return uomname;
	}
	/**
	 * @param uomname the uomname to set
	 */
	public void setUomname(String uomname) {
		this.uomname = uomname;
	}
	/**
	 * @return the uomdescription
	 */
	public String getUomdescription() {
		return uomdescription;
	}
	/**
	 * @param uomdescription the uomdescription to set
	 */
	public void setUomdescription(String uomdescription) {
		this.uomdescription = uomdescription;
	}
	/**
	 * @return the isactive
	 */
	public boolean isIsactive() {
		return isactive;
	}
	/**
	 * @param isactive the isactive to set
	 */
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	@Override
	public String toString() {
		return "Uom [uomid=" + uomid + ", uomname=" + uomname + ", uomdescription=" + uomdescription + ", isactive="
				+ isactive + "]";
	}
	
	public Uom(int uomid, String uomname, String uomdescription, boolean isactive) {
		super();
		this.uomid = uomid;
		this.uomname = uomname;
		this.uomdescription = uomdescription;
		this.isactive = isactive;
	}
	
	public Uom() {
		super();
	}
      
	  
}
