package ar.edu.unlpam.ing.Grupo_4_tp_Spring.service;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Notas;

@Service
public class NotaService {
    private final List<Notas> notas = new ArrayList<>();

    public List<Notas> obtenerTodas() {
        return notas;
    }

    public Optional<Notas> obtenerPorId(int id) {
        return notas.stream().filter(nota -> nota.getId() == id).findFirst();
    }

    public Notas agregarNota(Notas nota) {
        notas.add(nota);
        return nota;
    }

    public Optional<Notas> actualizarNota(int id, String titulo, String contenido, Date fechaCreacion) {
        Optional<Notas> notaExistente = obtenerPorId(id);
        notaExistente.ifPresent(nota -> {
            notas.remove(nota);
            notas.add(new Notas(id,titulo, contenido, fechaCreacion));
        });
        return notaExistente;
    }

    public boolean eliminarNota(int id) {
        return notas.removeIf(nota -> nota.getId() == id);
    }
}