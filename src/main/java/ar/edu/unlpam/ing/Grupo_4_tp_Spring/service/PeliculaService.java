package ar.edu.unlpam.ing.Grupo_4_tp_Spring.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Pelicula;

@Service
public class PeliculaService {
    private final ArrayList<Pelicula>peliculas = new ArrayList<>();
    
    public PeliculaService(){
        peliculas.add(new Pelicula("Batman: El caballero de la noche","Christopher Nolan",2008,"Acción/Crimen"));
        peliculas.add(new Pelicula("El Señor de los Anillos: el retorno del Rey","Peter Jackson",2003,"Fantasía/Aventura"));
    }

    public ArrayList<Pelicula> obtenerTodas(){
        return peliculas;
    }
    
    public Pelicula buscarPorTitulo(String titulo){
        for(Pelicula p:peliculas){
            if(p.getTitulo().equalsIgnoreCase(titulo)){
                return p;
            }
        }
        return null;
    }

    public Pelicula agregarPelicula(Pelicula pelicula){
        peliculas.add(pelicula);
        return pelicula;
    }

    public boolean eliminarPelicula(int id){
        return peliculas.removeIf(p -> p.getId() == id);
    }
}
