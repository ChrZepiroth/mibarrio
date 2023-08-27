package com.mibarrio.api.DTO;



import lombok.Data;

@Data
public class PersonaDTO {
    private String id;
    private String tid;
    private String nombre;
    private String apellido;
    private String razon_social;
    private String tipo_persona;
    private String correo;
    private String telefono;
    private String direccion;
    private Integer rol;

}
