package com.eatr.eatr.Controllers;

import com.eatr.eatr.DTOS.RestauranteDTO;
import com.eatr.eatr.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestauranteController {

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("/api/restaurante/{id}")
    public RestauranteDTO getRestaurante(@PathVariable long id){
        return new RestauranteDTO(restauranteRepository.findById(id));
    }
}
