package com.fatec.paddocca.repository;

import com.fatec.paddocca.model.entity.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>, PagingAndSortingRepository<Produto, Long> {

}
