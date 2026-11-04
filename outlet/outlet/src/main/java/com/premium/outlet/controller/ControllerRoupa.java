package com.premium.outlet.controller;


import com.premium.outlet.dto.DadosCadastroRoupa;
import com.premium.outlet.dto.DadosListagemProduto;
import com.premium.outlet.model.Produto;
import com.premium.outlet.repository.RepositoryProduto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/roupa")
public class ControllerRoupa {

    @Autowired
    private RepositoryProduto repositoryProduto;

    // Cadastrar Informações no banco de dados
    @PostMapping
    public void cadastrarRoupa(@RequestBody DadosCadastroRoupa roupa) {
        repositoryProduto.save(new Produto(roupa));
    }


    //Consultar informações no banco
    @GetMapping
    public Page<DadosListagemProduto> listarRoupas(Pageable pageable) {
        return repositoryProduto.findAll(pageable).map(DadosListagemProduto::new);
    }


}
