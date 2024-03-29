package com.eatr.eatr.controllers;

import com.eatr.eatr.dtos.UsuarioDTO;
import com.eatr.eatr.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @GetMapping("/api/usuario/{id}")
    public UsuarioDTO getUsuario(@PathVariable long id){

        return new UsuarioDTO(usuarioRepository.findById(id));
    }
}
