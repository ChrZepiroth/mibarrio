package com.mibarrio.api.DTO;

import jakarta.persistence.*;
import lombok.Data;

@Data
public class CategoriaProductoDTO {

    private Integer id;
    private String descripcion;

}
