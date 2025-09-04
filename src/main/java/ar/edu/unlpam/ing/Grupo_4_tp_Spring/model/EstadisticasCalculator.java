package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

import java.util.ArrayList;
import java.util.List;

public class EstadisticasCalculator {
    private final List<Double> numeros;

    public EstadisticasCalculator(ArrayList<Double> numeros) {
        this.numeros = numeros != null ? new ArrayList<>(numeros) : new ArrayList<>();
    }

    public double calcularPromedio() {
        if (numeros.isEmpty()) return 0;
        return calcularSumatoria() / numeros.size();
    }

    public double calcularMinimo() {
        if (numeros.isEmpty()) return 0;
        double minimo = numeros.get(0);
        for (double num : numeros) {
            if (num < minimo) minimo = num;
        }
        return minimo;
    }

    public double calcularMaximo() {
        if (numeros.isEmpty()) return 0;
        double maximo = numeros.get(0);
        for (double num : numeros) {
            if (num > maximo) maximo = num;
        }
        return maximo;
    }

    public double calcularSumatoria() {
        if (numeros.isEmpty()) return 0;
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma;
    }

    public int calcularCantidad() {
        return numeros.size();
    }
}