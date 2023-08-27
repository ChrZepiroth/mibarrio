package com.mibarrio.api.mapper;

import com.mibarrio.api.DTO.CiudadDTO;
import com.mibarrio.api.entity.Ciudad;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CiudadMapper extends GenericMapper<Ciudad, CiudadDTO>{

}

