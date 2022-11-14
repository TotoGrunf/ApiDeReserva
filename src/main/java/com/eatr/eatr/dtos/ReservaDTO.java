package com.eatr.eatr.dtos;

import com.eatr.eatr.models.Reserva;
import com.eatr.eatr.models.Usuario;

import java.time.LocalDateTime;

public class ReservaDTO {

    private Long id;
    private String numMesa;
    private LocalDateTime fecha;
    private Integer cantidadDePersonas;
    private Usuario usuario;

    public ReservaDTO() {
    }

    public ReservaDTO(Reserva reserva) {

        this.id= reserva.getId();
        this.fecha = reserva.getFecha();
        this.numMesa = reserva.getNumMesa();
        this.usuario = reserva.getUsuario();
        this.cantidadDePersonas = reserva.getCantidadDePersonas();
    }

    public Long getId() {
        return id;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
