package com.scotiabank.api.infraestructura.controlador;

import com.scotiabank.api.dominio.respuesta.ComandoRespuesta;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@RequestMapping("/ratings")
public class ComandoControladorRating {

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("crear")
    public ComandoRespuesta<Long> crearLibro() {
        return new ComandoRespuesta<>(1l);
    }

    @PutMapping("actualizar")
    public ComandoRespuesta<Long> actualizarLibro() {
        return new ComandoRespuesta<>(1l);
    }

    @DeleteMapping("eliminar")
    public ComandoRespuesta<Long> eliminarLibro() {
        return new ComandoRespuesta<>(1l);
    }
}
