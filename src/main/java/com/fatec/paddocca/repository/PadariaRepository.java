package com.fatec.paddocca.repository;

import java.util.Optional;

import com.fatec.paddocca.validation.EmailRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.paddocca.model.entity.Padaria;

public interface PadariaRepository extends JpaRepository<Padaria, Long>, EmailRepository {
	Optional<Padaria> findByEmail(String email);
}
