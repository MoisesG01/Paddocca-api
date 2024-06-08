package com.fatec.paddocca.model.entity;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Entregador extends Usuario {

    private String cpf;
    private Date dataNascimento;
    private String telefone;
}