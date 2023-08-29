package com.mibarrio.api.DTO;


import lombok.Data;

import java.sql.Timestamp;

@Data
public class DBAUsersDTO {

    private Integer id;
    private String usuario;
    private Timestamp fechaLogin;
    private String idPer;
}
