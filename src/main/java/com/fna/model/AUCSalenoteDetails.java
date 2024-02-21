package com.fna.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;


@Entity
@Table(name="aucsalenote_header")
public class AUCSalenoteDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int shid;
	private int SaleNote_No;
	private int TBGRNO;
	private double Quantity_Authorized;
	private double Quantity_Sold;
	private double Quantity_Balanced;
	private int No_Of_Bales_Received;
	private int No_Of_Bales_Sold;
	private Date Auction_Date;
	private double Net_Amount_Payable;
	private String Created_By;
	private Date Created_On;
	private String Updated_By;
	private Date Updated_On;
	private Date SaleNote_Date;
	private Date Payment_Due_Date;
	private String SaleNote_Status;
	private Integer Prev_SaleNote_no;
	private float AuctionedWeight;
	private int PLATFORM_CODE;
	private int GrowerPaymentBankCode;
	private int Cheque_No;
	private int Prev_Bales_Sold;
	private String Receipt_No;
	private float Day_Total_Qty;
	private float Day_Excess_Qty;
	private float Auth_Qty_Price;
	private float Excess_Qty_Price;
	private float Max_Excess_Qty_Price;
	private float Day_Max_Excess_Qty;
	private float Day_Scarp_Qty;
	private float Scarp_Qty_Price;
	private Date inserted_date;
	private Integer status;
	@Transient
	private List<AUCSalenoteDetail> aucsalenoteDetail;
	@Transient
	private List<AUCSaleNoteTaxes> aucsalenoteTaxes;
	@Transient
	private List<AUCSalenoteLoan> aucsalenoteLoan;
	
	public int getShid() {
		return shid;
	}
	public void setShid(int shid) {
		this.shid = shid;
	}
	public int getSaleNote_No() {
		return SaleNote_No;
	}
	public void setSaleNote_No(int saleNote_No) {
		SaleNote_No = saleNote_No;
	}
	public int getTBGRNO() {
		return TBGRNO;
	}
	public void setTBGRNO(int tBGRNO) {
		TBGRNO = tBGRNO;
	}
	public double getQuantity_Authorized() {
		return Quantity_Authorized;
	}
	public void setQuantity_Authorized(double quantity_Authorized) {
		Quantity_Authorized = quantity_Authorized;
	}
	public double getQuantity_Sold() {
		return Quantity_Sold;
	}
	public void setQuantity_Sold(double quantity_Sold) {
		Quantity_Sold = quantity_Sold;
	}
	public double getQuantity_Balanced() {
		return Quantity_Balanced;
	}
	public void setQuantity_Balanced(double quantity_Balanced) {
		Quantity_Balanced = quantity_Balanced;
	}
	public int getNo_Of_Bales_Received() {
		return No_Of_Bales_Received;
	}
	public void setNo_Of_Bales_Received(int no_Of_Bales_Received) {
		No_Of_Bales_Received = no_Of_Bales_Received;
	}
	public int getNo_Of_Bales_Sold() {
		return No_Of_Bales_Sold;
	}
	public void setNo_Of_Bales_Sold(int no_Of_Bales_Sold) {
		No_Of_Bales_Sold = no_Of_Bales_Sold;
	}
	public Date getAuction_Date() {
		return Auction_Date;
	}
	public void setAuction_Date(Date auction_Date) {
		Auction_Date = auction_Date;
	}
	public double getNet_Amount_Payable() {
		return Net_Amount_Payable;
	}
	public void setNet_Amount_Payable(double net_Amount_Payable) {
		Net_Amount_Payable = net_Amount_Payable;
	}
	public String getCreated_By() {
		return Created_By;
	}
	public void setCreated_By(String created_By) {
		Created_By = created_By;
	}
	public Date getCreated_On() {
		return Created_On;
	}
	public void setCreated_On(Date created_On) {
		Created_On = created_On;
	}
	public String getUpdated_By() {
		return Updated_By;
	}
	public void setUpdated_By(String updated_By) {
		Updated_By = updated_By;
	}
	public Date getUpdated_On() {
		return Updated_On;
	}
	public void setUpdated_On(Date updated_On) {
		Updated_On = updated_On;
	}
	public Date getSaleNote_Date() {
		return SaleNote_Date;
	}
	public void setSaleNote_Date(Date saleNote_Date) {
		SaleNote_Date = saleNote_Date;
	}
	public Date getPayment_Due_Date() {
		return Payment_Due_Date;
	}
	public void setPayment_Due_Date(Date payment_Due_Date) {
		Payment_Due_Date = payment_Due_Date;
	}
	public String getSaleNote_Status() {
		return SaleNote_Status;
	}
	public void setSaleNote_Status(String saleNote_Status) {
		SaleNote_Status = saleNote_Status;
	}
	public Integer getPrev_SaleNote_no() {
		return Prev_SaleNote_no;
	}
	public void setPrev_SaleNote_no(Integer prev_SaleNote_no) {
		Prev_SaleNote_no = prev_SaleNote_no;
	}
	public float getAuctionedWeight() {
		return AuctionedWeight;
	}
	public void setAuctionedWeight(float auctionedWeight) {
		AuctionedWeight = auctionedWeight;
	}
	public int getPLATFORM_CODE() {
		return PLATFORM_CODE;
	}
	public void setPLATFORM_CODE(int pLATFORM_CODE) {
		PLATFORM_CODE = pLATFORM_CODE;
	}
	public int getGrowerPaymentBankCode() {
		return GrowerPaymentBankCode;
	}
	public void setGrowerPaymentBankCode(int growerPaymentBankCode) {
		GrowerPaymentBankCode = growerPaymentBankCode;
	}
	public int getCheque_No() {
		return Cheque_No;
	}
	public void setCheque_No(int cheque_No) {
		Cheque_No = cheque_No;
	}
	public int getPrev_Bales_Sold() {
		return Prev_Bales_Sold;
	}
	public void setPrev_Bales_Sold(int prev_Bales_Sold) {
		Prev_Bales_Sold = prev_Bales_Sold;
	}
	public String getReceipt_No() {
		return Receipt_No;
	}
	public void setReceipt_No(String receipt_No) {
		Receipt_No = receipt_No;
	}
	public float getDay_Total_Qty() {
		return Day_Total_Qty;
	}
	public void setDay_Total_Qty(float day_Total_Qty) {
		Day_Total_Qty = day_Total_Qty;
	}
	public float getDay_Excess_Qty() {
		return Day_Excess_Qty;
	}
	public void setDay_Excess_Qty(float day_Excess_Qty) {
		Day_Excess_Qty = day_Excess_Qty;
	}
	public float getAuth_Qty_Price() {
		return Auth_Qty_Price;
	}
	public void setAuth_Qty_Price(float auth_Qty_Price) {
		Auth_Qty_Price = auth_Qty_Price;
	}
	public float getExcess_Qty_Price() {
		return Excess_Qty_Price;
	}
	public void setExcess_Qty_Price(float excess_Qty_Price) {
		Excess_Qty_Price = excess_Qty_Price;
	}
	public float getMax_Excess_Qty_Price() {
		return Max_Excess_Qty_Price;
	}
	public void setMax_Excess_Qty_Price(float max_Excess_Qty_Price) {
		Max_Excess_Qty_Price = max_Excess_Qty_Price;
	}
	public float getDay_Max_Excess_Qty() {
		return Day_Max_Excess_Qty;
	}
	public void setDay_Max_Excess_Qty(float day_Max_Excess_Qty) {
		Day_Max_Excess_Qty = day_Max_Excess_Qty;
	}
	public float getDay_Scarp_Qty() {
		return Day_Scarp_Qty;
	}
	public void setDay_Scarp_Qty(float day_Scarp_Qty) {
		Day_Scarp_Qty = day_Scarp_Qty;
	}
	public float getScarp_Qty_Price() {
		return Scarp_Qty_Price;
	}
	public void setScarp_Qty_Price(float scarp_Qty_Price) {
		Scarp_Qty_Price = scarp_Qty_Price;
	}
	public Date getInserted_date() {
		return inserted_date;
	}
	public void setInserted_date(Date inserted_date) {
		this.inserted_date = inserted_date;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public List<AUCSalenoteDetail> getAucsalenoteDetail() {
		return aucsalenoteDetail;
	}
	public void setAucsalenoteDetail(List<AUCSalenoteDetail> aucsalenoteDetail) {
		this.aucsalenoteDetail = aucsalenoteDetail;
	}
	public List<AUCSaleNoteTaxes> getAucsalenoteTaxes() {
		return aucsalenoteTaxes;
	}
	public void setAucsalenoteTaxes(List<AUCSaleNoteTaxes> aucsalenoteTaxes) {
		this.aucsalenoteTaxes = aucsalenoteTaxes;
	}
	public List<AUCSalenoteLoan> getAucsalenoteLoan() {
		return aucsalenoteLoan;
	}
	public void setAucsalenoteLoan(List<AUCSalenoteLoan> aucsalenoteLoan) {
		this.aucsalenoteLoan = aucsalenoteLoan;
	}

	
	
	
	
}
