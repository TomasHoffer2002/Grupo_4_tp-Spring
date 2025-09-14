package ar.edu.unlpam.ing.Grupo_4_tp_Spring.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Dolar;

@Service
public class DolarService {
    private static final String URL = "https://dolarapi.com/v1/dolares/blue";

    public Dolar getDolarBlue() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(URL, Dolar.class);
    }
}
