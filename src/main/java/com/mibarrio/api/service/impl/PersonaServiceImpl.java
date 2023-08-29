package com.mibarrio.api.service.impl;

import com.mibarrio.api.DTO.PersonaDTO;
import com.mibarrio.api.entity.Persona;
import com.mibarrio.api.exceptions.BusinessException;
import com.mibarrio.api.mapper.PersonaMapper;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.PersonaRepository;
import com.mibarrio.api.service.PersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PersonaServiceImpl extends CRUDImpl<Persona, String> implements PersonaService {


    @Autowired
    private PersonaMapper mapper;

    @Autowired
    private PersonaRepository repository;


    protected GenericRepository<Persona, String> getRepository(){
        return repository;
    }


    @Override
    public PersonaDTO registerDto(PersonaDTO persona) {
        Optional<Persona> per = getRepository().findById(persona.getId());
        if(per.isPresent()){
            return new PersonaDTO();
        } else {
            return mapper.toDto(getRepository().save(mapper.toEntity(persona)));
        }
    }

    @Override
    public List<Persona> getUserByRol(Integer roles) {
        return (List<Persona>) repository.findUserByRol(roles);
    }

}

