package com.Moreira.produtosapi.controller;
//Esse package fica dando apenas sugestao de troca de nome aaaaaaaav,vou deixar assim mesmo

import com.Moreira.produtosapi.model.Produto;
import com.Moreira.produtosapi.repository.ProdutoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;
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
    public Produto salvar(@RequestBody Produto produto) {
        System.out.println("Produto Recebido:" + produto);

        //Gerador Aleatorio do ID

        var id = UUID.randomUUID().toString();
        produto.setId(id);

        produtoRepository.save(produto);
        return produto;
    }

    //Buscar via id
    @GetMapping("{id}")
    public Produto obterPorId(@PathVariable("id") String id) {
        return produtoRepository.findById(id).orElse(null);
    }


    @DeleteMapping("{id}")
    //Deletar Produtos
    public void deletar ( @PathVariable("id") String id){
        produtoRepository.deleteById(id);

    }
    @PutMapping("{id}")
    // Atualizar o produto
    public void atualizar (@PathVariable ("id") String id,@RequestBody Produto produto){
        produto.setId(id);
        produtoRepository.save(produto);
    }

    @GetMapping
        //Busca de Produto
        //Criando um metodo no produtoRepository

        public List <Produto> buscar(@RequestParam("nome")String nome){
            return produtoRepository.findByNome(nome);
    }
}



