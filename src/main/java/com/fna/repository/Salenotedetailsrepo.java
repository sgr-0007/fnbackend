package com.fna.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.AUCSalenoteDetails;
import com.fna.model.AucInvoiceHeaderDetails;

public interface  Salenotedetailsrepo extends JpaRepository<AUCSalenoteDetails, Integer>{

	@Modifying
	@Query(value="select * from [aucsalenote_header] where SaleNote_Date between :from  and :to and companyid=:cmpid",nativeQuery=true)
	List<AUCSalenoteDetails> getByDate(@Param("from") Date from,@Param("to") Date to ,@Param("cmpid") int cmpid);
	
	@Modifying
	@Query(value="update aucsalenote_header set status=1 where SaleNote_No=:saleNoteNo",nativeQuery=true)
	int updateStatus(@Param("saleNoteNo") int saleNoteNo);
}
