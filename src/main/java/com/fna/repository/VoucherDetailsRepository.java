package com.fna.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.VoucherDetails;

public interface VoucherDetailsRepository extends JpaRepository<VoucherDetails, Integer> {

	@Query(value = "SELECT vd.voucherid,vd.voucherseq,vd.voucherdetailid,nc.ledgeralias,vd.creditamount,vd.debitamount,vd.creditledger,vd.debitledger,vd.voucherdate,vd.vouchernumber,vd.vouchertypename,vd.narration,vd.hsnsacid,hsn.hsnsaccode , cm.companyname,vd.branchid,vd.rate,vd.subledgerid,vd.subledgername FROM voucherdetails vd left join normalledgermaster nc on (nc.ledgerid = vd.creditledger) or (nc.ledgerid = VD.debitledger) left join hsnsacmaster hsn on hsn.hsnsacid = vd.hsnsacid left join companymaster cm on cm.companyid = vd.branchid where vd.voucherid = :voucherid\r\n"
			+ "group by vd.voucherseq,vd.voucherid,vd.voucherdetailid,nc.ledgeralias,vd.creditamount,vd.debitamount,vd.creditledger,vd.debitledger,vd.voucherdate,vd.vouchernumber,vd.vouchertypename,vd.narration,vd.hsnsacid,hsn.hsnsaccode,cm.companyname,vd.branchid,vd.rate,vd.subledgerid,vd.subledgername \r\n"
			+ "order by vd.voucherseq asc, vd.debitamount desc", nativeQuery = true)
	List<VoucherDetails> findVoucherDetailsTable(@Param("voucherid") int voucherid); 
	
	@Query(value = "exec daybookview @vouchertypeid=:vouchertypeid,@companyid=:companyid,@vouchernumber=:vouchernumber,@fromdate=:fromdate,@todate=:todate", nativeQuery = true)
	List<VoucherDetails> DayBookView(@Param("vouchertypeid") int vouchertypeid ,@Param("companyid") int companyid,@Param("vouchernumber") String vouchernumber,@Param("fromdate") String fromdate,@Param("todate") String todate ); 
	
	
	@Query(value = "exec openclosedaybooksave @companyid=:companyid,@action=:findcreditsum ", nativeQuery = true)
	Integer findcreditsum(@Param("companyid") int companyid);  
	
	@Query(value = "exec dynamicvseqcountforUI_financialyear @compid=:compid,@aid=:aid", nativeQuery = true)
	List<VoucherDetails> findLastVoucherDetails(@Param("compid") int compid,@Param("aid") int aid); 
	
	@Query(value = "exec dynamicvseqcount_financialyear @compid=:compid,@aid=:aid", nativeQuery = true)
	Integer findMaxVSeqByCompany(@Param("compid") int compid,@Param("aid") int aid);
	
	@Query(value = " select * from voucherdetails vd where  vd.creditledger in(select bankid from cashbankoffice where officeid=:officeid) and voucherid=:voucherid", nativeQuery = true)
	List<VoucherDetails> findBankVseq(@Param("officeid") int compid,@Param("voucherid") int voucherid); 
	
	@Query(value = " select * from voucherdetails vd where  vd.creditledger in(select cashid from cashbankoffice where officeid=:officeid) and voucherid=:voucherid", nativeQuery = true)
	List<VoucherDetails> findCashVseq(@Param("officeid") int compid,@Param("voucherid") int voucherid); 
	
	
	@Query(value = " select * from voucherdetails vd where  vd.debitledger in(select bankid from cashbankoffice where officeid=:officeid) and voucherid=:voucherid", nativeQuery = true)
	List<VoucherDetails> RecfindBankVseq(@Param("officeid") int compid,@Param("voucherid") int voucherid); 
	
	@Query(value = " select * from voucherdetails vd where  vd.debitledger in(select cashid from cashbankoffice where officeid=:officeid) and voucherid=:voucherid", nativeQuery = true)
	List<VoucherDetails> RecfindCashVseq(@Param("officeid") int compid,@Param("voucherid") int voucherid); 
	
	
	 
	
	List<VoucherDetails> findByVoucherid(int voucherId); 
}
