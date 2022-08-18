package com.scotiabank.api.infraestructura.controlador;

import com.scotiabank.api.aplicacion.rating.ManejadorConsultarRating;
import com.scotiabank.api.dominio.rating.RatingDto;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RequestMapping("/ratings")
@RestController
@AllArgsConstructor
public class ConsultaControladorRating {

    private final ManejadorConsultarRating manejadorConsultarRating;

    @GetMapping("obtener-rating")
    public List<RatingDto> obtenerTodosLosRating() {
        return manejadorConsultarRating.ejecutar();
    }

}

