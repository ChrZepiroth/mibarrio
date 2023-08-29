package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prd_codi")
    private Integer id;
    @Column(name = "prd_name")
    private String nombre_producto;
    @Column(name = "prd_descripcion")
    private String descripcion;
    @Column(name = "prd_precio")
    private Float precio;
    @Column(name = "prd_imagen")
    private String imagen;
    @ManyToOne
    @JoinColumn(name = "prd_cat_codi", referencedColumnName = "cat_codi")
    private CategoriaProducto categoriaProducto;
    @ManyToOne
    @JoinColumn(name = "prd_uni_codi", referencedColumnName = "uni_codi")
    private UnidadMedida unidadMedida;

}
