package com.fatec.paddocca.model.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private long padariaId;

    @ManyToOne
    @JoinColumn(name = "padariaId", insertable = false, updatable = false)
    @JsonIgnore
    private Padaria padaria;
}
