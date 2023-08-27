package com.mibarrio.api.mapper;


import com.mibarrio.api.DTO.PersonaDTO;
import com.mibarrio.api.entity.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {RolMapper.class})
public interface PersonaMapper extends GenericMapper<Persona, PersonaDTO>{
    @Override
    @Mappings({
            @Mapping(source = "rol", target = "rol.id")
    })
    Persona toEntity(PersonaDTO dto);

    @Override
    @Mappings({
            @Mapping(source = "rol.id", target = "rol")
    })
    PersonaDTO toDto(Persona entity);

}
