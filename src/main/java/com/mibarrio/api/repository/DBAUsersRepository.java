package com.mibarrio.api.repository;


import com.mibarrio.api.DTO.DBAUsersDTO;
import com.mibarrio.api.entity.DBAUsers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DBAUsersRepository extends GenericRepository<DBAUsers, Integer> {

    @Query(value = "SELECT * FROM dba_users d WHERE d.dba_usuario = :user and d.dbs_contrasena = :pass",
            nativeQuery = true)
    List<DBAUsers> findUserAndPass(@Param("user") String user,
                                      @Param("pass") String pass);


    @Query(value = "SELECT * FROM dba_users d WHERE d.dba_usuario = :user",
            nativeQuery = true)
    DBAUsers findUser(@Param("user") String user);

    @Query(value = "SELECT * FROM dba_users d WHERE d.dba_per_num_iden = :per",
            nativeQuery = true)
    List<DBAUsers> findByPersona(@Param("per") String per);
}
