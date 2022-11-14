package com.eatr.eatr;

import com.eatr.eatr.models.Reserva;
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
			Usuario usuario3 = new Usuario("cacho castaña", "55532344422", false);

			Restaurante restaurante = new Restaurante("El Irlandes Cocinante","elirlandes@gmail.com", passwordEncoder.encode("resto4321"),
					"Calle Falsa 123",30,LocalDateTime.now());

			Reserva reserva1 = new Reserva("21", LocalDateTime.now(), usuario1, 4, true,restaurante);
			Reserva reserva2 = new Reserva("15", LocalDateTime.now(), usuario2, 2, true,restaurante);
			Reserva reserva3 = new Reserva("5", LocalDateTime.now(), usuario3, 10, false,restaurante);


			restauranteRepository.save(restaurante);
			reservaRepository.save(reserva1);
			reservaRepository.save(reserva2);
			reservaRepository.save(reserva3);

			usuarioRepository.save(usuario1);
			usuarioRepository.save(usuario2);
			usuarioRepository.save(usuario3);


 		};
	}

}








