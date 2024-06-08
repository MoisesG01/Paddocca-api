package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Entregador;
import com.fatec.paddocca.security.PasswordEncoder;
import com.fatec.paddocca.validation.EmailValidation;
import org.springframework.stereotype.Service;
import com.fatec.paddocca.repository.EntregadorRepository;

@Service
public class EntregadorService {

    private final EntregadorRepository repository;
    private final EmailValidation validation;
    private final PasswordEncoder passwordEncoder;

    public EntregadorService(EntregadorRepository repository) {
        this.repository = repository;
        this.validation = new EmailValidation(repository);
        this.passwordEncoder = new PasswordEncoder();
    }

    public Entregador save (Entregador entregador) {
        validation.existsByEmail(entregador.getEmail());

        String passwordEncoded = passwordEncoder.encode(entregador.getSenha());
        entregador.setSenha(passwordEncoded);

        return repository.save(entregador);
    }
}
