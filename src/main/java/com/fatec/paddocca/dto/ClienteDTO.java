package com.fatec.paddocca.dto;

import java.sql.Date;

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
public class ClienteDTO extends UsuarioDTO {
	
    private String cpf;
    private Date dataNascimento;
    private String endereco;
    private String telefone;
}
