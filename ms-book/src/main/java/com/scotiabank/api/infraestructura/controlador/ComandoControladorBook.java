package com.scotiabank.api.infraestructura.controlador;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/books")
public class ComandoControladorBook {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("crear")
    public ResponseEntity<Long> crearLibro() {
        return ResponseEntity.ok(1l);
    }

    @PutMapping("actualizar")
    public ResponseEntity<Long> actualizarLibro() {
        return ResponseEntity.ok(1l);
    }

    @DeleteMapping("eliminar")
    public ResponseEntity<Long> eliminarLibro() {
        return ResponseEntity.ok(1l);
    }
}
