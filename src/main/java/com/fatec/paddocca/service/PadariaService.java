package com.fatec.paddocca.service;

import com.fatec.paddocca.exception.RegraNegocioException;
import com.fatec.paddocca.model.entity.Padaria;
import com.fatec.paddocca.repository.PadariaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PadariaService {

    @Autowired
    private PadariaRepository repository;

    public Padaria save (Padaria padaria) {
        validarEmail(padaria.getEmail());

        return repository.save(padaria);
    }

    public void validarEmail(String email) {
        boolean existe = repository.existsByEmail(email);
        if(existe) {
            throw new RegraNegocioException("Já existe uma Padaria cadastrada com esse email!");
        }
    }
}

