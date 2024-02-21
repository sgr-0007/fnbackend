package com.fna.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fna.model.DefaultRoleModule;

public interface DRoleModuleMappingRepo extends JpaRepository<DefaultRoleModule, Integer>{

	Optional<List<DefaultRoleModule>> findByRoleid(int role);
}
