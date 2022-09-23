package com.scotiabank.library.infraestructura.controlador;

import com.scotiabank.library.ribbonconfiguration.RibbonConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "ping-a-server", configuration = RibbonConfiguration.class)
public class RibbonControladorBookRating {
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/lb/books/obtener-libros")
    public String obtenerTodosLosLibros() {
        return this.restTemplate.getForObject(
                "http://ping-server/books/obtener-libros", String.class);
    }

    @RequestMapping("/lb/books/crear")
    public String crearLibro() {
        return this.restTemplate.getForObject(
                "http://ping-server/books/crear", String.class);
    }

    @RequestMapping("/lb/ratings/obtener-rating")
    public String obtenerTodosLosRating() {
        return this.restTemplate.getForObject(
                "http://ping-server/ratings/obtener-rating", String.class);
    }

    @RequestMapping("/lb/ratings/crear")
    public String crearRating() {
        return this.restTemplate.getForObject(
                "http://ping-server/ratings/crear", String.class);
    }
}
