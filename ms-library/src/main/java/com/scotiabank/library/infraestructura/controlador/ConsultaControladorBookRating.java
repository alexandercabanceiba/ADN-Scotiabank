package com.scotiabank.library.infraestructura.controlador;

import com.scotiabank.library.aplicacion.consulta.ManejadorConsultarBookRating;
import com.scotiabank.library.dominio.library.Library;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/library")
public class ConsultaControladorBookRating {
    private final ManejadorConsultarBookRating manejadorConsultarBookRating;

    @GetMapping("obtener-books-ratings")
    public ResponseEntity<Library> obtenerLibrosYRatings() {
        return ResponseEntity.ok(manejadorConsultarBookRating.ejecutar());
    }

}

