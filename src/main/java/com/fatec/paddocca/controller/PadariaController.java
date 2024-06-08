package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Padaria;
import com.fatec.paddocca.service.PadariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/padarias")
public class PadariaController {

    @Autowired
    private PadariaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Padaria salvarPadaria(@RequestBody Padaria padaria) {
        return service.save(padaria);
    }
}
