package com.fatec.paddocca.model.entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Pedido {

    @Id
    @GeneratedValue
    private Long id;

    private Date dataPedido;
    private double qtdProduto;
    private double totalPedido;

    @ManyToOne
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Cliente cliente;

    @ManyToMany
    private List<Produto> produto;
}
