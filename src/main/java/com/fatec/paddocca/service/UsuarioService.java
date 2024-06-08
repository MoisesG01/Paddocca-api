package com.fatec.paddocca.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.paddocca.exception.ErroAutenticacao;
import com.fatec.paddocca.model.entity.Usuario;
import com.fatec.paddocca.repository.UsuarioRepository;

@Service
public class UsuarioService {

	private final UsuarioRepository repository;

	public UsuarioService(UsuarioRepository repository) {
		this.repository = repository;
	}

	public Usuario autenticar(String email, String senha) {
		Usuario usuario = repository.findByEmail(email).orElseThrow(
			()-> new ErroAutenticacao("Usuário ou senha incorreta")
		);

		if(!usuario.getSenha().equals(senha)) {
			throw new ErroAutenticacao("Usuário ou senha incorreta");
		}
		
		return usuario;
	}

}
