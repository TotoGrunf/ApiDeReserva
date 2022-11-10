package com.eatr.eatr.repositories;

import com.eatr.eatr.models.ListaReservas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ListaReservasRepository extends JpaRepository<ListaReservas, Long> {
    ListaReservas findById(long id);
}
