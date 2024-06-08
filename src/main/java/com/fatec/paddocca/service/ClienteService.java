package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Cliente;
import com.fatec.paddocca.repository.ClienteRepository;
import com.fatec.paddocca.security.PasswordEncoder;
import com.fatec.paddocca.validation.EmailValidation;
import org.springframework.stereotype.Service;


@Service
public class ClienteService {

    private final ClienteRepository repository;
    private final EmailValidation validation;
    private final PasswordEncoder passwordEncoder;

    public ClienteService(ClienteRepository repository) {
        this.repository = repository;
        this.validation = new EmailValidation(repository);
        this.passwordEncoder = new PasswordEncoder();
    }

    public Cliente save (Cliente cliente) {
        validation.existsByEmail(cliente.getEmail());

        String passwordEncoded = passwordEncoder.encode(cliente.getSenha());
        cliente.setSenha(passwordEncoded);

        return repository.save(cliente);
    }
}
