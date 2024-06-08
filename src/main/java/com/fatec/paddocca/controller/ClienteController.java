package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Cliente;
import com.fatec.paddocca.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

    @Autowired
    private ClienteService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente salvarCliente(@RequestBody Cliente cliente) {
        return service.save(cliente);
    }
}
