package com.fna.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;



@Entity

@Table(name = "state")

public class State {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	  private int stateid;
	@Column(name = "statename")
	  private String statename;
	private int countryid;
	private boolean isactive;
	@Column(name="state")
	private String state;
		public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public String getStatename() {
		return statename;
	}
	public void setStatename(String statename) {
		this.statename = statename;
	}
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "State [stateid=" + stateid + ", statename=" + statename + ", countryid=" + countryid + ", isactive="
				+ isactive + ", state=" + state + "]";
	}
		public State()
	{
		
	}
		public State(int stateid, String statename, int countryid, boolean isactive, String state) 
		{
			this.stateid = stateid;
			this.statename = statename;
			this.countryid = countryid;
			this.isactive = isactive;
			this.state = state;
		}
	
}
