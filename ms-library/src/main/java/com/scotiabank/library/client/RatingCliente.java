package com.scotiabank.library.client;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.scotiabank.library.dominio.rating.Rating;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "rating-service", fallbackFactory = RatingHystrixFallbackFactory.class)
public interface RatingCliente {
    @GetMapping("/ratings/obtener-rating")
    public ResponseEntity<List<Rating>> obtenerTodosLosRating();

    @PostMapping("/ratings/crear")
    public ResponseEntity<Long> crearRating();
}
