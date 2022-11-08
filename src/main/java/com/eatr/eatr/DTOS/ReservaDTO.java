package com.eatr.eatr.DTOS;

import com.eatr.eatr.models.Reserva;

import java.time.LocalDateTime;

public class ReservaDTO {

    private Long id;
    private String numMesa;
    private LocalDateTime fecha;

    public ReservaDTO() {
    }

    public ReservaDTO(Reserva reserva) {

        this.id= reserva.getId();
        this.fecha = reserva.getFecha();
        this.numMesa = reserva.getNumMesa();
    }

    public Long getId() {
        return id;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
}
