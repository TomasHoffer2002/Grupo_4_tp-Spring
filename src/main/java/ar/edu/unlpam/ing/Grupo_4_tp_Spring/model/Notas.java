package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;
//import jakarta.persistence.*;

import java.sql.Date;

//@Entity
public class Notas {
    //@Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String titulo;
    private String contenido;
    private Date fechaCreacion;

    public Notas() {
    }

    public Notas(int id, String titulo, String contenido, Date fechaCreacion) {
        this.id = id;
        this.titulo = titulo;
        this.contenido = contenido;
        this.fechaCreacion = fechaCreacion;
    }

    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public Date getFechaCreacion() {
        return fechaCreacion;
    }
    

    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
}
