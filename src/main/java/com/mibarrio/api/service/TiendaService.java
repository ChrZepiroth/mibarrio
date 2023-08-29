package com.mibarrio.api.service;


import com.mibarrio.api.DTO.TiendaDTO;
import com.mibarrio.api.entity.Tienda;


public interface TiendaService extends CRUD<Tienda, Integer> {

    TiendaDTO registerDto(TiendaDTO tiendaDTO);


}

