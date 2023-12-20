package com.eletronic.eletronic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eletronic.eletronic.model.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
