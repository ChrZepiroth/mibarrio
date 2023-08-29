package com.mibarrio.api.DTO;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import java.time.LocalDateTime;


@Data
public class DBAUsersDTO {
    private Integer id;
    private String usuario;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime fechaLogin;
    private String idPer;
}
