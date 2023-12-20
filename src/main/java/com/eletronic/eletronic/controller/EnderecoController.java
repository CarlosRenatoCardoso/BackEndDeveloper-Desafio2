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

import com.eletronic.eletronic.model.Endereco;
import com.eletronic.eletronic.service.EnderecoService;

@RestController
@RequestMapping("/api/endereco")
@CrossOrigin("*")
public class EnderecoController {

    @Autowired
    private EnderecoService enderecoService;

    @GetMapping
    public List<Endereco> obterTodos() {
        return enderecoService.obterTodos();
    }   
    
    @GetMapping("/{id}")
    public Endereco obterPorId(@PathVariable Long id){
        return enderecoService.obterPorId(id);
    }

    @PostMapping
    public Endereco adicionar(@RequestBody Endereco endereco){
        return enderecoService.adicionar(endereco);
    }

    @PutMapping("/{id}")
    public Endereco atualizar(@PathVariable Long id, @RequestBody Endereco endereco){
        return enderecoService.atualizar(id, endereco);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id){
        enderecoService.deletar(id);
    }
}
