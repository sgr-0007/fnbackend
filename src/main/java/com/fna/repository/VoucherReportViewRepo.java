package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.VoucherReportView;


public interface VoucherReportViewRepo extends JpaRepository<VoucherReportView, Integer> {

	
	@Query(value = "exec voucherview @vouchertypeid=:vouchertypeid,@companyid=:companyid,@vouchernumber=:vouchernumber,@fromdate=:fromdate,@todate=:todate,@aid=:aid", nativeQuery = true)
	List<VoucherReportView> voucherView(@Param("vouchertypeid") int vouchertypeid ,@Param("companyid") int companyid,@Param("vouchernumber") String vouchernumber,@Param("fromdate") String fromdate,@Param("todate") String todate ,@Param("aid") int aid ); 
	
}
