package com.fna.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employeebank")
public class EmployeeBank {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int bankemployeeid;	
	private String employeecode;
	private String employeename;
	private String designation;
	private String place;
	private String accountno;
	private String ifsc;
	private String bank;
	
	public String getEmployeecode() {
		return employeecode;
	}
	public void setEmployeecode(String employeecode) {
		this.employeecode = employeecode;
	}
	public int getBankemployeeid() {
		return bankemployeeid;
	}
	public void setBankemployeeid(int bankemployeeid) {
		this.bankemployeeid = bankemployeeid;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
	public String getAccountno() {
		return accountno;
	}
	public void setAccountno(String accountno) {
		this.accountno = accountno;
	}
	public String getIfsc() {
		return ifsc;
	}
	public void setIfsc(String ifsc) {
		this.ifsc = ifsc;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	
	

}
