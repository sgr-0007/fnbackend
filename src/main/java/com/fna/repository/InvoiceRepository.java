package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fna.model.InvoiceDetails;
import com.fna.model.InvoiceInfo;

@Repository
public interface InvoiceRepository extends JpaRepository<InvoiceDetails, Integer> {

	@Query(value="exec getAllInvoice",nativeQuery=true)
	List<InvoiceInfo> getInvoiceDetails();
	@Query(value="exec sp_generateInvoiceNumber @p1=:prevInvoice",nativeQuery=true)
	String getInvoiceNumber(@Param("prevInvoice") String prevInvoice);
		
	@Query(value="exec sp_getOfficeName @p1=:officeType",nativeQuery=true)
	String getOfficeName(@Param("officeType") int officeType);
	
	@Query(value="update invoice set invoice.approververifiedstatus=:approve,invoice.approververifiedby=:role ,invoice.makerverifiedstatus=:approve  where invoiceid=:invoiceId ",nativeQuery=true)
	InvoiceDetails updateApprovalStatus(@Param("invoiceId") int invoiceId,@Param("approve") int approververifiedstatus,@Param("role") int roeId);
	@Query(value="update invoice set invoice.approververifiedstatus=:approve,invoice.makerverifiedby=:role ,invoice.makerverifiedstatus=:approve  where invoiceid=:invoiceId ",nativeQuery=true)
	InvoiceDetails updateCheckerStatus(@Param("invoiceId") int invoiceId,@Param("approve") int approververifiedstatus,@Param("role") int roeId);
	@Modifying
	@Query(value="update invoice set voucherid=:voucherId where invoiceid=:invoiceId ",nativeQuery=true)
	int updateVoucheridStatus(@Param("invoiceId") int invoiceId,@Param("voucherId") int voucherId);

}
