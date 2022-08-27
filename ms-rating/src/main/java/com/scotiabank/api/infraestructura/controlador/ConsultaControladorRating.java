package com.scotiabank.api.infraestructura.controlador;

import com.scotiabank.api.aplicacion.rating.ManejadorConsultarRating;
import com.scotiabank.api.dominio.rating.RatingDto;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/ratings")
public class ConsultaControladorRating {

    private final ManejadorConsultarRating manejadorConsultarRating;

    @GetMapping("obtener-rating")
    public ResponseEntity<List<RatingDto>> obtenerTodosLosRating() {
        return ResponseEntity.ok(manejadorConsultarRating.ejecutar());
    }

}

