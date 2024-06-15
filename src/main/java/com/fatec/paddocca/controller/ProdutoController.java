package com.fatec.paddocca.controller;

import com.fatec.paddocca.model.entity.Produto;
import com.fatec.paddocca.service.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {

    @Autowired
    private ProdutoService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Produto save(@RequestBody Produto produto) {
        return service.save(produto);
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Produto findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Page<Produto> findAll(@RequestParam int page, @RequestParam int size) {
        return service.pagination(page, size);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}
