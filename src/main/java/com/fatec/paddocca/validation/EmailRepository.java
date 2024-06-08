package com.fatec.paddocca.validation;

public interface EmailRepository {
    boolean existsByEmail(String email);
}
