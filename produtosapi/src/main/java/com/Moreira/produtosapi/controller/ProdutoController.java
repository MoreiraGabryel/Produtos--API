package com.Moreira.produtosapi.controller;
//Esse package fica dando apenas sugestao de troca de nome aaaaaaaav,vou deixar assim mesmo

import com.Moreira.produtosapi.model.Produto;
import com.Moreira.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
@RequestMapping("produtos")

public class ProdutoController {
    private ProdutoRepository produtoRepository;

    public ProdutoController(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }


    //SALVAR PRODUTO
    @PostMapping
    public Produto salvar (@RequestBody Produto produto){
        System.out.println("Produto Recebido:" + produto);

        //Gerador Aleatorio do ID

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }



}
