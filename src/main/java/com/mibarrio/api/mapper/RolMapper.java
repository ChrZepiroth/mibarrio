package com.mibarrio.api.mapper;

import com.mibarrio.api.DTO.RolDTO;
import com.mibarrio.api.entity.Rol;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring")
public interface RolMapper extends GenericMapper<Rol, RolDTO>{

    @Override
    @Mappings({
            @Mapping(source = "id", target = "id"),
            @Mapping(source = "descripcion", target = "descripcion")
    })
    RolDTO toDto(Rol entity);

}

