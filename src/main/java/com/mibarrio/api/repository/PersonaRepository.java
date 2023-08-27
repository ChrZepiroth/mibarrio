package com.mibarrio.api.repository;


import com.mibarrio.api.entity.Persona;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface PersonaRepository extends GenericRepository<Persona, String> {

    @Query(value ="SELECT * FROM personas p WHERE p.per_rol = :roles",
            nativeQuery = true)
    List<Persona> findUserByRol(@Param("roles") Integer roles);

}
