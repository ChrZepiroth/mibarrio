package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;

@Data
@Entity
@Table(name = "DBA_users")
public class DBAUsers {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "dba_id")
    private Integer id;

    @Column(name = "dba_usuario")
    private String usuario;

    @Column(name = "dbs_contrasena")
    private String pass;

    @Column(name = "dba_fecha_login")
    private Timestamp fecha_login;

    @OneToOne
    @JoinColumn(name = "dba_per_num_iden", referencedColumnName = "per_num_iden")
    private Persona persona;
}
