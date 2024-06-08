package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Padaria;
import com.fatec.paddocca.repository.PadariaRepository;
import com.fatec.paddocca.security.PasswordEncoder;
import com.fatec.paddocca.validation.EmailValidation;
import org.springframework.stereotype.Service;

@Service
public class PadariaService {

    private final PadariaRepository repository;
    private final EmailValidation validation;
    private final PasswordEncoder passwordEncoder;

    public PadariaService(PadariaRepository repository) {
        this.repository = repository;
        this.validation = new EmailValidation(repository);
        this.passwordEncoder = new PasswordEncoder();
    }

    public Padaria save (Padaria padaria) {
        validation.existsByEmail(padaria.getEmail());

        String passwordEncoded = passwordEncoder.encode(padaria.getSenha());
        padaria.setSenha(passwordEncoded);

        return repository.save(padaria);
    }
}

