package com.fatec.paddocca.model.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.paddocca.model.entity.Cliente;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
	
	boolean existsByEmail(String email);
	
	Optional<Cliente> findByEmail(String email);
	
}
