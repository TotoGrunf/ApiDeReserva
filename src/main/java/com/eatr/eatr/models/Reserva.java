package com.eatr.eatr.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    @OneToMany(mappedBy = "reserva", fetch = FetchType.EAGER)
    Set<ListaReservas> listaReservas = new HashSet<>();


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

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Set<ListaReservas> getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(Set<ListaReservas> listaReservas) {
        this.listaReservas = listaReservas;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }
}
