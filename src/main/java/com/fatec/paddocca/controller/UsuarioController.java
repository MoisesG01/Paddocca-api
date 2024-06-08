package com.fatec.paddocca.controller;

import com.fatec.paddocca.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.fatec.paddocca.model.entity.Usuario;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService service;

    @PostMapping("/autenticar")
    public Usuario autenticar(@RequestBody Usuario usuario) {
        return service.autenticar(usuario.getEmail(), usuario.getSenha());
     }
}
