package com.fatec.paddocca.api.dto;

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
public class PadariaDTO extends UsuarioDTO {
	
    private String cnpj;
    private String endereco;
    private String telefone;
}
