package com.ejemplo.examen.repository;

import com.ejemplo.examen.entity.ordenes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ordenesRepository extends JpaRepository<ordenes, Long> {

}
