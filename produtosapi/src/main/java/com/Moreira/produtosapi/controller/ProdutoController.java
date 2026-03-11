package com.Moreira.produtosapi.controller;
//Esse package fica dando apenas sugestao de troca de nome aaaaaaaav,vou deixar assim mesmo

import com.Moreira.produtosapi.model.Produto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("produtos")

public class ProdutoController {

    //SALVAR PRODUTO
    @PostMapping
    public void salvar ( @RequestBody Produto produto){
        System.out.println("Produto Recebido:" + produto);
    }



}
