package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.ListaReservas;

import java.time.LocalDateTime;

public class ListaReservasDTO {

    private Integer cantidadDePersonas;
    private Boolean aceptacionDeReserva;
    private LocalDateTime fecha;
    private String NroMesa;

    public ListaReservasDTO() {
    }

    public ListaReservasDTO(ListaReservas listaReservas) {
        this.cantidadDePersonas = listaReservas.getCantidadDePersonas();
        this.aceptacionDeReserva = listaReservas.getAceptacionDeReserva();
        this.fecha = listaReservas.getFecha();
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public Boolean getAceptacionDeReserva() {
        return aceptacionDeReserva;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public String getNroMesa() {
        return NroMesa;
    }
}
