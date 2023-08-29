package com.mibarrio.api.service;


import com.mibarrio.api.DTO.ProductoDTO;
import com.mibarrio.api.DTO.TiendaDTO;
import com.mibarrio.api.entity.Producto;
import com.mibarrio.api.entity.Tienda;


public interface ProductoService extends CRUD<Producto, Integer> {

    ProductoDTO registerDto(ProductoDTO dto);


}

