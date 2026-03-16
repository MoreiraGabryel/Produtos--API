package com.Moreira.produtosapi.repository;
import com.Moreira.produtosapi.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto,String> {
}
