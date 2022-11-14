package com.eatr.eatr.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jdk.jshell.Snippet;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "restaurante_id")
    private Restaurante restaurante;


    private Integer cantidadDePersonas;
    private String numMesa;
    private LocalDateTime fecha;

    private Boolean aceptacion;

    public Reserva() {
    }

    public Reserva(String numMesa, LocalDateTime fecha, Usuario usuario, Integer cantidadDePersonas, Boolean aceptacion) {
        this.numMesa = numMesa;
        this.fecha = fecha;
        this.usuario = usuario;
        this.cantidadDePersonas = cantidadDePersonas;

        this.aceptacion = aceptacion;
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

    public Boolean getAceptacion() {
        return aceptacion;
    }

    public void setAceptacion(Boolean aceptacion) {
        this.aceptacion = aceptacion;
    }

    public void setNumMesa(String numMesa) {
        this.numMesa = numMesa;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(Integer cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}