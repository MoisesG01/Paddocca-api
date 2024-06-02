package com.fatec.paddocca.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.paddocca.model.entity.Padaria;

@Repository
public interface PadariaRepository extends JpaRepository<Padaria, Long> {
	
	boolean existsByEmail(String email);
	
	Optional<Padaria> findByEmail(String email);
	
}
