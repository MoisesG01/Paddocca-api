package com.fatec.paddocca.model.entity;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class Padaria extends Usuario {

    private String cnpj;
    private String telefone;
    private String endereco;
}