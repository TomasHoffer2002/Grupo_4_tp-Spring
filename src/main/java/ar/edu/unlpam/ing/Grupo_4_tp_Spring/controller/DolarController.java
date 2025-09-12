package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Dolar;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.service.DolarService;

@RestController
public class DolarController {
    private final DolarService dolarService;

    public DolarController(DolarService dolarService){
        this.dolarService = dolarService;
    }

    @GetMapping("dolar/blue")
    public Dolar getDolarBlue() {
        return dolarService.getDolarBlue();
    }
    
}
