package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fna.model.AUCSalenoteDetail;
import com.fna.model.AucInvoiceDetails;
@Repository
public interface AUCSalenotedetailrepo extends CrudRepository<AUCSalenoteDetail, Integer>{

	public Optional<List<AUCSalenoteDetail>> findBysaleNoteNo(int salenoteno);
	
//	@Query(name="select sum(TotalAmount) from aucsalenote_details where SaleNote_No=:salenoteno ")
//	double getTotalAmount(@Param("salenoteno") int saleNoteNO);
}
