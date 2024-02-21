package com.fna.repository;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fna.model.VoucherPettyCash;

public interface VoucherPettyCashRepo extends JpaRepository<VoucherPettyCash, Integer> {

	Optional<VoucherPettyCash> findByvoucherdetailid(int voucherdetailid);
	 
	

}
