package com.eletronic.eletronic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronic.eletronic.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
