package com.demo.Model;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Anuncio{

    private Integer relevancia; //de 0 a 5; onde 0 é pouco relevante e 5 é muito relevante
    private String titulo;
    private Double preco;



    public Anuncio(Integer relevancia, String titulo, Double preco) {
        this.relevancia = relevancia;
        this.titulo = titulo;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "nome do produto: " + titulo + " \npreço do produto: " + getPreco() + " \nrelevância: " + relevancia + "\n";
    }





}