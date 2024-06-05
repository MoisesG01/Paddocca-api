package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Produto;
import com.fatec.paddocca.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class ProdutoService {
    private ProdutoRepository repository;

    public Produto save(Produto produto) {
        return repository.save(produto);
    }
}
