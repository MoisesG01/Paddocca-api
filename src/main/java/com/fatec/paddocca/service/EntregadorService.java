package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Entregador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.fatec.paddocca.repository.EntregadorRepository;

@Service
public class EntregadorService {

    @Autowired
    private EntregadorRepository repository;

    public Entregador save (Entregador entregador) {
        return repository.save(entregador);
    }
}
