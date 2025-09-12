package ar.edu.unlpam.ing.Grupo_4_tp_Spring.model;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Dolar {
    private String moneda;
    private String casa;
    private String nombre;
    private Double compra;
    private Double venta;
    @JsonProperty("fechaActualizacion")
    private LocalDateTime fechaActualizacion;

    public String getMoneda() { return moneda; }
    public void setMoneda(String moneda) { this.moneda = moneda; }

    public String getCasa() { return casa; }
    public void setCasa(String casa) { this.casa = casa; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public Double getCompra() { return compra; }
    public void setCompra(Double compra) { this.compra = compra; }

    public Double getVenta() { return venta; }
    public void setVenta(Double venta) { this.venta = venta; }

    public LocalDateTime getFechaActualizacion() { return fechaActualizacion; }
    public void setFechaActualizacion(LocalDateTime fechaActualizacion) { this.fechaActualizacion = fechaActualizacion; }

}
