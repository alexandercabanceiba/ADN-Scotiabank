package com.scotiabank.library.infraestructura.controlador;

import com.scotiabank.library.aplicacion.comando.ManejadorRegistrarLibrosYRatings;
import com.scotiabank.library.dominio.library.Library;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/library")
public class ComandoControladorBookRating {

    private final ManejadorRegistrarLibrosYRatings manejadorRegistrarLibrosYRatings;

    @PostMapping("crear-books-ratings")
    public ResponseEntity<Long> obtenerLibrosYRatings() {
        return ResponseEntity.ok(manejadorRegistrarLibrosYRatings.ejecutar());
    }
}
