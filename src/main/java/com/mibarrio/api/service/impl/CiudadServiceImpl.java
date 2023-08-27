package com.mibarrio.api.service.impl;

import com.mibarrio.api.entity.Ciudad;
import com.mibarrio.api.repository.CiudadRepository;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.service.CiudadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CiudadServiceImpl extends CRUDImpl<Ciudad, Integer> implements CiudadService {

    @Autowired
    private CiudadRepository repository;


    @Override
    protected GenericRepository<Ciudad, Integer> getRepository() {
        return repository;
    }
}

