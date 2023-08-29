package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="ciudad")
public class Ciudad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ciu_codi")
    private Integer id;
    @Column(name="ciu_descripcion", length = 25)
    private String descripcion;

}
