package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @Column(name = "per_num_iden", length = 20, unique = true)
    private String id;
    @Column(name = "per_tid_codi", length = 5)
    private String tid;
    @Column(name = "per_nombre", length = 25)
    private String nombre;
    @Column(name = "per_apellido", length = 25)
    private String apellido;
    @Column(name = "per_razon_social", length = 25)
    private String razonSocial;
    @Column(name = "per_tipo", length = 10)
    private String tipoPersona;
    @Column(name = "per_correo", length = 25)
    private String correo;
    @Column(name = "per_telefono", length = 25)
    private String telefono;
    @Column(name = "per_direccion", length = 25)
    private String direccion;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "per_rol", referencedColumnName = "rol_consecutivo")
    private Rol rol;

}
