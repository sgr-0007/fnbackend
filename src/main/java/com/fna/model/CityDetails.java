package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;


@Entity
@NamedStoredProcedureQuery(name="getAllCities",procedureName = "GET_ALL_CITIES")
public class CityDetails {

	@Id
	@Column(name="cityid")
	private int cityId;
	@Column(name="cityname")
	private String cityName;
	@Column(name="countryid")
	private int countryId;
	@Column(name="stateid")
	private int stateId;
	@Column(name="citydescription")
	private String cityDescription;
	@Column(name="isactive")
	private byte isActive;
	@Column(name="countryname")
	private String countryName;
	public int getCityId() {
		return cityId;
	}
	public void setCityId(int cityId) {
		this.cityId = cityId;
	}

	
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getCountryId() {
		return countryId;
	}
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	public int getStateId() {
		return stateId;
	}
	public void setStateId(int stateId) {
		this.stateId = stateId;
	}
	public String getCityDescription() {
		return cityDescription;
	}
	public void setCityDescription(String cityDescription) {
		this.cityDescription = cityDescription;
	}
	public byte getIsActive() {
		return isActive;
	}
	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
	
	
}
