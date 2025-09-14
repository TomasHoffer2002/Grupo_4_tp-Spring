package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Pelicula;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.service.PeliculaService;

@RestController
@RequestMapping("/peliculas")
public class PeliculaController {
    private final PeliculaService peliculaService;
    //inyeccion por constructor
    public PeliculaController(PeliculaService peliculaService) {
        this.peliculaService = peliculaService;
    } 
   

    @GetMapping
    public ArrayList<Pelicula> obtenerPeliculas(){
        return peliculaService.obtenerTodas();
    }

    @GetMapping("/buscar")
    public ResponseEntity<Pelicula> buscarPorTitulo(@RequestParam String titulo) {
       Pelicula peli = peliculaService.buscarPorTitulo(titulo);
       if(peli != null){
        return ResponseEntity.ok(peli);
       }else{
        return ResponseEntity.notFound().build();
       }
    }

    @PostMapping
    public Pelicula agregarPelicula(@RequestBody Pelicula pelicula) {
        return peliculaService.agregarPelicula(pelicula);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPelicula(@PathVariable int id) {
        boolean eliminado = peliculaService.eliminarPelicula(id);
        if (eliminado) {
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
