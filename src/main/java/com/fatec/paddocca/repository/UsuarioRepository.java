package com.fatec.paddocca.repository;

import java.util.Optional;

import com.fatec.paddocca.validation.EmailRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.paddocca.model.entity.Usuario;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long>, EmailRepository {
	Optional<Usuario> findByEmail(String email);
}
