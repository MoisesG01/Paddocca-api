package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Entregador;
import com.fatec.paddocca.service.EntregadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/entregadores")
public class EntregadorController {

    @Autowired
    private EntregadorService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Entregador salvarEntregador(@RequestBody Entregador entregador) {
        return service.save(entregador);
    }
}
