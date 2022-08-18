package com.scotiabank.api.aplicacion.rating;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class ManejadorConsultarRating {
    public List<com.scotiabank.api.dominio.rating.RatingDto> ejecutar(){

        List<com.scotiabank.api.dominio.rating.RatingDto> ratings = new ArrayList();

        ratings.add(new com.scotiabank.api.dominio.rating.RatingDto(2,2, 5));

        return ratings;
    }

}
