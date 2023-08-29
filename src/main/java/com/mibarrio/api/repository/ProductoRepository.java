package com.mibarrio.api.repository;

import com.mibarrio.api.entity.Producto;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends GenericRepository<Producto, Integer> {
}
