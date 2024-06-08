package com.fatec.paddocca.repository;

import java.util.Optional;

import com.fatec.paddocca.validation.EmailRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fatec.paddocca.model.entity.Entregador;

@Repository
public interface EntregadorRepository extends JpaRepository<Entregador, Long>, EmailRepository {
}
