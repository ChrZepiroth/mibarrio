package com.mibarrio.api.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tiendas")
public class Tienda {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tie_codi")
    private Integer id;
    @Column(name = "tie_address")
    private String address;
    @Column(name = "tie_phone")
    private String phone;
    @ManyToOne
    @JoinColumn(name = "tie_per_num_iden", referencedColumnName = "per_num_iden")
    private Persona persona;
    @ManyToOne
    @JoinColumn(name = "tie_ciu_codi", referencedColumnName = "ciu_codi")
    private Ciudad ciudad;


}
