package com.scotiabank.library.client;

import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@FeignClient(name = "rating-service")
@RequestMapping("/ratings")
public interface RatingCliente {
    @GetMapping("obtener-rating")
    public ResponseEntity<List<Rating>> obtenerTodosLosRating();
}
