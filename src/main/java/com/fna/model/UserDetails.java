package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(name="employeeid")
	private String employeeId;
	@Column(name = "userfirstname")
	private String Userfirstname;
	@Column(name="userlastname")
	private String Userlastname;
	@Column(name="userloginname")
	private String userloginname;
	@Column(name="emailid")
	private String Emailid;
	@Column(name="mobilenumber")
	private String Mobilenumber;
	@Column(name="dob")
	private String Dob;	
	@Column(name="officename")
	private String officename;
	@Column(name="sectionname")
	private String sectionname;
	@Column(name="password")
	private String password;
	@Column(name="designationname")
	private String designationname;
	@Column(name="designationid")
	private int designationid;
	@Column(name="officenameid")
	private int officenameid;
	@Column(name="sectionnameid")
	private int sectionnameid;
	@Column(name="reportingmanager")
	private int reportingmanager;
	@Column(name="rmdesignation")
	private String rmdesigntion;
	@Column(name="rmname")
	private String rmname;
	@Column(name="rmempcode")
	private String rmempcode;
	
	
	public int getOfficenameid() {
		return officenameid;
	}



	public void setOfficenameid(int officenameid) {
		this.officenameid = officenameid;
	}



	public int getSectionnameid() {
		return sectionnameid;
	}



	public void setSectionnameid(int sectionnameid) {
		this.sectionnameid = sectionnameid;
	}



	public int getDesignationid() {
		return designationid;
	}



	public void setDesignationid(int designationid) {
		this.designationid = designationid;
	}



	public UserDetails(int userid, String employeeId, String userfirstname, String userlastname, String userloginname,
			String emailid, String mobilenumber, String dob, String officename, String sectionname, String password,
			String designationname) {
		super();
		this.userid = userid;
		this.employeeId = employeeId;
		Userfirstname = userfirstname;
		Userlastname = userlastname;
		this.userloginname = userloginname;
		Emailid = emailid;
		Mobilenumber = mobilenumber;
		Dob = dob;
		this.officename = officename;
		this.sectionname = sectionname;
		this.password = password;
		this.designationname = designationname;
	}



	public String getDesignationname() {
		return designationname;
	}



	public void setDesignationname(String designationname) {
		this.designationname = designationname;
	}





	public int getUserid() {
		return userid;
	}



	public void setUserid(int userid) {
		this.userid = userid;
	}



	public String getEmployeeId() {
		return employeeId;
	}



	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}



	public String getUserfirstname() {
		return Userfirstname;
	}



	public void setUserfirstname(String userfirstname) {
		Userfirstname = userfirstname;
	}



	public String getUserlastname() {
		return Userlastname;
	}



	public void setUserlastname(String userlastname) {
		Userlastname = userlastname;
	}



	public String getUserloginname() {
		return userloginname;
	}



	public void setUserloginname(String userloginname) {
		this.userloginname = userloginname;
	}



	public String getEmailid() {
		return Emailid;
	}



	public void setEmailid(String emailid) {
		Emailid = emailid;
	}



	public String getMobilenumber() {
		return Mobilenumber;
	}



	public void setMobilenumber(String mobilenumber) {
		Mobilenumber = mobilenumber;
	}



	public String getDob() {
		return Dob;
	}



	public void setDob(String dob) {
		Dob = dob;
	}



	public String getOfficename() {
		return officename;
	}



	public void setOfficename(String officename) {
		this.officename = officename;
	}



	public String getSectionname() {
		return sectionname;
	}



	public void setSectionname(String sectionname) {
		this.sectionname = sectionname;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	
	



	public int getReportingmanager() {
		return reportingmanager;
	}



	public void setReportingmanager(int reportingmanager) {
		this.reportingmanager = reportingmanager;
	}

	

	public String getRmdesigntion() {
		return rmdesigntion;
	}



	public void setRmdesigntion(String rmdesigntion) {
		this.rmdesigntion = rmdesigntion;
	}



	public String getRmname() {
		return rmname;
	}



	public void setRmname(String rmname) {
		this.rmname = rmname;
	}



	public String getRmempcode() {
		return rmempcode;
	}



	public void setRmempcode(String rmempcode) {
		this.rmempcode = rmempcode;
	}



	@Override
	public String toString() {
		return "UserDetails [userid=" + userid + ", employeeId=" + employeeId + ", Userfirstname=" + Userfirstname
				+ ", Userlastname=" + Userlastname + ", userloginname=" + userloginname + ", Emailid=" + Emailid
				+ ", Mobilenumber=" + Mobilenumber + ", Dob=" + Dob + ", officename=" + officename + ", sectionname="
				+ sectionname + ", password=" + password + ", designationname=" + designationname + "]";
	}



	public UserDetails() {
		// TODO Auto-generated constructor stub
	}

}
