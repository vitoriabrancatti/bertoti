package com.example.demo;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Controller
@RequestMapping("produtos")
@RequiredArgsConstructor

public class ProdutoController {
    private final ProdutoService produtoService;

    @PostMapping
    public ResponseEntity<Produto> createProduto(@RequestBody Produto produto){
        Produto newProduto = produtoService.criarProduto(produto);
        return ResponseEntity.ok().body(newProduto);

    }
    @GetMapping
    public ResponseEntity<List<Produto>> getAllProdutos(){
        return ResponseEntity.ok().body(produtoService.buscarProdutos());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteProduto(@PathVariable Long id){
        produtoService.deleteporId(id);
        return ResponseEntity.noContent().build();

    }
}
