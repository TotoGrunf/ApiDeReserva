package com.eatr.eatr.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private String numMesa;
    private LocalDateTime fecha;

    public Reserva() {
    }

    public Reserva(long id, String numMesa, LocalDateTime fecha) {
        this.id = id;
        this.numMesa = numMesa;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNumMesa() {
        return numMesa;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
