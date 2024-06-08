package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Padaria;
import com.fatec.paddocca.repository.PadariaRepository;
import com.fatec.paddocca.validation.EmailValidation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PadariaService {

    @Autowired
    private final PadariaRepository repository;
    private final EmailValidation validation;

    public PadariaService(PadariaRepository repository) {
        this.repository = repository;
        this.validation = new EmailValidation(repository);
    }

    public Padaria save (Padaria padaria) {
        validation.existsByEmail(padaria.getEmail());

        return repository.save(padaria);
    }
}

