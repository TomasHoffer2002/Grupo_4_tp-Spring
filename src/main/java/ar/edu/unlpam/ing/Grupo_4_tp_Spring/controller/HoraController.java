package ar.edu.unlpam.ing.Grupo_4_tp_Spring.controller;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ar.edu.unlpam.ing.Grupo_4_tp_Spring.model.Horario;


@RestController
@RequestMapping("/hora")
public class HoraController {

    @GetMapping
    public Map<String, String> convertirHora(@RequestParam String fecha,@RequestParam String origen , @RequestParam String destino) {
        LocalDateTime fechaLocal = LocalDateTime.parse(fecha);
        ZoneId ZoneOrigen = ZoneId.of(origen);
        ZoneId ZoneDestino = ZoneId.of(destino);
        ZonedDateTime horarioZona = ZonedDateTime.of(fechaLocal, ZoneOrigen);
        Horario horario = new Horario(horarioZona, ZoneDestino);

        return Map.of(
            "Origen:", fechaLocal.toString(),
            "Destino:", horario.toString()
        );
    }
}
