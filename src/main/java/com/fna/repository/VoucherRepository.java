package com.fna.repository;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.fna.model.Voucher;

public interface VoucherRepository extends JpaRepository<Voucher,Integer> {


	@Query(value = "SELECT sg.voucherid, sg.vouchernumber,sg.companyid,g.companyname,sg.createddate,sg.modifieddate,sg.narration,sg.totalcreditamount,sg.totaldebitamount,"
			+ "sg.voucherdate,sg.vouchertypeid,vt.vouchertypename,sg.narration,sg.statusid,sg.createdby,sg.vouchercheckedby,sg.voucherapprovedby,sg.vouchercheckeddate,sg.voucherapproveddate,sg.invoiceno,sg.accounttypeid,sg.remarks FROM voucher sg join companymaster g on g.companyid=sg.companyid join vouchertype vt on vt.vouchertypeid=sg.vouchertypeid where sg.vouchertypeid= :vouchertypeid", nativeQuery = true)
	List<Voucher> VouchertableNative(@Param("vouchertypeid") int vouchertypeid); 
	
	@Query(value = "exec getVouchers @vouchertypeid=:vouchertypeid,@userid=:userid ", nativeQuery = true)
	List<Voucher> VouchertableByUid(@Param("vouchertypeid") int vouchertypeid,@Param("userid") int userid); 
	
	@Query(value = "SELECT sg.voucherid,sg.vouchernumber,sg.companyid,g.companyname,sg.createddate,sg.modifieddate,sg.narration,sg.totalcreditamount,sg.totaldebitamount,"
			+ "sg.voucherdate,sg.vouchertypeid,vt.vouchertypename,sg.statusid,sg.createdby,sg.vouchercheckedby,sg.voucherapprovedby,sg.vouchercheckeddate,sg.voucherapproveddate,sg.invoiceno,sg.accounttypeid,sg.remarks FROM voucher sg join companymaster g on g.companyid=sg.companyid join vouchertype vt on vt.vouchertypeid=sg.vouchertypeid where sg.voucherid= :voucherid", nativeQuery = true)
	List<Voucher> SelectedVouchertableNative(@Param("voucherid") int voucherid);	

	@Query(value = "exec dynamicnumbercount_financialyear @companytype=:companytype,@vouchertypeid=:vouchertypeid,@companyid=:companyid ", nativeQuery = true)
	Integer getCountOfCompanyType(@Param("companytype") int companytype,@Param("vouchertypeid") int vouchertypeid,@Param("companyid") int companyid); 
	
	@Query(value = "exec cashbankbalance @action=:action,@ledgerid=:ledgerid ", nativeQuery = true)
	Double getCashBankBalance(@Param("action") String action,@Param("ledgerid") int ledgerid); 
	
	
	@Transactional
	@Modifying
	@Query(value = "exec vouchersstatus @voucherid=:voucherid,@statusid=:statusid,@approvedby=:approvedby,@checkedby=:checkedby,@remarks=:remarks,@vdate=:vdate", nativeQuery = true)
	int updateVoucherStatus(@Param("voucherid") int voucherid,@Param("statusid") int statusid,@Param("approvedby") int approvedby,@Param("checkedby") int checkedby,@Param("remarks") String remarks,@Param("vdate") String vdate);
	
	@Transactional
	@Modifying
	@Query(value = "exec insertVoucherMaster @companyid=:companyid,@vouchernumber=:vouchernumber,@voucherdate=:voucherdate,@vouchertypeid=:vouchertypeid,@acid=:acid", nativeQuery = true)
	int insertVoucher(@Param("companyid") int companyid,@Param("vouchernumber") String vouchernumber,@Param("voucherdate") Date voucherdate,@Param("vouchertypeid") int vouchertypeid,@Param("acid") int acid);
	
	@Transactional
	@Modifying
	@Query(value = "exec vouchertotal @voucherid=:voucherid", nativeQuery = true)
	void updateVouchertotal(@Param("voucherid") int voucherid);

	Voucher findByVoucherid(int voucherid); 
	
	
} 
