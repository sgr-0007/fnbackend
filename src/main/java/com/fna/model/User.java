package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

@Entity
@Table(name = "usermaster")

public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int userid;
	@Column(name="employeeid")
	private String employeeId;
	@Column(name = "userfirstname")
	private String Userfirstname;
	@Column(name="usermiddlename")
	private String Usermiddlename;
	@Column(name="userlastname")
	private String Userlastname;
	@Column(name="userloginname")
	private String userloginname;
	@Column(name="emailid")
	private String Emailid;
	@Column(name="mobilenumber")
	private String Mobilenumber;
	@Column(name="dob")
	private Date Dob;
	private Integer reportingmanager;
	private Integer designation;
	private Integer originaldepartment;
	private Integer currentdepartment;
	private Integer post;
	@Column(name="password")
	private String password;
	private Integer createdby;
	  @Column(name = "createddate",updatable = true)
	  @CreationTimestamp
	  private Date Createddate;
	  private Integer modifiedby;
	  @Column(name = "modifieddate",updatable = true)
	  @CreationTimestamp
	  private Date Modifieddate;
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
	public String getUsermiddlename() {
		return Usermiddlename;
	}
	public void setUsermiddlename(String usermiddlename) {
		Usermiddlename = usermiddlename;
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
	public Date getDob() {
		return Dob;
	}
	public void setDob(Date dob) {
		Dob = dob;
	}
	public Integer getReportingmanager() {
		return reportingmanager;
	}
	public void setReportingmanager(Integer reportingmanager) {
		this.reportingmanager = reportingmanager;
	}
	public Integer getDesignation() {
		return designation;
	}
	public void setDesignation(Integer designation) {
		this.designation = designation;
	}
	public Integer getOriginaldepartment() {
		return originaldepartment;
	}
	public void setOriginaldepartment(Integer originaldepartment) {
		this.originaldepartment = originaldepartment;
	}
	public Integer getCurrentdepartment() {
		return currentdepartment;
	}
	public void setCurrentdepartment(Integer currentdepartment) {
		this.currentdepartment = currentdepartment;
	}
	public Integer getPost() {
		return post;
	}
	public void setPost(Integer post) {
		this.post = post;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getCreatedby() {
		return createdby;
	}
	public void setCreatedby(Integer createdby) {
		this.createdby = createdby;
	}
	public Date getCreateddate() {
		return Createddate;
	}
	public void setCreateddate(Date createddate) {
		Createddate = createddate;
	}
	public Integer getModifiedby() {
		return modifiedby;
	}
	public void setModifiedby(Integer modifiedby) {
		this.modifiedby = modifiedby;
	}
	public Date getModifieddate() {
		return Modifieddate;
	}
	public void setModifieddate(Date modifieddate) {
		Modifieddate = modifieddate;
	}
	public User(int userid, String userfirstname, String usermiddlename, String userlastname, String userloginname,
			String emailid, String mobilenumber, Date dob, Integer reportingmanager, Integer designation,
			Integer originaldepartment, Integer currentdepartment, Integer post, String password, Integer createdby, Date createddate,
			Integer modifiedby, Date modifieddate) {
		
		this.userid = userid;
		Userfirstname = userfirstname;
		Usermiddlename = usermiddlename;
		Userlastname = userlastname;
		this.userloginname = userloginname;
		Emailid = emailid;
		Mobilenumber = mobilenumber;
		Dob = dob;
		this.reportingmanager = reportingmanager;
		this.designation = designation;
		this.originaldepartment = originaldepartment;
		this.currentdepartment = currentdepartment;
		this.post = post;
		this.password = password;
		this.createdby = createdby;
		Createddate = createddate;
		this.modifiedby = modifiedby;
		Modifieddate = modifieddate;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [userid=" + userid + ", Userfirstname=" + Userfirstname + ", Usermiddlename=" + Usermiddlename
				+ ", Userlastname=" + Userlastname + ", Userloginname=" + userloginname + ", Emailid=" + Emailid
				+ ", Mobilenumber=" + Mobilenumber + ", Dob=" + Dob + ", reportingmanager=" + reportingmanager
				+ ", designation=" + designation + ", originaldepartment=" + originaldepartment + ", currentdepartment="
				+ currentdepartment + ", post=" + post + ", Password=" + password + ", createdby=" + createdby
				+ ", Createddate=" + Createddate + ", modifiedby=" + modifiedby + ", Modifieddate=" + Modifieddate
				+ "]";
	}



}
