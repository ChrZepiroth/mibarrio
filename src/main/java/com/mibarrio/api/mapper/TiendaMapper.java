package com.mibarrio.api.mapper;



import com.mibarrio.api.DTO.TiendaDTO;
import com.mibarrio.api.entity.Tienda;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;


@Mapper(componentModel = "spring")
public interface TiendaMapper extends GenericMapper<Tienda, TiendaDTO>{
    @Override
    @Mappings({
            @Mapping(source = "admin", target = "persona.id"),
            @Mapping(source = "idCiudad", target = "ciudad.id")
    })
    Tienda toEntity(TiendaDTO dto);

    @Override
    @Mappings({
            @Mapping(source = "persona.id", target = "admin"),
            @Mapping(source = "ciudad.id", target = "idCiudad")
    })
    TiendaDTO toDto(Tienda entity);

}
