package com.mibarrio.api.mapper;


import com.mibarrio.api.DTO.CategoriaProductoDTO;
import com.mibarrio.api.entity.CategoriaProducto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategoriaProductoMapper extends GenericMapper<CategoriaProducto, CategoriaProductoDTO>{

}

