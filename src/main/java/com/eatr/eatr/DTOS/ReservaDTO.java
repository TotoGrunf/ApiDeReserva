package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.Reserva;
import com.eatr.eatr.models.Usuario;

import java.time.LocalDateTime;
import java.util.Set;

public class ReservaDTO {

    private Long id;
    private String numMesa;
    private LocalDateTime fecha;

    private Usuario usuario;

    public ReservaDTO() {
    }

    public ReservaDTO(Reserva reserva) {

        this.id= reserva.getId();
        this.fecha = reserva.getFecha();
        this.numMesa = reserva.getNumMesa();
        this.usuario = reserva.getUsuario();
    }

    public Long getId() {
        return id;
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
