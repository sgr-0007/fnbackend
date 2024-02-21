package com.fna.model;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "voucherwisepettycash")
public class VoucherPettyCash {
	
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private int pettycashexpid; 
	  private int voucherid;
	  private int voucherdetailid; 
	  private Boolean enclosures;
	  private Boolean submit;
	  private String statuspetty;
	  private Integer statusid;

		public Integer getStatusid() {
			return statusid;
		}
		public void setStatusid(Integer statusid) {
			this.statusid = statusid;
		}
	  
	public int getPettycashexpid() {
		return pettycashexpid;
	}
	public void setPettycashexpid(int pettycashexpid) {
		this.pettycashexpid = pettycashexpid;
	}
	public int getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(int voucherid) {
		this.voucherid = voucherid;
	}
	public int getVoucherdetailid() {
		return voucherdetailid;
	}
	public void setVoucherdetailid(int voucherdetailid) {
		this.voucherdetailid = voucherdetailid;
	}
	public Boolean getEnclosures() {
		return enclosures;
	}
	public void setEnclosures(Boolean enclosures) {
		this.enclosures = enclosures;
	}
	public Boolean getSubmit() {
		return submit;
	}
	public void setSubmit(Boolean submit) {
		this.submit = submit;
	}
	public String getStatuspetty() {
		return statuspetty;
	}
	public void setStatuspetty(String statuspetty) {
		this.statuspetty = statuspetty;
	} 
 

}
