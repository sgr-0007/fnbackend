package com.fna.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.Creditlimitsetting;

public interface CreditlimitsettingRepository extends JpaRepository<Creditlimitsetting, Integer>{

//	@Query(value = "SELECT c.creditlimitid,c.buyerid,n.ledgername as buyername,\r\n"
//			+ "			 c.creditlimitamount,c.creditlimitutilize,c.creditlimitbalance,c.creditlimitcreateddate,c.creditlimitcreatedby,c.creditlimitcheckedby,c.creditlimitcheckeddate,c.creditlimitapprovedby,c.creditlimitapproveddate FROM creditlimitsetting c join normalledgermaster n on c.buyerid=n.ledgerid", nativeQuery = true)
//	//@Query(value = "SELECT * FROM creditlimitsetting", nativeQuery = true)
//	Iterable<Creditlimitsetting> Creditlimitsettingnative();
	
	@Query(value = "select c.creditlimitid,c.buyerid,n.ledgername,c.creditlimitamount,c.creditlimitutilize,c.creditlimitbalance,c.creditlimitcreateddate,\r\n"
			+ "c.creditlimitcreatedby,\r\n"
			+ "c.creditlimitcheckedby,\r\n"
			+ "c.creditlimitcheckeddate,\r\n"
			+ "c.creditlimitapprovedby,\r\n"
			+ "c.creditlimitapproveddate from creditlimitsetting c join normalledgermaster n on c.buyerid=n.ledgerid", nativeQuery = true)
	 Iterable<Creditlimitsetting> Creditlimitsettingnative();

}
