package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "unidad_medida")
public class UnidadMedida {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "uni_codi")
    private Integer id;
    @Column(name = "uni_descripcion")
    private String descripcion;

}
