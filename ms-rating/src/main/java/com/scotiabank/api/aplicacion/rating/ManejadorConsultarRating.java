package com.scotiabank.api.aplicacion.rating;

import com.scotiabank.api.dominio.rating.RatingDto;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ManejadorConsultarRating {
    public List<RatingDto> ejecutar(){

        List<RatingDto> ratings = new ArrayList();

        ratings.add(new RatingDto(1,1, 5));
        ratings.add(new RatingDto(2,2, 5));
        ratings.add(new RatingDto(3,3, 5));

        return ratings;
    }

}
