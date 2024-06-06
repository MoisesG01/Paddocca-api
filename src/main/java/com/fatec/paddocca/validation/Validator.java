package com.fatec.paddocca.validation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

public class Validator<T, R extends JpaRepository<T, Long>> implements EmailValidator<T> {

    @Autowired
    private R repository;



    @Override
    public boolean existsByEmail(T entity) {
        throw new UnsupportedOperationException("This operation is not supported.");
    }
}
