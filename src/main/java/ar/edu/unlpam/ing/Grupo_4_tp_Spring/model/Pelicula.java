package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

public class Pelicula {
    private final int id;
    private String titulo;
    private String director;
    private int anio;
    private String genero;
    private static int sumarId=0;

    public Pelicula(String titulo,String director,int anio,String genero){
        this.id = ++sumarId;
        this.titulo = titulo;
        this.director = director;
        this.anio = anio;
        this.genero = genero;
    }
    public int getId(){
        return id;
    }
    public String getTitulo(){
        return this.titulo;
    }
    public String getDirector(){
        return this.director;
    }
    public int getAnio(){
        return this.anio;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setAnio(int anio){
        this.anio=anio;
    }
    public void setTitulo(String titulo){
        this.titulo=titulo;
    }
    public void setDirector(String director){
        this.director=director;
    }
    public void setGenero(String genero){
        this.genero=genero;
    }
}
