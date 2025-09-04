package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Invertir;

@RestController
@RequestMapping("/invertir")
public class InvertirController {

    @GetMapping("/{cadena}")
    public Map<String, String> invertirCadena(@PathVariable String cadena){
        Invertir invertir = new Invertir(cadena);
        return Map.of(
            "cadena original", cadena,
            "cadena invertida", invertir.convertir()
        );
    }
}

