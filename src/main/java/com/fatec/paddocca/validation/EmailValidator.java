package com.fatec.paddocca.validation;

public interface EmailValidator<T> {
    boolean existsByEmail(T entity);
}
