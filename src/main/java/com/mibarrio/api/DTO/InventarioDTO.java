package com.mibarrio.api.DTO;

import lombok.Data;

@Data
public class InventarioDTO {
    private Integer id;
    private Integer stock;
    private Integer idTienda;
    private Integer idProducto;
}
