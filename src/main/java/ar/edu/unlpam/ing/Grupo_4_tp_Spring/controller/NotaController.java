package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Notas;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.service.NotaService;

@RestController
@RequestMapping("/notas")
public class NotaController {

    @Autowired
    private NotaService notaService;

    @GetMapping
    public List<Notas> obtenerTodas() {
        return notaService.obtenerTodas();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notas> obtenerPorId(@PathVariable int id) { //devuelve respuesta HTTP
        return notaService.obtenerPorId(id)
                .map(ResponseEntity::ok) //devuelve el codigo 200(de encontrado) con la nota
                .orElse(ResponseEntity.notFound().build()); //devuelve el codigo 404 (no encontrado)
    }

    @PostMapping
    public Notas agregarNota(@RequestBody Notas nota) {
        return notaService.agregarNota(nota);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Notas> actualizarNota(@PathVariable int id, @RequestBody Notas nota) {
        Optional<Notas> notaActualizada = notaService.actualizarNota(id, nota.getTitulo(), nota.getContenido(), nota.getFechaCreacion());
        return notaActualizada.map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarNota(@PathVariable int id) {
        if (notaService.eliminarNota(id)) {
            return ResponseEntity.noContent().build();
        }
        return ResponseEntity.notFound().build();
    }
}