package com.eatr.eatr;

import com.eatr.eatr.models.ListaReservas;
import com.eatr.eatr.models.Reserva;
import com.eatr.eatr.models.Usuario;
import com.eatr.eatr.repositories.ListaReservasRepository;
import com.eatr.eatr.repositories.ReservaRepository;
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
	public CommandLineRunner initData(ReservaRepository reservaRepository, UsuarioRepository usuarioRepository, ListaReservasRepository listaReservasRepository){
		return(args) -> {


			Usuario usuario1 = new Usuario("GuillerminaGiovanelli", "3364495984", true);

			Reserva reserva1 = new Reserva("mesa12", LocalDateTime.now(),usuario1);

			reservaRepository.save(reserva1);

			ListaReservas listaReservas1 = new ListaReservas(3,true,LocalDateTime.now(),"mesa2", reserva1);

			listaReservas1.addReserva(reserva1);



			usuarioRepository.save(usuario1);
			listaReservasRepository.save(listaReservas1);
 	};
	}

}








