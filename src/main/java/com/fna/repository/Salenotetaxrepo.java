package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.AUCSaleNoteTaxes;
import com.fna.model.AUCSalenoteDetail;

public interface Salenotetaxrepo extends JpaRepository<AUCSaleNoteTaxes, Integer>{

	public Optional<List<AUCSaleNoteTaxes>> findBySaleNoteNo(int SaleNoteNo);
}
