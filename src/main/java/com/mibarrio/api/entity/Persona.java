package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "personas")
public class Persona {
    @Id
    @Column(name = "per_num_iden")
    private String id;
    @Column(name = "per_tid_codi")
    private String tid;
    @Column(name = "per_nombre")
    private String nombre;
    @Column(name = "per_apellido")
    private String apellido;
    @Column(name = "per_razon_social")
    private String razonSocial;
    @Column(name = "per_tipo")
    private String tipoPersona;
    @Column(name = "per_correo")
    private String correo;
    @Column(name = "per_telefono")
    private String telefono;
    @Column(name = "per_direccion")
    private String direccion;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "per_rol", referencedColumnName = "rol_consecutivo")
    private Rol rol;

}
