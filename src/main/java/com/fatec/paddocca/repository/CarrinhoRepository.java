package com.fatec.paddocca.repository;

import com.fatec.paddocca.model.entity.Carrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarrinhoRepository extends JpaRepository<Carrinho, Long> {
    Carrinho findByClienteId(Long id);
}
