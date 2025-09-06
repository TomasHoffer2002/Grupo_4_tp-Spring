package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

public class Invertir {
    private final String cadena;

    public Invertir(String cadena) {
        this.cadena = cadena;
    }

    public String getCadena() {
        return cadena;
    }

    public String convertir(){
        StringBuilder s = new StringBuilder(cadena);
        return s.reverse().toString();}
}
