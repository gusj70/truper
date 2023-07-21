package com.ejemplo.examen.repository;

import com.ejemplo.examen.entity.sucursales;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface sucursalesRepository extends JpaRepository<sucursales, Long> {

}
