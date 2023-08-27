package com.mibarrio.api.repository;


import com.mibarrio.api.entity.DBAUsers;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DBAUsersRepository extends GenericRepository<DBAUsers, Integer> {

    @Query(value ="SELECT * FROM dba_users d WHERE d.dba_usuario = :user and d.dbs_contrasena = :pass",
            nativeQuery = true)
    List<DBAUsers> findUserByLogin(@Param("user") String user,
                                    @Param("pass") String pass);
}
