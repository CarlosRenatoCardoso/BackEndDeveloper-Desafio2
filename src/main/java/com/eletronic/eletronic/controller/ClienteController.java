package com.eletronic.eletronic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eletronic.eletronic.model.Cliente;
import com.eletronic.eletronic.service.ClienteService;

@RestController
@RequestMapping("/api/cliente")
@CrossOrigin("*")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> obterTodos() {
        return clienteService.obterTodos();
    }   
    
    @GetMapping("/{id}")
    public Cliente obterPorId(@PathVariable Long id){
        return clienteService.obterPorId(id);
    }

    @PostMapping
    public Cliente adicionar(@RequestBody Cliente cliente){
        return clienteService.adicionar(cliente);
    }

    @PutMapping("/{id}")
    public Cliente atualizar(@PathVariable Long id, @RequestBody Cliente cliente){
        return clienteService.atualizar(id, cliente);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        clienteService.deletar(id);
    }
}
