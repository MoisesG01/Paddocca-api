package com.fatec.paddocca.service;

import com.fatec.paddocca.security.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.fatec.paddocca.exception.ErroAutenticacao;
import com.fatec.paddocca.model.entity.Usuario;
import com.fatec.paddocca.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private final UsuarioRepository repository;
	private final PasswordEncoder passwordEncoder;

	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
		this.passwordEncoder = new PasswordEncoder();
	}

	public Usuario autenticar(String email, String senha) {
		Usuario usuario = repository.findByEmail(email).orElseThrow(
				()-> new ErroAutenticacao("Usuário ou senha incorreta")
		);

		if(!passwordEncoder.match(senha, usuario.getSenha())) {
			throw new ErroAutenticacao("Usuário ou senha incorreta");
		}
		
		return usuario;
	}
}
