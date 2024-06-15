package com.fatec.paddocca.model.entity;

import com.fatec.paddocca.model.enums.TipoPerfil;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
@EqualsAndHashCode(callSuper=false)
public class Padaria extends Usuario {

    private String cnpj;
    private String telefone;
    private String endereco;
}