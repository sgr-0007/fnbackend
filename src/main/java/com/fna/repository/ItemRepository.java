package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.fna.model.Item;
import com.fna.model.Normalledger;

public interface ItemRepository extends JpaRepository<Item,Integer>{
		
	@Query(value = "SELECT im.itemid,im.itemname,im.itemdescription,im.serviceorgoods,im.hsnorsaccode,im.taxid,im.cgstrate,im.sgstrate,\r\n"
			+ "im.igstrate,im.cessrate,im.isactive,um.uomid,um.uomname,im.percentageorvalue,im.createdby,im.createddate,im.modifieddate,im.modiifiedby from itemmaster im\r\n"
			+ "join uommaster um on im.uomid=um.uomid", nativeQuery = true)
	
	Iterable<Item> Itemnative();
	
	@Query(value = "exec CheckUnique @action=:action,@id=:id,@name=:name ", nativeQuery = true)
	Boolean checkUnique(@Param("action") String action,@Param("id") int id,@Param("name") String name);

}
