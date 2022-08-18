package com.scotiabank.api.aplicacion.book;

import com.scotiabank.api.dominio.book.BookDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ManejadorConsultarBook {
    public List<BookDto> ejecutar(){

        List<BookDto> books = new ArrayList();

        books.add(new BookDto(2,"Lo que el viento se llevo", "Margareth Michell"));

        return books;
    }

}
