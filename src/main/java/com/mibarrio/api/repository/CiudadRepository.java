package com.mibarrio.api.repository;

import com.mibarrio.api.entity.Ciudad;
import org.springframework.stereotype.Repository;

@Repository
public interface CiudadRepository extends GenericRepository<Ciudad, Integer> {
}
