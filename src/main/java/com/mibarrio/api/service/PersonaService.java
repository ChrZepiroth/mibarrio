package com.mibarrio.api.service;



import com.mibarrio.api.DTO.PersonaDTO;
import com.mibarrio.api.entity.Persona;
import org.springframework.stereotype.Service;

import java.util.List;


public interface PersonaService extends CRUD<Persona, String> {

    PersonaDTO registerDto(PersonaDTO persona);

    List<Persona> getUserByRol(Integer roles);

}

