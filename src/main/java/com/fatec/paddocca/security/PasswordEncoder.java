package com.fatec.paddocca.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {
    private final BCryptPasswordEncoder encoder =  new BCryptPasswordEncoder();

    public String encode(String s) {
        return encoder.encode(s);
    }

    public boolean match(String password, String encodedPassword) {
        return encoder.matches(password, encodedPassword);
    }
}
