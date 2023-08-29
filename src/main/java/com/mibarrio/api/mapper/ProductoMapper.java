package com.mibarrio.api.mapper;

import com.mibarrio.api.DTO.ProductoDTO;
import com.mibarrio.api.entity.Producto;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface ProductoMapper extends GenericMapper<Producto, ProductoDTO>{
    @Override
    @Mappings({
            @Mapping(source = "idCategoriaProducto", target = "categoriaProducto.id"),
            @Mapping(source = "idUnidadMedida", target = "unidadMedida.id")
    })
    Producto toEntity(ProductoDTO dto);

    @Override
    @Mappings({
            @Mapping(source = "categoriaProducto.id", target = "idCategoriaProducto"),
            @Mapping(source = "unidadMedida.id", target = "idUnidadMedida")
    })
    ProductoDTO toDto(Producto entity);
}

