package com.fna.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="voucherpayment")
public class VoucherPayment {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer voucherpaymentid;
	
	private Integer voucherid;
	private Integer voucherdetailid;
	private String paymentmode;
	private String chequebankname;
	private String chequenumber;
	private Date chequedate;
	private Double chequeamount;
	private String chequepaidto;
	private String ddbankname;
	private String ddnumber;
	private Date dddate;
	private Double ddamount;
	private String ddpaidto;
	
	private String onlinebankname;
	private String onlinetransactionid;
	private Date onlinedate;
	private Double onlineamount;
	private Double onlinebankingcharges;
	
	private Date cashdate;
	private Double cashamount;
	private String cashpaidto;
	public Integer getVoucherpaymentid() {
		return voucherpaymentid;
	}
	public void setVoucherpaymentid(Integer voucherpaymentid) {
		this.voucherpaymentid = voucherpaymentid;
	}
	public Integer getVoucherid() {
		return voucherid;
	}
	public void setVoucherid(Integer voucherid) {
		this.voucherid = voucherid;
	}
	public Integer getVoucherdetailid() {
		return voucherdetailid;
	}
	public void setVoucherdetailid(Integer voucherdetailid) {
		this.voucherdetailid = voucherdetailid;
	}
	public String getPaymentmode() {
		return paymentmode;
	}
	public void setPaymentmode(String paymentmode) {
		this.paymentmode = paymentmode;
	}
	public String getChequebankname() {
		return chequebankname;
	}
	public void setChequebankname(String chequebankname) {
		this.chequebankname = chequebankname;
	}
	public String getChequenumber() {
		return chequenumber;
	}
	public void setChequenumber(String chequenumber) {
		this.chequenumber = chequenumber;
	}
	public Date getChequedate() {
		return chequedate;
	}
	public void setChequedate(Date chequedate) {
		this.chequedate = chequedate;
	}
	public Double getChequeamount() {
		return chequeamount;
	}
	public void setChequeamount(Double chequeamount) {
		this.chequeamount = chequeamount;
	}
	public String getChequepaidto() {
		return chequepaidto;
	}
	public void setChequepaidto(String chequepaidto) {
		this.chequepaidto = chequepaidto;
	}
	public String getDdbankname() {
		return ddbankname;
	}
	public void setDdbankname(String ddbankname) {
		this.ddbankname = ddbankname;
	}
	public String getDdnumber() {
		return ddnumber;
	}
	public void setDdnumber(String ddnumber) {
		this.ddnumber = ddnumber;
	}
	public Date getDddate() {
		return dddate;
	}
	public void setDddate(Date dddate) {
		this.dddate = dddate;
	}
	public Double getDdamount() {
		return ddamount;
	}
	public void setDdamount(Double ddamount) {
		this.ddamount = ddamount;
	}
	public String getDdpaidto() {
		return ddpaidto;
	}
	public void setDdpaidto(String ddpaidto) {
		this.ddpaidto = ddpaidto;
	}
	public String getOnlinebankname() {
		return onlinebankname;
	}
	public void setOnlinebankname(String onlinebankname) {
		this.onlinebankname = onlinebankname;
	}
	public String getOnlinetransactionid() {
		return onlinetransactionid;
	}
	public void setOnlinetransactionid(String onlinetransactionid) {
		this.onlinetransactionid = onlinetransactionid;
	}
	public Date getOnlinedate() {
		return onlinedate;
	}
	public void setOnlinedate(Date onlinedate) {
		this.onlinedate = onlinedate;
	}
	public Double getOnlineamount() {
		return onlineamount;
	}
	public void setOnlineamount(Double onlineamount) {
		this.onlineamount = onlineamount;
	}
	public Double getOnlinebankingcharges() {
		return onlinebankingcharges;
	}
	public void setOnlinebankingcharges(Double onlinebankingcharges) {
		this.onlinebankingcharges = onlinebankingcharges;
	}
	public Date getCashdate() {
		return cashdate;
	}
	public void setCashdate(Date cashdate) {
		this.cashdate = cashdate;
	}
	public Double getCashamount() {
		return cashamount;
	}
	public void setCashamount(Double cashamount) {
		this.cashamount = cashamount;
	}
	public String getCashpaidto() {
		return cashpaidto;
	}
	public void setCashpaidto(String cashpaidto) {
		this.cashpaidto = cashpaidto;
	}
	
	

	


	
}
