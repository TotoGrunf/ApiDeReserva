package com.eatr.eatr.repositories;

import com.eatr.eatr.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    Usuario findById(long id);
}
