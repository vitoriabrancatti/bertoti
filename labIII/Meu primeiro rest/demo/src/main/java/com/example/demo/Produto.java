package com.example.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "produto")
@AllArgsConstructor
@NoArgsConstructor

public class Produto {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "nome")
    private String nome;
    @Column(name = "preco")
    private double preco;
    @Column(name = "quantidade")
    private int quantidade;
    @Column(name = "marca")
    private String marca;

}


