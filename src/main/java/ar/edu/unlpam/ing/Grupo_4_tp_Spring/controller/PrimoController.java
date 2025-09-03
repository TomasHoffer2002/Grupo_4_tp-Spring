package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Primo;

@RestController
@RequestMapping("/esPrimo")
public class PrimoController {

    @GetMapping("/{numero}")
    public Primo esPrimo(@PathVariable int numero){
        return new Primo(numero);
    }
}

