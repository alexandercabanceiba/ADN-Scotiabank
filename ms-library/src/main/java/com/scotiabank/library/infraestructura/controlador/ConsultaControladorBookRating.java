package com.scotiabank.library.infraestructura.controlador;

import com.scotiabank.library.aplicacion.ManejadorConsultarBookRating;
import com.scotiabank.library.dominio.book.Book;
import com.scotiabank.library.dominio.library.Library;
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
@RequestMapping("/library")
public class ConsultaControladorBookRating {
    private final ManejadorConsultarBookRating manejadorConsultarBookRating;

    @GetMapping("obtener-books-rating")
    public ResponseEntity<Library> obtenerTodosLosLibros() {
        return ResponseEntity.ok(manejadorConsultarBookRating.ejecutar());
    }

}

