package com.eatr.eatr.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
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
    @JoinColumn(name = "listaReservas_id")
    private ListaReservas listaReservas;
    private Integer cantidadDePersonas;
    private String numMesa;
    private LocalDateTime fecha;

    public Reserva() {
    }

    public Reserva(String numMesa, LocalDateTime fecha, Usuario usuario, Integer cantidadDePersonas, ListaReservas listaReservas) {
        this.numMesa = numMesa;
        this.fecha = fecha;
        this.usuario = usuario;
        this.cantidadDePersonas = cantidadDePersonas;
        this.listaReservas = listaReservas;
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

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(Integer cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }
    @JsonIgnore
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public ListaReservas getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ListaReservas listaReservas) {
        this.listaReservas = listaReservas;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}