package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="categoria_productos")
public class CategoriaProducto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="cat_codi")
    private Integer id;
    @Column(name="cat_descripcion", length = 25)
    private String descripcion;

}
