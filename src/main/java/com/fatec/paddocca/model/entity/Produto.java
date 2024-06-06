package com.fatec.paddocca.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.*;

@Data
@Entity
public class Produto {

    @Id
    @GeneratedValue
    private Long id;

    private String nome;
    private String descricao;
    private String categoria;
    private double preco;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Padaria padaria;
}

