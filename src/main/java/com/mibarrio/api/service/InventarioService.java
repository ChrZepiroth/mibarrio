package com.mibarrio.api.service;


import com.mibarrio.api.DTO.InventarioDTO;
import com.mibarrio.api.entity.Inventario;

import java.util.List;

public interface InventarioService extends CRUD<Inventario, Integer> {

    InventarioDTO registerDto(InventarioDTO dto);


    List<Inventario> getInventarioByTienda(Integer tienda);
}

