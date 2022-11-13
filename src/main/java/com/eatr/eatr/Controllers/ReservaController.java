package com.eatr.eatr.Controllers;

import com.eatr.eatr.DTOS.ReservaDTO;
import com.eatr.eatr.repositories.ReservaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReservaController {

    @Autowired
    private ReservaRepository reservaRepository;

    @GetMapping("/api/reserva/{id}")
    public ReservaDTO getReserva(@PathVariable long id){

        return new ReservaDTO(reservaRepository.findById(id));
    }


}
