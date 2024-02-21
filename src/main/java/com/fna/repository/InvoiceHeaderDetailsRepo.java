package com.fna.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.AucInvoiceHeaderDetails;

public interface InvoiceHeaderDetailsRepo extends JpaRepository<AucInvoiceHeaderDetails, Integer>{

	@Modifying
	@Query(value="select * from [aucinvoice_header] where Invoice_Date between :from  and :to and companyid=:cmpid",nativeQuery=true)
	List<AucInvoiceHeaderDetails> getByDate(@Param("from") Date from,@Param("to") Date to,@Param("cmpid") Integer cmpid);
}
