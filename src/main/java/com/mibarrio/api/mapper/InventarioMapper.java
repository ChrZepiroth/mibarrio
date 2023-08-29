package com.mibarrio.api.mapper;

import com.mibarrio.api.DTO.InventarioDTO;
import com.mibarrio.api.entity.Inventario;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface InventarioMapper extends GenericMapper<Inventario, InventarioDTO>{
    @Override
    @Mappings({
            @Mapping(source = "idTienda", target = "tienda.id"),
            @Mapping(source = "idProducto", target = "producto.id")
    })
    Inventario toEntity(InventarioDTO dto);

    @Override
    @Mappings({
            @Mapping(source = "tienda.id", target = "idTienda"),
            @Mapping(source = "producto.id", target = "idProducto")
    })
    InventarioDTO toDto(Inventario entity);
}

