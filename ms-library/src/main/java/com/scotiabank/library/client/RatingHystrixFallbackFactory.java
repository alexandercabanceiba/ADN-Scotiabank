package com.scotiabank.library.client;

import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class RatingHystrixFallbackFactory implements RatingCliente{
    @Override
    public ResponseEntity<List<Rating>> obtenerTodosLosRating() {
        List<Rating> ratings = new ArrayList();
        Rating rating = Rating.builder().id(0l).bookId(0l).stars(0).build();
        ratings.add(rating);
        return ResponseEntity.ok(ratings);
    }

    @Override
    public ResponseEntity<Long> crearRating() {
        return null;
    }
}
