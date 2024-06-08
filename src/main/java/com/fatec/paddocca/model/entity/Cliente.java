package com.fatec.paddocca.model.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Cliente extends Usuario {

    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private String telefone;
}