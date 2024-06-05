package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Cliente;
import com.fatec.paddocca.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientService {

    @Autowired
    private ClienteRepository repository;

    public Cliente save (Cliente client) {
        return repository.save(client);
    }
}
