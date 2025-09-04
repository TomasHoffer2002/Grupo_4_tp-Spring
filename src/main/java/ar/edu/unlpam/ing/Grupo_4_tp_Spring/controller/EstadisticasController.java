package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.EstadisticasCalculator;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticasController {

    @PostMapping
    public EstadisticasResponse calcularEstadisticas(@RequestBody NumerosRequest request) {
        EstadisticasCalculator calculator = new EstadisticasCalculator(request.numeros());
        
        return new EstadisticasResponse(
            calculator.calcularPromedio(),
            calculator.calcularMinimo(),
            calculator.calcularMaximo(),
            calculator.calcularCantidad()
        );
    }

    // Record permite definir metodos getters, toString, equals y hashCode automaticamente
    public record NumerosRequest(java.util.ArrayList<Double> numeros) {}
    
    public record EstadisticasResponse(
        double promedio,
        double minimo,
        double maximo,
        int cantidad
    ) {}
}