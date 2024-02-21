package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.fna.model.VoucherType;

public interface VoucherTypeRepository extends JpaRepository<VoucherType, Integer> {

	@Query(value = "SELECT * from vouchertype where vouchertypeid= :vouchertypeid", nativeQuery = true)
	List<VoucherType> findByIdNative(@Param("vouchertypeid") int vouchertypeid);

	public VoucherType findByvouchertypeid(int vouchertypeid);

 

}
