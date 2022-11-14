package com.eatr.eatr.dtos;

import com.eatr.eatr.models.Restaurante;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.time.LocalDateTime;

public class RestauranteDTO {

    private String nombreResto, email, contraseña, ubicacion;
    private int numMesas;
    private LocalDateTime diasHorarios;


    public RestauranteDTO() {
    }

    public RestauranteDTO(Restaurante restaurante) {
        this.nombreResto = restaurante.getNombreResto();
        this.email = restaurante.getEmail();
        this.contraseña = restaurante.getContraseña();
        this.ubicacion = restaurante.getUbicacion();
        this.numMesas = restaurante.getNumMesas();
        this.diasHorarios = restaurante.getDiasHorarios();

    }

    public String getNombreResto() {
        return nombreResto;
    }

    public String getEmail() {
        return email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public int getNumMesas() {
        return numMesas;
    }

    public LocalDateTime getDiasHorarios() {
        return diasHorarios;
    }


}
