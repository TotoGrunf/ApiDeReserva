package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.ListaReservas;
import com.eatr.eatr.models.Reserva;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaReservasDTO {

    private Integer cantidadDePersonas;
    private Boolean aceptacionDeReserva;
    private LocalDateTime fecha;
    private String NroMesa;

    private Set<ReservaDTO> reservas;

    public ListaReservasDTO() {
    }

    public ListaReservasDTO(ListaReservas listaReservas) {
        this.cantidadDePersonas = listaReservas.getCantidadDePersonas();
        this.aceptacionDeReserva = listaReservas.getAceptacionDeReserva();
        this.fecha = listaReservas.getFecha();
        this.NroMesa = listaReservas.getNroMesa();
        this.reservas = listaReservas.getReservas().stream().map(reserva -> new ReservaDTO(reserva)).collect(Collectors.toSet());
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

    public Set<ReservaDTO> getReservas() {
        return reservas;
    }

    public String getNroMesa() {
        return NroMesa;
    }
}
