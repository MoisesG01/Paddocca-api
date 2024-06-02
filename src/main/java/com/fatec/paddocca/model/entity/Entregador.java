package com.fatec.paddocca.model.entity;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "entregador")
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Entregador extends Usuario {
    @Column(name = "cpf")
    private String cpf;

    @Column(name = "data_nascimento")
    private Date dataNascimento;

    @Column(name = "telefone")
    private String telefone;
}