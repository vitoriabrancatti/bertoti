package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {
    private final ProdutoRepository produtoRepository;
    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }
    public Produto criarProduto(Produto produto){
        return produtoRepository.save(produto);
    }
    public List<Produto> buscarProdutos(){
        return produtoRepository.findAll();
    }
    public void deleteporId(Long id){
        produtoRepository.deleteById(id);
    }
}
