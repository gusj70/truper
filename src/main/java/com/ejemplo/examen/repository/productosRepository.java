package com.ejemplo.examen.repository;

import com.ejemplo.examen.entity.productos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface productosRepository extends JpaRepository<productos, Long> {

}
