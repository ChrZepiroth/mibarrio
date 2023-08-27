package com.mibarrio.api.service.impl;

import com.mibarrio.api.DTO.PersonaDTO;
import com.mibarrio.api.entity.Persona;
import com.mibarrio.api.exceptions.ModeloNotFoundExeption;
import com.mibarrio.api.mapper.GenericMapper;
import com.mibarrio.api.mapper.PersonaMapper;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.PersonaRepository;
import com.mibarrio.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, String> implements PersonaService {

    @Autowired
    private PersonaRepository repository;

    protected GenericRepository<Persona, String> getRepository(){
        return repository;
    }

    /*private GenericMapper<Persona, String> mapper;*/
    private PersonaMapper mapper;


    @Override
    public PersonaDTO registerDto(PersonaDTO persona) {
        return mapper.toDto(repository.save(mapper.toEntity(persona)));
    }

    @Override
    public List<Persona> getUserByRol(Integer roles) {
        return (List<Persona>) repository.findUserByRol(roles);
    }

}

