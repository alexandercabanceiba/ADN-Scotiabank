package com.scotiabank.library.aplicacion;

import com.scotiabank.library.client.BookCliente;
import com.scotiabank.library.client.RatingCliente;
import com.scotiabank.library.dominio.book.Book;
import com.scotiabank.library.dominio.library.Library;
import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ManejadorConsultarBookRating {
    @Autowired
    BookCliente bookCliente;

    @Autowired
    RatingCliente ratingCliente;

    public Library ejecutar(){

        List<Book> books = new ArrayList();
        books = bookCliente.obtenerTodosLosLibros();

        List<Rating> ratings = new ArrayList();
        ratings = ratingCliente.obtenerTodosLosRating();
        //Book book = new Book(2,"Lo que el viento se llevo", "Margareth Michell");
        //Rating ratings = new Rating(2,2, 5);

        return new Library(books, ratings);
    }

}
