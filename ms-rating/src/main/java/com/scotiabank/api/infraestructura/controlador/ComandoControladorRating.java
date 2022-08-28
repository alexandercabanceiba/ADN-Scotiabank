package com.scotiabank.api.infraestructura.controlador;

import com.scotiabank.api.dominio.rating.RatingDto;
import com.scotiabank.api.dominio.respuesta.ComandoRespuesta;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/ratings")
public class ComandoControladorRating {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("crear")
    public ResponseEntity<Long> crearRating() {
        return ResponseEntity.ok(1l);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Long> actualizarRating() {
        return ResponseEntity.ok(1l);
    }

    @DeleteMapping("eliminar")
    public ResponseEntity<Long> eliminarRating() {
        return ResponseEntity.ok(1l);
    }
}
