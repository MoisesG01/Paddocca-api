package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Produto;
import com.fatec.paddocca.repository.ProdutoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    @Autowired
    private ProdutoRepository repository;

    public Produto save(Produto produto) {
        return repository.save(produto);
    }

    public Produto findById(long id) {
        return repository.findById(id).orElseThrow( ()-> new EntityNotFoundException("Product not found"));
    }

    public List<Produto> findAll() {
        return repository.findAll();
    }

    public void delete(long id) {
        repository.deleteById(id);
    }
}
