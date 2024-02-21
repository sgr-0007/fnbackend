package com.fna.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.fna.model.SubLedgerView;

public interface SubLedgerViewRepository extends JpaRepository<SubLedgerView, Integer> {
	@Query(value = "exec getSubLedger", nativeQuery = true)
	List<SubLedgerView> SubLedgerNative();
}
