package com.fna.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.fna.model.Designation;

public interface DesignationRepository extends JpaRepository<Designation,Integer> {

}
