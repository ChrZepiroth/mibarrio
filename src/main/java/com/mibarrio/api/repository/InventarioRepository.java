package com.mibarrio.api.repository;

import com.mibarrio.api.entity.Inventario;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InventarioRepository extends GenericRepository<Inventario, Integer> {

    @Query(value ="SELECT * FROM inventarios i WHERE i.inv_tie_codi = :tienda",
            nativeQuery = true)
    List<Inventario> findInventarioByTienda(@Param("tienda") Integer tienda);
}
