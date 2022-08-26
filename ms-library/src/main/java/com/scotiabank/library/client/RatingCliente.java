package com.scotiabank.library.client;

import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "rating-service")

public interface RatingCliente {

    @GetMapping("obtener-rating")
    public List<Rating> obtenerTodosLosRating();
}
