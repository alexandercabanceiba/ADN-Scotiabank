package com.scotiabank.library.aplicacion.comando;

import com.scotiabank.library.client.BookCliente;
import com.scotiabank.library.client.RatingCliente;
import com.scotiabank.library.dominio.book.Book;
import com.scotiabank.library.dominio.library.Library;
import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ManejadorRegistrarLibrosYRatings {

    @Autowired
    BookCliente bookCliente;

    @Autowired
    RatingCliente ratingCliente;

    public Long ejecutar(){

        Long books = bookCliente.crearLibro().getBody();
        Long ratings = ratingCliente.crearRating().getBody();


        Long resp = null ;
        if(books == 1l && ratings == 1l){
            resp = 1l;
        }

        return resp;
    }
}
