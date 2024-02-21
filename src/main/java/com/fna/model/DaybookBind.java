package com.fna.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DaybookBind {
	@Id
	@Column(name = "companyid")
	int companyid;
	@Column(name = "companyname")
	String companyname;
	@Column(name = "isopened")
	Integer isopened;
	@Column(name = "isclosed")
	Integer isclosed;
	public int getCompanyid() {
		return companyid;
	}
	public void setCompanyid(int companyid) {
		this.companyid = companyid;
	}
	public String getCompanyname() {
		return companyname;
	}
	public void setCompanyname(String companyname) {
		this.companyname = companyname;
	}
	public Integer getIsopened() {
		return isopened;
	}
	public void setIsopened(Integer isopened) {
		this.isopened = isopened;
	}
	public Integer getIsclosed() {
		return isclosed;
	}
	public void setIsclosed(Integer isclosed) {
		this.isclosed = isclosed;
	}
	@Override
	public String toString() {
		return "DaybookBind [companyid=" + companyid + ", companyname=" + companyname + ", isopened=" + isopened
				+ ", isclosed=" + isclosed + "]";
	}
	public DaybookBind(int companyid, String companyname, Integer isopened, Integer isclosed) {
		
		this.companyid = companyid;
		this.companyname = companyname;
		this.isopened = isopened;
		this.isclosed = isclosed;
	}
	public DaybookBind() {

	}

}
