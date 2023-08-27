package com.mibarrio.api.mapper;


import com.mibarrio.api.DTO.DBAUsersDTO;
import com.mibarrio.api.DTO.PersonaDTO;
import com.mibarrio.api.entity.DBAUsers;
import com.mibarrio.api.entity.Persona;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

@Mapper(componentModel = "spring", uses = {PersonaMapper.class})
public interface DBAUsersMapper extends GenericMapper<DBAUsers, DBAUsersDTO>{
    @Override
    @Mappings({
            @Mapping(source = "persona", target = "persona.id")
    })
    DBAUsers toEntity(DBAUsersDTO dto);

    @Override
    @Mappings({
            @Mapping(source = "persona.id", target = "persona")
    })
    DBAUsersDTO toDto(DBAUsers entity);

}