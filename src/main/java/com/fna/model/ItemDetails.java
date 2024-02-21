package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ItemDetails {

	@Id
	@Column(name="itemid")
	private int itemId;
	@Column(name="itemname")
	private String itemName;
	@Column(name="itemdescription")
	private String itemDescription;
	@Column(name="serviceorgoods")
	private String serviceOrGoods;
	@Column(name="uomid")
	private int uomId;
	@Column(name="uomname")
	private String uomName;
	@Column(name="hsnorsaccode")
	private String hsnorsaccode;
	@Column(name="taxid")
	private int taxId;
	@Column(name="cgstrate")
	private float cgstRate;
	@Column(name="sgstrate")
	private float sgstRate;
	@Column(name="igstrate")
	private float igstRate;
	@Column(name="cessrate")
	private float cessRate;
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemDescription() {
		return itemDescription;
	}
	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}
	public String getServiceOrGoods() {
		return serviceOrGoods;
	}
	public void setServiceOrGoods(String serviceOrGoods) {
		this.serviceOrGoods = serviceOrGoods;
	}
	public int getUomId() {
		return uomId;
	}
	public void setUomId(int uomId) {
		this.uomId = uomId;
	}
	public String getUomName() {
		return uomName;
	}
	public void setUomName(String uomName) {
		this.uomName = uomName;
	}
	public String getHsnorsaccode() {
		return hsnorsaccode;
	}
	public void setHsnorsaccode(String hsnorsaccode) {
		this.hsnorsaccode = hsnorsaccode;
	}
	public int getTaxId() {
		return taxId;
	}
	public void setTaxId(int taxId) {
		this.taxId = taxId;
	}
	public float getCgstRate() {
		return cgstRate;
	}
	public void setCgstRate(float cgstRate) {
		this.cgstRate = cgstRate;
	}
	public float getSgstRate() {
		return sgstRate;
	}
	public void setSgstRate(float sgstRate) {
		this.sgstRate = sgstRate;
	}
	public float getIgstRate() {
		return igstRate;
	}
	public void setIgstRate(float igstRate) {
		this.igstRate = igstRate;
	}
	public float getCessRate() {
		return cessRate;
	}
	public void setCessRate(float cessRate) {
		this.cessRate = cessRate;
	}
	
	
	
}
