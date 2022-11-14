package com.eatr.eatr.repositories;

import com.eatr.eatr.models.Restaurante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface RestauranteRepository extends JpaRepository<Restaurante, Long> {
    Restaurante findById(long id);

    Restaurante findByEmail(String email);
}
