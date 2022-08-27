package com.scotiabank.api.infraestructura.controlador;


import com.scotiabank.api.aplicacion.book.ManejadorConsultarBook;
import com.scotiabank.api.dominio.book.BookDto;
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
public class ConsultaControladorBook {

    private final ManejadorConsultarBook manejadorConsultarBook;

    @GetMapping("obtener-libros")
    public ResponseEntity<List<BookDto>> obtenerTodosLosLibros() {
        return ResponseEntity.ok(manejadorConsultarBook.ejecutar());
    }



}

