package com.fatec.paddocca.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class Carrinho {

    @Id
    @GeneratedValue
    private long id;

    @OneToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produtos;
}
