package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Carrinho;
import com.fatec.paddocca.repository.CarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarrinhoService {

    @Autowired
    private CarrinhoRepository repository;

    public Carrinho save (Carrinho carrinho) {
        return repository.save(carrinho);
    }

    public Carrinho findByClienteId(long id) {
        return repository.findByClienteId(id);
    }
}
