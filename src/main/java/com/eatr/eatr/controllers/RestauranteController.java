package com.eatr.eatr.controllers;

import com.eatr.eatr.dtos.RestauranteDTO;
import com.eatr.eatr.models.Restaurante;
import com.eatr.eatr.repositories.RestauranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
public class RestauranteController {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Autowired
    private RestauranteRepository restauranteRepository;

    @GetMapping("/api/restaurantes")
    public List<Restaurante> restaurantes(){
        return restauranteRepository.findAll();
    }

    @GetMapping("/api/restaurante/{id}")
    public RestauranteDTO getRestaurante(@PathVariable long id){
        return new RestauranteDTO(restauranteRepository.findById(id));
    }

    @PostMapping("/api/restaurante")
    public ResponseEntity<Object> registro(@RequestParam String nombreResto, @RequestParam String email, @RequestParam String contraseña, @RequestParam String ubicacion,
                                           @RequestParam int numMesas){

        if (nombreResto.isEmpty() || email.isEmpty() || contraseña.isEmpty() || ubicacion.isEmpty() || numMesas <= 1){
            return new ResponseEntity<>("Completar todos los datos", HttpStatus.FORBIDDEN);
        }
        if (restauranteRepository.findByEmail(email) != null){
            return new ResponseEntity<>("El reataurante ya fue registrado", HttpStatus.FORBIDDEN);
        }

        Restaurante nuevoRestaurante = new Restaurante(nombreResto, email, contraseña, ubicacion, numMesas, LocalDateTime.now());

        return new ResponseEntity<>(HttpStatus.CREATED);
    }
}
