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

    @OneToOne(mappedBy = "listaReservas")
    private Restaurante restaurante;

//    @ManyToOne(fetch = FetchType.EAGER)
//    @JoinColumn(name = "reserva_id")
//    private Reserva reserva;

    @OneToMany(mappedBy = "listaReservas", fetch = FetchType.EAGER)
    Set<Reserva> reservas = new HashSet<>();

    private Integer cantidadDePersonas;
    private Boolean aceptacionDeReserva;
    private LocalDateTime fecha;
    private String NroMesa;

    public ListaReservas() {
    }

    public ListaReservas(Integer cantidadDePersonas, Boolean aceptacionDeReserva, LocalDateTime fecha, String nroMesa, Reserva reservas) {
        this.cantidadDePersonas = cantidadDePersonas;
        this.aceptacionDeReserva = aceptacionDeReserva;
        this.fecha = fecha;
        this.NroMesa = nroMesa;
        this.addReserva(reservas);
    }

    public long getId() {
        return id;
    }



    public void setId(long id) {
        this.id = id;
    }

    public Integer getCantidadDePersonas() {
        return cantidadDePersonas;
    }

    public void setCantidadDePersonas(Integer cantidadDePersonas) {
        this.cantidadDePersonas = cantidadDePersonas;
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

    public String getNroMesa() {
        return NroMesa;
    }

    public void setNroMesa(String nroMesa) {
        NroMesa = nroMesa;
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

    public void addReserva(Reserva reserva){
        reserva.setListaReservas(this);
        reservas.add(reserva);
    }
}
