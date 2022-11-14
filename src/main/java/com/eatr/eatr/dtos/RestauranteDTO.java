package com.eatr.eatr.dtos;

import com.eatr.eatr.models.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.stream.Collectors;

public class RestauranteDTO {

    private String nombreResto, ubicacion;
    private int numMesas;
    private LocalDateTime diasHorarios;

    private Set<ReservaDTO> reservas;


    public RestauranteDTO() {
    }

    public RestauranteDTO(Restaurante restaurante) {
        this.nombreResto = restaurante.getNombreResto();
        this.ubicacion = restaurante.getUbicacion();
        this.numMesas = restaurante.getNumMesas();
        this.diasHorarios = restaurante.getDiasHorarios();
        this.reservas= restaurante.getReservas().stream().map(reserva -> new ReservaDTO(reserva)).collect(Collectors.toSet());

    }

    public String getNombreResto() {
        return nombreResto;
    }


    public String getUbicacion() {
        return ubicacion;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public LocalDateTime getDiasHorarios() {
        return diasHorarios;
    }

    public Set<ReservaDTO> getReservas() {
        return reservas;
    }
}
