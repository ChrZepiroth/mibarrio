package com.mibarrio.api.service.impl;


import com.mibarrio.api.DTO.InventarioDTO;
import com.mibarrio.api.entity.Inventario;
import com.mibarrio.api.mapper.InventarioMapper;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.InventarioRepository;
import com.mibarrio.api.service.InventarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class InventarioServiceImpl extends CRUDImpl<Inventario, Integer> implements InventarioService {


    @Autowired
    private InventarioMapper mapper;

    @Autowired
    private InventarioRepository repository;


    protected GenericRepository<Inventario, Integer> getRepository(){
        return repository;
    }


    @Override
    public InventarioDTO registerDto(InventarioDTO dto) {
            return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
    }

    @Override
    public List<Inventario> getInventarioByTienda(Integer tienda) {
        return (List<Inventario>) repository.findInventarioByTienda(tienda);
    }

}

