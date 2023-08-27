package com.mibarrio.api.service.impl;


import com.mibarrio.api.entity.CategoriaProducto;
import com.mibarrio.api.repository.CategoriaProductoRepository;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.service.CategoriaProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaProductoServiceImpl extends CRUDImpl<CategoriaProducto, Integer> implements CategoriaProductoService {

    @Autowired
    private CategoriaProductoRepository repository;


    @Override
    protected GenericRepository<CategoriaProducto, Integer> getRepository() {
        return repository;
    }
}

