package com.ejemplo.examen.service;

import com.ejemplo.examen.entity.ordenes;
import com.ejemplo.examen.repository.ordenesRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ordenesService {
	@Autowired
	private ordenesRepository ordenesRepository;
	
	public ordenes createOrdenes(ordenes ordenes) {
		
		return ordenesRepository.save(ordenes);
	}
	
	public ordenes getOrdenesById(Long orden_id) {
		Optional<ordenes> optionalOrdenes = ordenesRepository.findById(orden_id);
		
		return optionalOrdenes.get();
	}
	
	public List<ordenes> getAllOrdenes() {
		return ordenesRepository.findAll();
	}
	
	public void deleteOrdenes(Long orden_id) {
		ordenesRepository.deleteById(orden_id);
	}
}
