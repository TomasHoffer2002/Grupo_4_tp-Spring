package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Horario {
    private final ZonedDateTime horario;
    private final ZoneId zona;
    public Horario(ZonedDateTime horario, ZoneId zoneId) {
        this.horario = horario;
        this.zona = zoneId;
    }

    public LocalDateTime convertir(){
        return horario.withZoneSameInstant(zona).toLocalDateTime();
    }

    @Override
    public String toString() {
        return convertir().toString();
    }
}
