package com.eatr.eatr;

import com.eatr.eatr.models.ListaReservas;
import com.eatr.eatr.models.Reserva;
import com.eatr.eatr.models.Restaurante;
import com.eatr.eatr.models.Usuario;
import com.eatr.eatr.repositories.ListaReservasRepository;
import com.eatr.eatr.repositories.ReservaRepository;
import com.eatr.eatr.repositories.RestauranteRepository;
import com.eatr.eatr.repositories.UsuarioRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class EatrApplication {

	public static void main(String[] args) {
		SpringApplication.run(EatrApplication.class, args);
	}

	@Bean
	public CommandLineRunner initData(ReservaRepository reservaRepository, UsuarioRepository usuarioRepository,
									  ListaReservasRepository listaReservasRepository, RestauranteRepository restauranteRepository){
		return(args) -> {

			Usuario usuario1 = new Usuario("GuillerminaGiovanelli", "3364495984", true);
			Usuario usuario2 = new Usuario("Franck Francis", "55533344422", true);

			ListaReservas listaReservas1 = new ListaReservas(true,LocalDateTime.now());

			Reserva reserva1 = new Reserva("mesa12", LocalDateTime.now(),usuario1,3,listaReservas1);
			Reserva reserva2 = new Reserva("mesa10", LocalDateTime.now(),usuario2,4,listaReservas1);

			Restaurante restaurante = new Restaurante("El Irlandes Cocinante","elirlandes@gmail.com","resto4321",
					"Calle Falsa 123",30,LocalDateTime.now(),listaReservas1);


			listaReservasRepository.save(listaReservas1);
			reservaRepository.save(reserva1);
			reservaRepository.save(reserva2);

			usuarioRepository.save(usuario1);
			usuarioRepository.save(usuario2);

			restauranteRepository.save(restaurante);
 		};
	}

}








