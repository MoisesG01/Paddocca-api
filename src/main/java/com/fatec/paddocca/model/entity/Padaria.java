package com.fatec.paddocca.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.List;

@Entity
@Data
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class Padaria extends Usuario {
    @Column(name = "cnpj")
    private String cnpj;

    @Column(name = "telefone")
    private String telefone;
    
    @Column(name = "endereco")
    private String endereco;

    @OneToMany(mappedBy = "padaria")
    private List<Produto>  produtos;
}