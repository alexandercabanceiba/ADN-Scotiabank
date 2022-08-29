package com.scotiabank.library.client;

import com.scotiabank.library.dominio.book.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class BookHystrixFallbackFactory implements BookCliente{
    @Override
    public ResponseEntity<List<Book>> obtenerTodosLosLibros() {
        List<Book> books = new ArrayList();
        Book book = Book.builder().id(0l).title("none").author("none").build();
        books.add(book);
        return ResponseEntity.ok(books);
    }

    @Override
    public ResponseEntity<Long> crearLibro() {
        return null;
    }
}
