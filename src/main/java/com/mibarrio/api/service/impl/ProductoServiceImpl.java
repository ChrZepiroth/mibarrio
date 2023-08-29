package com.mibarrio.api.service.impl;


import com.mibarrio.api.DTO.ProductoDTO;
import com.mibarrio.api.entity.Producto;
import com.mibarrio.api.mapper.ProductoMapper;
import com.mibarrio.api.repository.GenericRepository;
import com.mibarrio.api.repository.ProductoRepository;
import com.mibarrio.api.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements ProductoService {


    @Autowired
    private ProductoMapper mapper;

    @Autowired
    private ProductoRepository repository;


    protected GenericRepository<Producto, Integer> getRepository(){
        return repository;
    }


    @Override
    public ProductoDTO registerDto(ProductoDTO dto) {
            return mapper.toDto(getRepository().save(mapper.toEntity(dto)));
    }

}

