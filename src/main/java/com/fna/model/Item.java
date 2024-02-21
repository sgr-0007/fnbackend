package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "itemmaster")
public class Item {
	
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int itemid;
	  @Column(name = "itemname")
	  private String itemname;
	  @Column(name = "itemdescription")
	  private String itemdescription;
	  @Column(name = "serviceorgoods")
	  private int serviceorgoods;
	  @Column(name = "uomid")
	  private int uomid;
	  
	  //@Column(name = "uomname")
	  private String uomname;
	  
	  
	  @Column(name = "hsnorsaccode")
	  private String hsnorsaccode;
	  @Column(name = "taxid")
	  private int taxid;
	  @Column(name = "cgstrate")
	  private double cgstrate;
	  @Column(name = "sgstrate")
	  private double sgstrate;
	  @Column(name = "igstrate")
	  private double igstrate;
	  @Column(name = "cessrate")
	  private double cessrate;
	  @Column(name = "isactive")
	  private boolean isactive;
	  @Column(name = "createddate",updatable = false)
	  @CreationTimestamp
	  private Date createddate;
	  private int createdby;
	  private int modiifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date modifieddate;
	  @Column(name = "percentageorvalue")
	  private String percentageorvalue;
	 
	  
	
	
	/**
	 * @return the percentageorvalue
	 */
	public String getPercentageorvalue() {
		return percentageorvalue;
	}
	/**
	 * @param percentageorvalue the percentageorvalue to set
	 */
	public void setPercentageorvalue(String percentageorvalue) {
		this.percentageorvalue = percentageorvalue;
	}
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
	 * @return the itemid
	 */
	public int getItemid() {
		return itemid;
	}
	/**
	 * @param itemid the itemid to set
	 */
	public void setItemid(int itemid) {
		this.itemid = itemid;
	}
	/**
	 * @return the itemname
	 */
	public String getItemname() {
		return itemname;
	}
	/**
	 * @param itemname the itemname to set
	 */
	public void setItemname(String itemname) {
		this.itemname = itemname;
	}
	/**
	 * @return the itemdescription
	 */
	public String getItemdescription() {
		return itemdescription;
	}
	/**
	 * @param itemdescription the itemdescription to set
	 */
	public void setItemdescription(String itemdescription) {
		this.itemdescription = itemdescription;
	}
	/**
	 * @return the serviceorgoods
	 */
	public int getServiceorgoods() {
		return serviceorgoods;
	}
	/**
	 * @param serviceorgoods the serviceorgoods to set
	 */
	public void setServiceorgoods(int serviceorgoods) {
		this.serviceorgoods = serviceorgoods;
	}
	/**
	 * @return the hsnorsaccode
	 */
	public String getHsnorsaccode() {
		return hsnorsaccode;
	}
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
	 * @param hsnorsaccode the hsnorsaccode to set
	 */
	public void setHsnorsaccode(String hsnorsaccode) {
		this.hsnorsaccode = hsnorsaccode;
	}
	/**
	 * @return the taxid
	 */
	public int getTaxid() {
		return taxid;
	}
	/**
	 * @param taxid the taxid to set
	 */
	public void setTaxid(int taxid) {
		this.taxid = taxid;
	}
	/**
	 * @return the cgstrate
	 */
	public double getCgstrate() {
		return cgstrate;
	}
	/**
	 * @param cgstrate the cgstrate to set
	 */
	public void setCgstrate(double cgstrate) {
		this.cgstrate = cgstrate;
	}
	/**
	 * @return the sgstrate
	 */
	public double getSgstrate() {
		return sgstrate;
	}
	/**
	 * @param sgstrate the sgstrate to set
	 */
	public void setSgstrate(double sgstrate) {
		this.sgstrate = sgstrate;
	}
	/**
	 * @return the igstrate
	 */
	public double getIgstrate() {
		return igstrate;
	}
	/**
	 * @param igstrate the igstrate to set
	 */
	public void setIgstrate(double igstrate) {
		this.igstrate = igstrate;
	}
	/**
	 * @return the cessrate
	 */
	public double getCessrate() {
		return cessrate;
	}
	/**
	 * @param cessrate the cessrate to set
	 */
	public void setCessrate(double cessrate) {
		this.cessrate = cessrate;
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

	/**
	 * @return the createddate
	 */
	public Date getCreateddate() {
		return createddate;
	}
	/**
	 * @param createddate the createddate to set
	 */
	public void setCreateddate(Date createddate) {
		this.createddate = createddate;
	}
	/**
	 * @return the createdby
	 */
	public int getCreatedby() {
		return createdby;
	}
	/**
	 * @param createdby the createdby to set
	 */
	public void setCreatedby(int createdby) {
		this.createdby = createdby;
	}
	/**
	 * @return the modiifiedby
	 */
	public int getModiifiedby() {
		return modiifiedby;
	}
	/**
	 * @param modiifiedby the modiifiedby to set
	 */
	public void setModiifiedby(int modiifiedby) {
		this.modiifiedby = modiifiedby;
	}
	/**
	 * @return the modifieddate
	 */
	public Date getModifieddate() {
		return modifieddate;
	}
	/**
	 * @param modifieddate the modifieddate to set
	 */
	public void setModifieddate(Date modifieddate) {
		this.modifieddate = modifieddate;
	}
	
	
	
	
	public Item(int itemid, String itemname, String itemdescription, int serviceorgoods, int uomid, String uomname,
			String subgroupname, int subgroupid, String hsnorsaccode, int taxid, double cgstrate, double sgstrate,
			double igstrate, double cessrate, boolean isactive, Date createddate, int createdby, int modiifiedby,
			Date modifieddate, String percentageorvalue) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.itemdescription = itemdescription;
		this.serviceorgoods = serviceorgoods;
		this.uomid = uomid;
		this.uomname = uomname;
		this.hsnorsaccode = hsnorsaccode;
		this.taxid = taxid;
		this.cgstrate = cgstrate;
		this.sgstrate = sgstrate;
		this.igstrate = igstrate;
		this.cessrate = cessrate;
		this.isactive = isactive;
		this.createddate = createddate;
		this.createdby = createdby;
		this.modiifiedby = modiifiedby;
		this.modifieddate = modifieddate;
		this.percentageorvalue = percentageorvalue;
	}
	public Item() {
		super();
	}
	  

}
