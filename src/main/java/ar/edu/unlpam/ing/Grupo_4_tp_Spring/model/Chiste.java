package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

public class Chiste {
    private int id;
    private String type;
    private String setup;
    private String punchline;

    // Constructor vacío (necesario para la serialización de JSON)
    public Chiste() {
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getSetup() {
        return setup;
    }

    public void setSetup(String setup) {
        this.setup = setup;
    }

    public String getPunchline() {
        return punchline;
    }

    public void setPunchline(String punchline) {
        this.punchline = punchline;
    }
}
