package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Roles")
public class Rol {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rol_consecutivo")
    private Integer id;

    @Column(name = "rol_descripcion", length = 25)
    private String descripcion;

}
