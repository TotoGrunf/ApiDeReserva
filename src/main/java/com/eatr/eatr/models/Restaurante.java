package com.eatr.eatr.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDateTime;
@Entity
public class Restaurante {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    private long id;

    @OneToOne(mappedBy = "restaurante")
    private ListaReservas listaReservas;
    private String nombreResto, email, contraseña, ubicacion;
    private int numMesas;
    private LocalDateTime diasHorarios;

    public Restaurante() {
    }

    public Restaurante(String nombreResto, String email, String contraseña, String ubicacion, int numMesas,
                       LocalDateTime diasHorarios, ListaReservas listaReservas) {
        this.nombreResto = nombreResto;
        this.email = email;
        this.contraseña = contraseña;
        this.ubicacion = ubicacion;
        this.numMesas = numMesas;
        this.diasHorarios = diasHorarios;
        this.listaReservas = listaReservas;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombreResto() {
        return nombreResto;
    }

    public void setNombreResto(String nombreResto) {
        this.nombreResto = nombreResto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public void setNumMesas(int numMesas) {
        this.numMesas = numMesas;
    }

    public LocalDateTime getDiasHorarios() {
        return diasHorarios;
    }

    public void setDiasHorarios(LocalDateTime diasHorarios) {
        this.diasHorarios = diasHorarios;
    }

    public ListaReservas getListaReservas() {
        return listaReservas;
    }

    public void setListaReservas(ListaReservas listaReservas) {
        this.listaReservas = listaReservas;
    }
}
