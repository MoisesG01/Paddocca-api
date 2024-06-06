package com.fatec.paddocca.controller;

import com.fatec.paddocca.service.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fatec.paddocca.dto.ClienteDTO;
import com.fatec.paddocca.dto.EntregadorDTO;
import com.fatec.paddocca.dto.UsuarioDTO;
import com.fatec.paddocca.exception.ErroAutenticacao;
import com.fatec.paddocca.exception.RegraNegocioException;
import com.fatec.paddocca.model.entity.Cliente;
import com.fatec.paddocca.model.entity.Entregador;
import com.fatec.paddocca.model.entity.Usuario;
import com.fatec.paddocca.model.enums.TipoPerfil;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/usuarios")
@RequiredArgsConstructor
public class UsuarioController {
    private final UsuarioService service;

    @PostMapping("/autenticar")
    public Usuario autenticar(@RequestBody Usuario usuario) {
        return service.autenticar(usuario.getEmail(), usuario.getSenha());
     }
}
