package com.eatr.eatr.repositories;

import com.eatr.eatr.models.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ReservaRepository extends JpaRepository<Reserva, Long> {
    Reserva findById(long id);
}
