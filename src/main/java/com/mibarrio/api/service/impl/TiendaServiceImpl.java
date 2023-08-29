package com.mibarrio.api.service.impl;

import com.mibarrio.api.DTO.TiendaDTO;
import com.mibarrio.api.entity.Tienda;
import com.mibarrio.api.mapper.TiendaMapper;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.TiendaRepository;
import com.mibarrio.api.service.TiendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TiendaServiceImpl extends CRUDImpl<Tienda, Integer> implements TiendaService {


    @Autowired
    private TiendaMapper mapper;

    @Autowired
    private TiendaRepository repository;


    protected GenericRepository<Tienda, Integer> getRepository(){
        return repository;
    }


    @Override
    public TiendaDTO registerDto(TiendaDTO tiendaDTO) {
            return mapper.toDto(getRepository().save(mapper.toEntity(tiendaDTO)));
    }

}

