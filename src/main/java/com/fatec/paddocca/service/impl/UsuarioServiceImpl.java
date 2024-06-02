package com.fatec.paddocca.service.impl;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.fatec.paddocca.exception.ErroAutenticacao;
import com.fatec.paddocca.exception.RegraNegocioException;
import com.fatec.paddocca.model.entity.Usuario;
import com.fatec.paddocca.model.repository.UsuarioRepository;
import com.fatec.paddocca.service.UsuarioService;

import jakarta.transaction.Transactional;

@Service
public class UsuarioServiceImpl implements UsuarioService {
	
	private final UsuarioRepository repository;
	
	public UsuarioServiceImpl(UsuarioRepository repository) {
		this.repository = repository;
	}

	@Override
	public Usuario autenticar(String email, String senha) {
		Optional<Usuario> usuario = repository.findByEmail(email);
		
		if(!usuario.isPresent()) {
			throw new ErroAutenticacao("Usuário Não Encontrado para o Email Informado!");
		}
		
		if(!usuario.get().getSenha().equals(senha)) {
			throw new ErroAutenticacao("Senha Inválida!");
		}
		
		return usuario.get();
	}

	@Override
	@Transactional
	public Usuario salvarUsuario(Usuario usuario) {
	    validarEmail(usuario.getEmail());
	    return repository.save(usuario);
	}

	@Override
	public void validarEmail(String email) {
		boolean existe = repository.existsByEmail(email);
		if(existe) {
			throw new RegraNegocioException("Já existe um usuário cadastrado com esse email!");
		}
	}
	
	@Override
	public Optional<Usuario> obterPorId(Long id) {
		return repository.findById(id);
	}

}
