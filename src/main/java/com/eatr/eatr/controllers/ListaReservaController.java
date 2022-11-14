package com.eatr.eatr.controllers;

import com.eatr.eatr.dtos.ListaReservasDTO;
import com.eatr.eatr.repositories.ListaReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaReservaController {

    @Autowired
    private ListaReservasRepository listaReservasRepository;

    @GetMapping("/api/listaReserva/{id}")
    public ListaReservasDTO getReserva(@PathVariable long id){

        return new ListaReservasDTO(listaReservasRepository.findById(id));
    }
}
