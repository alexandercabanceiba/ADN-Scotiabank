package com.scotiabank.library.infraestructura.controlador;

/*import com.scotiabank.library.aplicacion.consulta.ManejadorConsultarBook;
import com.scotiabank.library.dominio.RibbonConfiguration;*/
import com.scotiabank.library.aplicacion.consulta.ManejadorConsultarBookRating;
import com.scotiabank.library.dominio.library.Library;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@CrossOrigin("*")
@RestController
@AllArgsConstructor
@Slf4j
@RequestMapping("/library")
public class ConsultaControladorBookRating {
    private final ManejadorConsultarBookRating manejadorConsultarBookRating;
    //private final ManejadorConsultarBook manejadorConsultarBook;

    @GetMapping("obtener-books-ratings")
    public ResponseEntity<Library> obtenerLibrosYRatings() {
        return ResponseEntity.ok(manejadorConsultarBookRating.ejecutar());
    }

    /*@GetMapping("obtener-books")
    public ResponseEntity<Library> obtenerLibros() {
        return ResponseEntity.ok(manejadorConsultarBook.ejecutar());
    }*/

}

