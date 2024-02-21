package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FinancialYearDetails {

	@Id
	private int financialyearid;
	private String financialyearname;
	private Date financialyearstartdate;
	private Date financialyearenddate;
	private boolean defaultactive;
	public int getFinancialyearid() {
		return financialyearid;
	}
	public void setFinancialyearid(int financialyearid) {
		this.financialyearid = financialyearid;
	}
	public String getFinancialyearname() {
		return financialyearname;
	}
	public void setFinancialyearname(String financialyearname) {
		this.financialyearname = financialyearname;
	}
	public Date getFinancialyearstartdate() {
		return financialyearstartdate;
	}
	public void setFinancialyearstartdate(Date financialyearstartdate) {
		this.financialyearstartdate = financialyearstartdate;
	}
	public Date getFinancialyearenddate() {
		return financialyearenddate;
	}
	public void setFinancialyearenddate(Date financialyearenddate) {
		this.financialyearenddate = financialyearenddate;
	}
	public boolean isDefaultactive() {
		return defaultactive;
	}
	public void setDefaultactive(boolean defaultactive) {
		this.defaultactive = defaultactive;
	}
	
}
