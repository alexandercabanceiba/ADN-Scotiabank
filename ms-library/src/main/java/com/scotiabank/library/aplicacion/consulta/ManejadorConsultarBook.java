/*package com.scotiabank.library.aplicacion.consulta;

import com.scotiabank.library.dominio.RibbonConfiguration;
import com.scotiabank.library.dominio.library.Library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
@RibbonClient(name = "ping-a-server", configuration = RibbonConfiguration.class)
public class ManejadorConsultarBook {
    @Autowired
    RestTemplate restTemplate;

    public Library ejecutar(){
        return this.restTemplate.getForObject("http://ping-server/locaus", Library.class);
    }

}BORRAR*/
