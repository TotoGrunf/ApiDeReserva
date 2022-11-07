package com.eatr.eatr.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mesas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    private Integer nroMesa;
    private Integer ppm;
    private Boolean disponibilidad;

    public Mesas() {
    }

    public Mesas(long id, Integer nroMesa, Integer ppm, Boolean disponibilidad) {
        this.id = id;
        this.nroMesa = nroMesa;
        this.ppm = ppm;
        this.disponibilidad = disponibilidad;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getNroMesa() {
        return nroMesa;
    }

    public void setNroMesa(Integer nroMesa) {
        this.nroMesa = nroMesa;
    }

    public Integer getPpm() {
        return ppm;
    }

    public void setPpm(Integer ppm) {
        this.ppm = ppm;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(Boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
