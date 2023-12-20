package com.eletronic.eletronic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronic.eletronic.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
