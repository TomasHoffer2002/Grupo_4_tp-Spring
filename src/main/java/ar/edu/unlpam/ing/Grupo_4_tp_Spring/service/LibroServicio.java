package ar.edu.unlpam.ing.Grupo_4_tp_Spring.service;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Libro;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Service
public class LibroServicio {

    private final List<Libro> libros = new ArrayList<>();
    private final AtomicLong counter = new AtomicLong();

    // Agrega libros de ejemplo al iniciar la aplicación.
    public LibroServicio() {
        libros.add(new Libro(counter.incrementAndGet(), "Cien años de soledad", "Gabriel García Márquez", 1967));
        libros.add(new Libro(counter.incrementAndGet(), "1984", "George Orwell", 1949));
        libros.add(new Libro(counter.incrementAndGet(), "El Principito", "Antoine de Saint-Exupéry", 1943));
    }

    // Retorna todos los libros.
    public List<Libro> listarTodos() {
        return new ArrayList<>(libros);
    }

    // Agrega un nuevo libro.
    public Libro agregarLibro(Libro libro) {
        libro.setId(counter.incrementAndGet());
        libros.add(libro);
        return libro;
    }

    // Busca un libro por su ID.
    public Optional<Libro> buscarPorId(Long id) {
        return libros.stream()
                .filter(l -> l.getId().equals(id))
                .findFirst();
    }

    // Elimina un libro por su ID.
    public boolean eliminarLibro(Long id) {
        return libros.removeIf(libro -> libro.getId().equals(id));
    }
}