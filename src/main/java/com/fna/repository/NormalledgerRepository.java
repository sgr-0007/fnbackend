package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.City;
import com.fna.model.Normalledger;

public interface NormalledgerRepository extends JpaRepository<Normalledger,Integer>{

	@Query(value = "select n.cityname,n.companytype,ct.companytypename,n.accounttypeid,a.accounttype,n.ledgerid,n.ledgername,n.ledgeralias,g.groupname,n.groupid,n.subgroupid,s.subgroupname,c.companyname,n.ledgersupplierid,n.ledgercustomerid,n.ledgertype,n.associatedwithhormobranch,n.companyid,n.doesitaffectinventory,n.add1,n.add2,n.city\r\n"
			+ "			,n.state\r\n"
			+ "			,n.bankname\r\n"
			+ "			,n.bankaccountnumber\r\n"
			+ "			,n.ifsccode\r\n"
			+ "			,n.bankaddress\r\n"
			+ "			,n.gsttin\r\n"
			+ "			,n.panno\r\n"
			+ "			,n.isactive\r\n"
			+ "			,n.recordapprovalstatus\r\n"
			+ "			,n.createdby\r\n"
			+ "			,n.createddate\r\n"
			+ "			,n.modifiedby\r\n"
			+ "			,n.modifieddate\r\n"
			+ "			,n.undergroups\r\n"
			+ "			,n.accounttypeid\r\n"
			+ "			,n.doesitsffectinventory\r\n"
			+ "			\r\n"
			+ "			 from normalledgermaster n join subgroupmaster s on n.subgroupid = s.subgroupid\r\n"
			+ "			 left join companttype ct on ct.companytype = n.companytype\r\n"
			+ "			 left join companymaster c on n.companyid = c.companyid\r\n"
			+ "			 left join accounttype a on a.accounttypeid = n.accounttypeid\r\n"
			+ "			 join groupmaster g on n.groupid = g.groupid where n.undergroups is null", nativeQuery = true)
	List<Normalledger> Normalledgernative();

	@Query(value = "exec CheckUnique @action=:action,@id=:id,@name=:name ", nativeQuery = true)
	Boolean checkUnique(@Param("action") String action,@Param("id") int id,@Param("name") String name); 
	
	@Query(value = "exec yearlybudget @action=:action,@companyid=:companyid", nativeQuery = true)
	List<Normalledger> expenseLedgers(@Param("action") String action,@Param("companyid") int companyid); 
	
	public Normalledger findByledgerid(int ledgerid); 

}
