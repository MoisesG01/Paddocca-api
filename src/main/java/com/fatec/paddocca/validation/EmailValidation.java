package com.fatec.paddocca.validation;

import com.fatec.paddocca.exception.EmailAlreadyExistsException;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmailValidation {

    private EmailRepository repository;

    public void existsByEmail(String email) {
        if (repository.existsByEmail(email)) {
           throw new EmailAlreadyExistsException("Entidade com email já cadastrado.");
        }
    }
}
