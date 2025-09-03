package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

public class Conversion {
    private final double celsius;
    private final double fahrenheit;

    public Conversion(double celsius, double fahrenheit) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
    }

    public double getCelsius() {
        return celsius;
    }

    public double getFahrenheit() {
        return fahrenheit;
    }

    public double convertir(){
        return (celsius * 9/5) + 32;
    }
}
