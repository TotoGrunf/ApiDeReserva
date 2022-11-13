package com.eatr.eatr.Controllers;

import com.eatr.eatr.DTOS.ListaReservasDTO;
import com.eatr.eatr.DTOS.ReservaDTO;
import com.eatr.eatr.repositories.ListaReservasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ListaReservaController {

    @Autowired
    ListaReservasRepository listaReservasRepository;

    @GetMapping("/api/listaReserva/{id}")
    public ListaReservasDTO getReserva(@PathVariable long id){

        return new ListaReservasDTO(listaReservasRepository.findById(id));
    }
}
