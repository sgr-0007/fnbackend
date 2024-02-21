package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.fna.model.InvoiceMasterView;

public interface InvoiceMasterViewRepo extends JpaRepository<InvoiceMasterView, Integer> { 
	@Query(value="SELECT * FROM invoice" ,nativeQuery = true)
	List<InvoiceMasterView> findAllIM();

}
