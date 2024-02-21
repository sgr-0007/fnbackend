package com.fna.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="auctb_master_grower")
public class AUCGrowerLedger {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mgid;
	@Column(name="TBGRNO")
	private int tbgrno;
	@Column(name="Title")
	private String  title;
	@Column(name="Grower_Name")
	private String growerName;
	@Column(name="Grower_Fname")
	private String growerFname;
	@Column(name="Area_Reg")
	private float areaReg;
	@Column(name="Area_Plant")
	private float areaPlant;
	@Column(name="No_Barn")
	private float noBarn;
	@Column(name="Qty_Authorized")
	private float qtyAuthorized;
	@Column(name="Cluster_Code")
	private int clusterCode;
	@Column(name="Account_No")
	private String accountNo;
	@Column(name="Bank_Code")
	private int bankCode;
	@Column(name="Sale_Code")
	private String saleCode;
	@Column(name="Passbook_No")
	private String passbookNo;
	@Column(name="Grow_Code")
	private Character growCode;
	@Column(name="Patta_Issued")
	private int pattaIssued;
	@Column(name="Village_Code")
	private int villageCode;
	@Column(name="Prev_Rejected_Bales")
	private Integer prevRejectedBales;
	@Column(name="Qty_Sold")
	private float qtySold;
	@Column(name="Created_By")
	private String createdBy;
	@Column(name="Created_On")
	private Date createdOn;
	@Column(name="Updated_By")
	private String updatedBy;
	@Column(name="Updated_On")
	private Date updatedOn;
	@Column(name="Local_Lang_Name")
	private String localLangName;
	@Column(name="Defaulter_Flag")
	private Character defaulterFlag;
	@Column(name="Active")
	private Character active;
	@Column(name="TRANSFERRED_IN")
	private Character transferedIN;
	@Column(name="Transferred_Platform")
	private String transferredPlatform;
	@Column(name="Gender")
	private String gender;
	@Column(name="Caste")
	private String caste;
	@Column(name="Age")
	private int age;
	@Column(name="Patta_Paid")
	private int pattaPaid;
	@Column(name="Patta_Pending")
	private int pattaPending;
	@Column(name="TRANSFERRED_OUT")
	private Character transferedOUT;
	@Column(name="Excess_Qty")
	private float excessQty;
	@Column(name="Max_Allow_Excess_Qty")
	private float maxAllowExcessQty;
	@Column(name="SCARP_QTY_SOLD")
	private float scarpQtySold;
	@Column(name="Loan_Account_No")
	private String loanAccountNo;
	@Column(name="Grower_Disable_Rmk")
	private String growerDisableRmk;
	@Column(name="aadhar_number")
	private String aadharNumber;
	@Column(name="mobile_number")
	private String mobileNumber;
	@Column(name="family_code")
	private String familyCode;
	@Column(name="Sample_Qty")
	private Float sampleQty;
	@Column(name="Estimated_Crop")
	private float estimatedCrop;
	@Column(name="is_cpa_grower")
	private Character isCpaGrower;
	private Date inserteddate;
	private Integer status;
	private Integer companyid;
	public int getMgid() {
		return mgid;
	}
	public void setMgid(int mgid) {
		this.mgid = mgid;
	}
	public int getTbgrno() {
		return tbgrno;
	}
	public void setTbgrno(int tbgrno) {
		this.tbgrno = tbgrno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrowerName() {
		return growerName;
	}
	public void setGrowerName(String growerName) {
		this.growerName = growerName;
	}
	public String getGrowerFname() {
		return growerFname;
	}
	public void setGrowerFname(String growerFname) {
		this.growerFname = growerFname;
	}
	public float getAreaReg() {
		return areaReg;
	}
	public void setAreaReg(float areaReg) {
		this.areaReg = areaReg;
	}
	public float getAreaPlant() {
		return areaPlant;
	}
	public void setAreaPlant(float areaPlant) {
		this.areaPlant = areaPlant;
	}
	public float getNoBarn() {
		return noBarn;
	}
	public void setNoBarn(float noBarn) {
		this.noBarn = noBarn;
	}
	public float getQtyAuthorized() {
		return qtyAuthorized;
	}
	public void setQtyAuthorized(float qtyAuthorized) {
		this.qtyAuthorized = qtyAuthorized;
	}
	public int getClusterCode() {
		return clusterCode;
	}
	public void setClusterCode(int clusterCode) {
		this.clusterCode = clusterCode;
	}
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBankCode() {
		return bankCode;
	}
	public void setBankCode(int bankCode) {
		this.bankCode = bankCode;
	}
	public String getSaleCode() {
		return saleCode;
	}
	public void setSaleCode(String saleCode) {
		this.saleCode = saleCode;
	}
	public String getPassbookNo() {
		return passbookNo;
	}
	public void setPassbookNo(String passbookNo) {
		this.passbookNo = passbookNo;
	}
	public Character getGrowCode() {
		return growCode;
	}
	public void setGrowCode(Character growCode) {
		this.growCode = growCode;
	}
	public int getPattaIssued() {
		return pattaIssued;
	}
	public void setPattaIssued(int pattaIssued) {
		this.pattaIssued = pattaIssued;
	}
	public int getVillageCode() {
		return villageCode;
	}
	public void setVillageCode(int villageCode) {
		this.villageCode = villageCode;
	}
	public Integer getPrevRejectedBales() {
		return prevRejectedBales;
	}
	public void setPrevRejectedBales(Integer prevRejectedBales) {
		this.prevRejectedBales = prevRejectedBales;
	}
	public float getQtySold() {
		return qtySold;
	}
	public void setQtySold(float qtySold) {
		this.qtySold = qtySold;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public Date getUpdatedOn() {
		return updatedOn;
	}
	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}
	public String getLocalLangName() {
		return localLangName;
	}
	public void setLocalLangName(String localLangName) {
		this.localLangName = localLangName;
	}
	public Character getDefaulterFlag() {
		return defaulterFlag;
	}
	public void setDefaulterFlag(Character defaulterFlag) {
		this.defaulterFlag = defaulterFlag;
	}
	public Character getActive() {
		return active;
	}
	public void setActive(Character active) {
		this.active = active;
	}
	public Character getTransferedIN() {
		return transferedIN;
	}
	public void setTransferedIN(Character transferedIN) {
		this.transferedIN = transferedIN;
	}
	public String getTransferredPlatform() {
		return transferredPlatform;
	}
	public void setTransferredPlatform(String transferredPlatform) {
		this.transferredPlatform = transferredPlatform;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getCaste() {
		return caste;
	}
	public void setCaste(String caste) {
		this.caste = caste;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPattaPaid() {
		return pattaPaid;
	}
	public void setPattaPaid(int pattaPaid) {
		this.pattaPaid = pattaPaid;
	}
	public int getPattaPending() {
		return pattaPending;
	}
	public void setPattaPending(int pattaPending) {
		this.pattaPending = pattaPending;
	}
	public Character getTransferedOUT() {
		return transferedOUT;
	}
	public void setTransferedOUT(Character transferedOUT) {
		this.transferedOUT = transferedOUT;
	}
	public float getExcessQty() {
		return excessQty;
	}
	public void setExcessQty(float excessQty) {
		this.excessQty = excessQty;
	}
	public float getMaxAllowExcessQty() {
		return maxAllowExcessQty;
	}
	public void setMaxAllowExcessQty(float maxAllowExcessQty) {
		this.maxAllowExcessQty = maxAllowExcessQty;
	}
	public float getScarpQtySold() {
		return scarpQtySold;
	}
	public void setScarpQtySold(float scarpQtySold) {
		this.scarpQtySold = scarpQtySold;
	}
	public String getLoanAccountNo() {
		return loanAccountNo;
	}
	public void setLoanAccountNo(String loanAccountNo) {
		this.loanAccountNo = loanAccountNo;
	}
	public String getGrowerDisableRmk() {
		return growerDisableRmk;
	}
	public void setGrowerDisableRmk(String growerDisableRmk) {
		this.growerDisableRmk = growerDisableRmk;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getFamilyCode() {
		return familyCode;
	}
	public void setFamilyCode(String familyCode) {
		this.familyCode = familyCode;
	}
	public Float getSampleQty() {
		return sampleQty;
	}
	public void setSampleQty(Float sampleQty) {
		this.sampleQty = sampleQty;
	}
	public float getEstimatedCrop() {
		return estimatedCrop;
	}
	public void setEstimatedCrop(float estimatedCrop) {
		this.estimatedCrop = estimatedCrop;
	}
	public Character getIsCpaGrower() {
		return isCpaGrower;
	}
	public void setIsCpaGrower(Character isCpaGrower) {
		this.isCpaGrower = isCpaGrower;
	}
	public Date getInserteddate() {
		return inserteddate;
	}
	public void setInserteddate(Date inserteddate) {
		this.inserteddate = inserteddate;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getCompanyid() {
		return companyid;
	}
	public void setCompanyid(Integer companyid) {
		this.companyid = companyid;
	}
	
	
	
	
	
}
