package ar.edu.unlpam.ing.Grupo_4_tp_Spring.service;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Chiste;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ChisteServicio {

    private final RestTemplate restTemplate;
    private final String API_URL = "https://official-joke-api.appspot.com/random_joke";

    public ChisteServicio() {
        this.restTemplate = new RestTemplate();
    }

    public Chiste obtenerChisteAleatorio() {
        try {
            // Llama a la API sin parámetros y mapea la respuesta JSON a un objeto Chiste.
            Chiste chiste = restTemplate.getForObject(API_URL, Chiste.class);
            return chiste;
        } catch (Exception e) {
            // Manejo de errores en caso de fallo en la conexión con la API externa.
            System.err.println("Error al obtener el chiste: " + e.getMessage());
            return null;
        }
    }
}