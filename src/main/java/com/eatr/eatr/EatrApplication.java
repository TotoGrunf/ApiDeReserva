package com.eatr.eatr;

import com.eatr.eatr.models.Restaurante;
import com.eatr.eatr.models.Usuario;
import com.eatr.eatr.repositories.ReservaRepository;
import com.eatr.eatr.repositories.RestauranteRepository;
import com.eatr.eatr.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDateTime;

@SpringBootApplication
public class EatrApplication {

	@Autowired
	private PasswordEncoder passwordEncoder;

	public static void main(String[] args) {
		SpringApplication.run(EatrApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ReservaRepository reservaRepository, UsuarioRepository usuarioRepository,
									   RestauranteRepository restauranteRepository){
		return(args) -> {

			Usuario usuario1 = new Usuario("GuillerminaGiovanelli", "3364495984", true);
			Usuario usuario2 = new Usuario("Franck Francis", "55533344422", true);

			Restaurante restaurante = new Restaurante("El Irlandes Cocinante","elirlandes@gmail.com", passwordEncoder.encode("resto4321"),
					"Calle Falsa 123",30,LocalDateTime.now());









			usuarioRepository.save(usuario1);
			usuarioRepository.save(usuario2);

			restauranteRepository.save(restaurante);
 		};
	}

}








