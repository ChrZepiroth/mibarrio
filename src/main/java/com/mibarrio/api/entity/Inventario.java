package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "inventarios")
public class Inventario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "inv_consecutivo")
    private Integer id;

    @Column(name = "inv_stock")
    private Integer stock;

    @ManyToOne
    @JoinColumn(name = "inv_tie_codi", referencedColumnName = "tie_codi")
    private Tienda tienda;

    @ManyToOne
    @JoinColumn(name = "inv_prd_codi", referencedColumnName = "prd_codi")
    private Producto producto;
}
