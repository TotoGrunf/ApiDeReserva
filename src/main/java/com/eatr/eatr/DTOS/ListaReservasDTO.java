package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.ListaReservas;
import com.eatr.eatr.models.Restaurante;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class ListaReservasDTO {

    private  Long id;
    private Boolean aceptacionDeReserva;
    private LocalDateTime fecha;
    private Set<ReservaDTO> reservas;

    private Restaurante restaurante;

    public ListaReservasDTO() {
    }

    public ListaReservasDTO(ListaReservas listaReservas) {
        this.id = listaReservas.getId();
        this.restaurante= listaReservas.getRestaurante();
        this.aceptacionDeReserva = listaReservas.getAceptacionDeReserva();
        this.fecha = listaReservas.getFecha();
        this.reservas = listaReservas.getReservas().stream().map(reserva -> new ReservaDTO(reserva)).collect(Collectors.toSet());
    }

    public Boolean getAceptacionDeReserva() {
        return aceptacionDeReserva;
    }

    public Long getId() {
        return id;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Set<ReservaDTO> getReservas() {
        return reservas;
    }

}
