package com.scotiabank.library.client;

import com.scotiabank.library.dominio.book.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "book-service")
public interface BookCliente {
    @GetMapping("/books/obtener-libros")
    public ResponseEntity<List<Book>> obtenerTodosLosLibros();

    @PostMapping("/books/crear")
    public ResponseEntity<Long> crearLibro();
}
