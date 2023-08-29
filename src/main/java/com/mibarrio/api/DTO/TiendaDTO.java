package com.mibarrio.api.DTO;

import lombok.Data;

@Data
public class TiendaDTO {
    private Integer id;
    private String address;
    private String phone;
    private String admin;
    private Integer idCiudad;
}
