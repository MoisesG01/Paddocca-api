package com.fatec.paddocca.model.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@Entity
public class Cliente extends Usuario {

    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private String telefone;
}