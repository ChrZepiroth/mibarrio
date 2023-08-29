package com.mibarrio.api.DTO;

import lombok.Data;

@Data
public class ProductoDTO {
    private Integer id;
    private String nombre_producto;
    private String descripcion;
    private Float precio;
    private String imagen;
    private Integer idCategoriaProducto;
    private Integer idUnidadMedida;
}
