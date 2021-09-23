package com.demo.Services;

import com.demo.Model.Anuncio;

import java.util.ArrayList;
import java.util.List;

public class AnuncioService {

    List<Anuncio> anuncios = new ArrayList<>();


    Anuncio ps5 = new Anuncio(5, "Ps 5", 10000.00);
    Anuncio ps4 = new Anuncio(4, "Ps 4", 3000.00);
    Anuncio xboxOne = new Anuncio(3, "ps 5", 2500.00);
    Anuncio pcGamer = new Anuncio(5, "ps 5", 20000.00);

    public void adicionaAnuncio(Anuncio newData) {
        anuncios.add(newData);

        // return para inserção dos dads do tipo anuncio no body da nossa requisição, no formato Json.

    }

    public List<Anuncio> mostrarAnuncios() {

//        o método sempre deve ser do tipo do return no caso aqui, List<Anuncio>

//        Para fins de teste inserimos os objetos na mão.

        anuncios.add(ps4);
        anuncios.add(ps5);
        anuncios.add(xboxOne);
        anuncios.add(pcGamer);

//        Retorna os objetos como Array/ vetores.
//        return anuncios.toString();

//        o simples retorno da lista já traz os objetos da lista no formato Json.
        return anuncios;


    }









}
