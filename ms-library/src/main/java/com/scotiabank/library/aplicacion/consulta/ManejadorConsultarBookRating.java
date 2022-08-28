package com.scotiabank.library.aplicacion.consulta;

import com.scotiabank.library.client.BookCliente;
import com.scotiabank.library.client.RatingCliente;
import com.scotiabank.library.dominio.book.Book;
import com.scotiabank.library.dominio.library.Library;
import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class ManejadorConsultarBookRating {
    @Autowired
    BookCliente bookCliente;

    @Autowired
    RatingCliente ratingCliente;

    public Library ejecutar(){

        List<Book> books = bookCliente.obtenerTodosLosLibros().getBody();
        List<Rating> ratings = ratingCliente.obtenerTodosLosRating().getBody();

        return new Library(books, ratings);
    }

}
