package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.ListaReservas;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaReservasDTO {
    private Boolean aceptacionDeReserva;
    private LocalDateTime fecha;
    private Set<ReservaDTO> reservas;

    public ListaReservasDTO() {
    }

    public ListaReservasDTO(ListaReservas listaReservas) {
        this.aceptacionDeReserva = listaReservas.getAceptacionDeReserva();
        this.fecha = listaReservas.getFecha();
        this.reservas = listaReservas.getReservas().stream().map(reserva -> new ReservaDTO(reserva)).collect(Collectors.toSet());
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

}
