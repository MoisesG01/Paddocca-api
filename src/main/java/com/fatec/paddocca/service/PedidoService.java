package com.fatec.paddocca.service;

import com.fatec.paddocca.model.entity.Carrinho;
import com.fatec.paddocca.model.entity.Pedido;
import com.fatec.paddocca.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    public Pedido save (Pedido pedido) {
        return repository.save(pedido);
    }
}
