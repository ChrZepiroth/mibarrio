package com.mibarrio.api.service;


import com.mibarrio.api.DTO.DBAUsersDTO;
import com.mibarrio.api.entity.DBAUsers;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface DBAUsersService extends CRUD<DBAUsers, Integer> {

    DBAUsersDTO registerDto(DBAUsersDTO dto);

    List<DBAUsers> findByUserAndPass(String user,
                                     String pass);


    DBAUsers findUser(String user);

    List<DBAUsers> findByPersona(String persona);

}

