package com.mibarrio.api.service.impl;


import com.mibarrio.api.entity.UnidadMedida;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.UnidadMedidaRepository;
import com.mibarrio.api.service.UnidadMedidaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UnidadMedidaServiceImpl extends CRUDImpl<UnidadMedida, Integer> implements UnidadMedidaService {

    @Autowired
    private UnidadMedidaRepository repository;


    @Override
    protected GenericRepository<UnidadMedida, Integer> getRepository() {
        return repository;
    }
}

