package com.fatec.paddocca.model.entity;

import java.sql.Date;

import com.fatec.paddocca.model.enums.TipoPerfil;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Entregador extends Usuario {

    private String cpf;
    private Date dataNascimento;
    private String telefone;
}