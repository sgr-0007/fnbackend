package com.fna.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;




@Entity
@Table(name = "citymaster")
public class City {
	@Id
	 @GeneratedValue(strategy = GenerationType.AUTO)
	private int cityid;
	@Column(name = "cityname")
	private String cityname;
	private int countryid;
	private String countryname;
	private int stateid;
	@Column(name="citydescription")
	private boolean isactive;
	public int getCityid() {
		return cityid;
	}
	public void setCityid(int cityid) {
		this.cityid = cityid;
	}
	public String getCityname() {
		return cityname;
	}
	public void setCityname(String cityname) {
		this.cityname = cityname;
	}
	public int getCountryid() {
		return countryid;
	}
	public void setCountryid(int countryid) {
		this.countryid = countryid;
	}
	public int getStateid() {
		return stateid;
	}
	public void setStateid(int stateid) {
		this.stateid = stateid;
	}
	public boolean isIsactive() {
		return isactive;
	}
	public void setIsactive(boolean isactive) {
		this.isactive = isactive;
	}
	
	public String getCountryname() {
		return countryname;
	}
	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}
	@Override
	public String toString() {
		return "City [cityid=" + cityid + ", cityname=" + cityname + ", countryid=" + countryid + ", stateid=" + stateid
				+ ", isactive=" + isactive + ",countryname="+countryname+"]";
	}
	public City(int cityid, String cityname, int countryid, int stateid, boolean isactive,String countryname) {
		this.cityid = cityid;
		this.cityname = cityname;
		this.countryid = countryid;
		this.stateid = stateid;
		this.isactive = isactive;
		this.countryname = countryname;
		
	}
	public City() {
		
	}
	

}
