package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Conversion;

@RestController
@RequestMapping("/celsiusAfahrenheit") 

public  class ConversionController {
   //otra forma de devolver un JSON es con Map
   @GetMapping("/{celsius}")
   public Map<String, Object> convertir(@PathVariable double celsius){
      Conversion conversion = new Conversion(celsius, 0);
      return Map.of(
        "celcius", celsius,
        "fahrenheit", conversion.convertir()
    );
   }
}