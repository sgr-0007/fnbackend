package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.OfficeAccount;

public interface OfficeAccountRepo extends JpaRepository<OfficeAccount, Integer> {
	@Query(value="exec getUserOfficeAccountMapping @userid=:userid" ,nativeQuery = true)
	List<OfficeAccount> getOfficeAccount(@Param("userid") int userid); 
	
	@Query(value="exec getAccountMapping @officeid=:officeid" ,nativeQuery = true)
	List<OfficeAccount> getAccount(@Param("officeid") int officeid); 
	
	@Query(value="exec getAccountMappingforVoucher @officeid=:officeid" ,nativeQuery = true)
	List<OfficeAccount> getAccountForVoucher(@Param("officeid") int officeid); 
}
