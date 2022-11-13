package com.eatr.eatr.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@Entity
public class ListaReservas {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "restaurante_id", referencedColumnName = "id")
    private Restaurante restaurante;

    @OneToMany(mappedBy = "listaReservas", fetch = FetchType.EAGER)
    Set<Reserva> reservas = new HashSet<>();

    private Boolean aceptacionDeReserva;
    private LocalDateTime fecha;

    public ListaReservas() {
    }

    public ListaReservas(Boolean aceptacionDeReserva, LocalDateTime fecha) {
        this.aceptacionDeReserva = aceptacionDeReserva;
        this.fecha = fecha;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Boolean getAceptacionDeReserva() {
        return aceptacionDeReserva;
    }

    public void setAceptacionDeReserva(Boolean aceptacionDeReserva) {
        this.aceptacionDeReserva = aceptacionDeReserva;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Restaurante getRestaurante() {
        return restaurante;
    }

    public void setRestaurante(Restaurante restaurante) {
        this.restaurante = restaurante;
    }

    public Set<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(Set<Reserva> reservas) {
        this.reservas = reservas;
    }

}