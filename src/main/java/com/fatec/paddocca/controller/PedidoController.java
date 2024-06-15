package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Pedido;
import com.fatec.paddocca.service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Pedido save (@RequestBody Pedido pedido) {
        return service.save(pedido);
    }
}
