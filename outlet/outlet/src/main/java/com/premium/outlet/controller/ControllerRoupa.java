package com.premium.outlet.controller;


import com.premium.outlet.dto.AtualizadasDadosRoupa;
import com.premium.outlet.dto.DadosCadastroRoupa;
import com.premium.outlet.dto.DadosListagemProduto;
import com.premium.outlet.model.Produto;
import com.premium.outlet.repository.RepositoryProduto;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
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
    @Transactional
    public void cadastrarRoupa(@RequestBody DadosCadastroRoupa roupa) {
        repositoryProduto.save(new Produto(roupa));
    }


    //Consultar informações no banco
    @GetMapping
    public Page<DadosListagemProduto> listarRoupas(Pageable pageable) {
        return repositoryProduto.findAll(pageable).map(DadosListagemProduto::new);
    }

    @GetMapping("/tipo/{tipo}")
    public Page<DadosListagemProduto> listarRoupasPorTipo(@PathVariable String tipo,  Pageable pageable) {
        return repositoryProduto.findByTipo(tipo, pageable).map(DadosListagemProduto::new);
    }

    @GetMapping("/marca/{marca}")
    public Page<DadosListagemProduto> listarRoupasPorMarca(@PathVariable String marca,  Pageable pageable) {
        return repositoryProduto.findByMarca(marca, pageable).map(DadosListagemProduto::new);
    }


    @GetMapping("/buscar")
    public Page<DadosListagemProduto> listarRoupasPorBusca(@RequestParam String tipo, Pageable pageable) {
        return repositoryProduto.findByTipoContainingIgnoreCase(tipo, pageable).map(DadosListagemProduto::new);
    }


    //Alteração das informações no banco
    @PutMapping
    @Transactional
    public void atualizarRoupa(@RequestBody @Valid AtualizadasDadosRoupa dadosRoupa) {
        var roupa = repositoryProduto.getReferenceById(dadosRoupa.id());
        roupa.atualizarInformacoes(dadosRoupa);
    }

    //Removendo informação do banco
    @DeleteMapping("{id}")
    @Transactional
    public void deletarRoupa(@PathVariable Long id) {
        repositoryProduto.deleteById(id);
    }

}
