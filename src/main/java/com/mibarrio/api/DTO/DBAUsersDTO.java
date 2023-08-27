package com.mibarrio.api.DTO;


import com.mibarrio.api.entity.Persona;
import lombok.Data;

import java.sql.Timestamp;

@Data
public class DBAUsersDTO {

    private Integer id;
    private String usuario;
    private String pass;
    private Timestamp fecha_login;
    private Persona persona;
}
