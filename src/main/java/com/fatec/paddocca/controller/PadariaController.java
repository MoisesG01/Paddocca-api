package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Padaria;
import com.fatec.paddocca.service.PadariaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/padarias")
public class PadariaController {

    @Autowired
    private PadariaService service;

    @PostMapping
    public ResponseEntity<Padaria> salvarPadaria(@RequestBody Padaria padaria) {
        return ResponseEntity.ok(service.save(padaria));
    }
}
