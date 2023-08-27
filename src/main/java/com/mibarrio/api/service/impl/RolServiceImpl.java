package com.mibarrio.api.service.impl;

import com.mibarrio.api.entity.Rol;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.RolRepository;
import com.mibarrio.api.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class RolServiceImpl extends CRUDImpl<Rol, Integer> implements RolService {

    @Autowired
    private RolRepository repository;


    @Override
    protected GenericRepository<Rol, Integer> getRepository() {
        return repository;
    }
}

