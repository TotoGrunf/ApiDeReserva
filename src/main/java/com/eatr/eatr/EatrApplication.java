package com.eatr.eatr;

import com.eatr.eatr.models.Reserva;
import com.eatr.eatr.models.Usuario;
import com.eatr.eatr.repositories.ReservaRepository;
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
	public CommandLineRunner initData(ReservaRepository reservaRepository){
		return(args) -> {
			Reserva reserva1 = new Reserva(1,"mesa12", LocalDateTime.now(),1);
			Usuario usario1 = new Usuario(1, "GuillerminaGiovanelli", "3364495984", true);
			reservaRepository.save(reserva1);
 	};
	}

}








