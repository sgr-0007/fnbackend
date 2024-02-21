package com.fna.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.fna.model.LedgerDetails;
import com.fna.model.SalesLedger;

@Transactional
public interface LedgerRepository extends JpaRepository<SalesLedger, Integer>{
	
	@Modifying
    @Query(value="update normalledgermaster set isactive=0 where ledgerid=:id", nativeQuery = true)	
    void saveSalesLedger(@Param("id")int id);

	@Query(value="select * from normalledgermaster where groupid=:cat",nativeQuery=true)
	List<SalesLedger> getAllLedgersByCat(@Param("cat") int cat);
	
	@Query(value="select ledgername from normalledgermaster",nativeQuery=true)
	List<String> findSalesLedgerName();
	
	@Query(value="select ledgeralias from normalledgermaster",nativeQuery=true)
	List<String> findSalesLedgerAlias();
	
	Optional<SalesLedger> findByLedgerCode(String s);
	
	
	
}
