package com.demo.Controllers;

import com.demo.Model.Anuncio;
import com.demo.Services.AnuncioService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AnuncioController {

    AnuncioService anuncioService = new AnuncioService();

        @GetMapping("/anuncio")
        public String novoAnuncio() {
            Anuncio anuncio = new Anuncio(5, "ps 5", 10000.00);

            // retorna String
            return anuncio.toString();

            // retorn Json
//            return anuncio;

        }

        @GetMapping("/mostrar-anuncio")
        public List<Anuncio> mostrarAnuncios() {
            return  anuncioService.mostrarAnuncios();
        }










}
