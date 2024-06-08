package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Carrinho;
import com.fatec.paddocca.service.CarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/carrinhos")
public class CarrinhoController {
    @Autowired
    private CarrinhoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Carrinho salvarCarrinho(@RequestBody Carrinho carrinho) {
        return service.save(carrinho);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Carrinho findByClienteId(@PathVariable Long id) {
        return service.findByClienteId(id);
    }
}
