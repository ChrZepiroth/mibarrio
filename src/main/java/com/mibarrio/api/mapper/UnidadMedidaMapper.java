package com.mibarrio.api.mapper;


import com.mibarrio.api.DTO.UnidadMedidaDTO;
import com.mibarrio.api.entity.UnidadMedida;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UnidadMedidaMapper extends GenericMapper<UnidadMedida, UnidadMedidaDTO>{

}

