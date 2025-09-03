package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

public class Primo {
    private final int numero;
    private final boolean esPrimo;

    public Primo(int numero) {
        this.numero = numero;
        this.esPrimo = calcularPrimo(numero);
    }

    private boolean calcularPrimo(int numero){
        if (numero < 2) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Son necesarios para el JSON
    public int getNumero() {
        return numero;
    }

    public boolean isEsPrimo() {
        return esPrimo;
    }
}
