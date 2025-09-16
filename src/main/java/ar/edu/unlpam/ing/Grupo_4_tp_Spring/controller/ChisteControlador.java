package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Chiste;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.service.ChisteServicio;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chistes")
public class ChisteControlador {

    private final ChisteServicio chisteServicio;

    public ChisteControlador(ChisteServicio chisteServicio) {
        this.chisteServicio = chisteServicio;
    }

    @GetMapping("/aleatorio")
    public ResponseEntity<Chiste> getChisteAleatorio() {
        Chiste chiste = chisteServicio.obtenerChisteAleatorio();
        if (chiste != null) {
            return ResponseEntity.ok(chiste);
        } else {
            // Devuelve un error 503 (Servicio no disponible) si la API externa falla.
            return ResponseEntity.status(HttpStatus.SERVICE_UNAVAILABLE).build();
        }
    }
}
