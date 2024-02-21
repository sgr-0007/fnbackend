package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQuery;

@Entity
@NamedStoredProcedureQuery(name = "getStates", procedureName = "GET_STATES")
public class StateDetails {

	@Id
	@Column(name = "stateid")
	private int stateId;
	@Column(name = "statename")
	private String stateName;
	@Column(name = "countryid")
	private int countryId;
	@Column(name = "isactive")
	private byte isActive;
	@Column(name = "state")
	private String state;

	public int getStateId() {
		return stateId;
	}

	public void setStateId(int stateId) {
		this.stateId = stateId;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public int getCountryId() {
		return countryId;
	}

	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}

	public byte getIsActive() {
		return isActive;
	}

	public void setIsActive(byte isActive) {
		this.isActive = isActive;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

}
