package com.fatec.paddocca.model.dto;

import com.fatec.paddocca.model.enums.TipoPerfil;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class UsuarioDTO {
	
    private String email;
    private String nome;
    private String senha;
    private TipoPerfil tipoPerfil;
}
