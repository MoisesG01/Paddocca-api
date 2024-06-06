package com.fatec.paddocca.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fatec.paddocca.exception.ErroAutenticacao;
import com.fatec.paddocca.exception.RegraNegocioException;
import com.fatec.paddocca.model.entity.Usuario;
import com.fatec.paddocca.repository.UsuarioRepository;

import jakarta.transaction.Transactional;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository repository;


	public Usuario autenticar(String email, String senha) {
		Usuario usuario = repository.findByEmail(email).orElseThrow(
			()-> new ErroAutenticacao("Usuário ou senha incorreta")
		);

		if(!usuario.getSenha().equals(senha)) {
			throw new ErroAutenticacao("Usuário ou senha incorreta");
		}
		
		return usuario;
	}

	public Usuario salvarUsuario(Usuario usuario) {
	    validarEmail(usuario.getEmail());
	    return repository.save(usuario);
	}

	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com esse email!");
		}
	}
	

	public Optional<Usuario> obterPorId(Long id) {
		return repository.findById(id);
	}

}
