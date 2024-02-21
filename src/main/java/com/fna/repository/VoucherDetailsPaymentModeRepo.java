package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.VoucherDetailsPaymentMode;

public interface VoucherDetailsPaymentModeRepo extends JpaRepository<VoucherDetailsPaymentMode, Integer> {

	@Query(value = "SELECT vd.voucherid,vd.voucherseq,vd.voucherdetailid,nc.ledgeralias,vd.creditamount,vd.debitamount,vd.creditledger,vd.debitledger,vd.voucherdate,vd.vouchernumber,vd.vouchertypename,vd.narration,vd.hsnsacid,hsn.hsnsaccode , cm.companyname,vd.branchid,vd.rate,vd.subledgerid,vd.subledgername,case when vd.voucherdetailid in (select pd.voucherdetailid from paymentbankcoverdetails pd) then 1 else 0 end as flag FROM voucherdetails vd left join normalledgermaster nc on (nc.ledgerid = vd.creditledger) or (nc.ledgerid = VD.debitledger) left join hsnsacmaster hsn on hsn.hsnsacid = vd.hsnsacid left join companymaster cm on cm.companyid = vd.branchid join voucher v on v.voucherid = vd.voucherid  where vd.voucherseq = :voucherseq and v.voucherid=:voucherid and v.vouchertypeid=1 and v.statusid=4 \r\n"
			+ "group by vd.voucherseq,vd.voucherid,vd.voucherdetailid,nc.ledgeralias,vd.creditamount,vd.debitamount,vd.creditledger,vd.debitledger,vd.voucherdate,vd.vouchernumber,vd.vouchertypename,vd.narration,vd.hsnsacid,hsn.hsnsaccode,cm.companyname,vd.branchid,vd.rate,vd.subledgerid,vd.subledgername \r\n"
			+ "order by vd.voucherseq asc, vd.debitamount desc", nativeQuery = true)
	List<VoucherDetailsPaymentMode> findVoucherDetailsForReconcilation(@Param("voucherseq") int voucherseq,@Param("voucherid") int voucherid); 
	
	@Query(value = "SELECT vd.voucherid,vd.voucherseq,vd.voucherdetailid,nc.ledgeralias,vd.creditamount,vd.debitamount,vd.creditledger,vd.debitledger,vd.voucherdate,vd.vouchernumber,vd.vouchertypename,vd.narration,vd.hsnsacid,hsn.hsnsaccode , cm.companyname,vd.branchid,vd.rate,vd.subledgerid,vd.subledgername,case when vd.voucherdetailid in (select pd.voucherdetailid from paymentbankcoverdetails pd) then 1 else 0 end as flag FROM voucherdetails vd left join normalledgermaster nc on (nc.ledgerid = vd.creditledger) or (nc.ledgerid = VD.debitledger) left join hsnsacmaster hsn on hsn.hsnsacid = vd.hsnsacid left join companymaster cm on cm.companyid = vd.branchid join voucher v on v.voucherid = vd.voucherid  where vd.voucherseq = :voucherseq and v.voucherid=:voucherid and v.vouchertypeid=3 and v.statusid=4\r\n"
			+ "group by vd.voucherseq,vd.voucherid,vd.voucherdetailid,nc.ledgeralias,vd.creditamount,vd.debitamount,vd.creditledger,vd.debitledger,vd.voucherdate,vd.vouchernumber,vd.vouchertypename,vd.narration,vd.hsnsacid,hsn.hsnsaccode,cm.companyname,vd.branchid,vd.rate,vd.subledgerid,vd.subledgername \r\n"
			+ "order by vd.voucherseq asc, vd.debitamount desc", nativeQuery = true)
	List<VoucherDetailsPaymentMode> findVoucherDetailsForReconcilationRec(@Param("voucherseq") int voucherseq,@Param("voucherid") int voucherid);
	
}
 