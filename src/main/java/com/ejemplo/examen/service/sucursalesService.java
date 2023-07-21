package com.ejemplo.examen.service;

import com.ejemplo.examen.entity.sucursales;
import com.ejemplo.examen.repository.sucursalesRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class sucursalesService {
	@Autowired
	private sucursalesRepository sucursalesRepository;
	
	public sucursales createSucursales(sucursales sucursales) {
		
		return sucursalesRepository.save(sucursales);
	}
	
	public sucursales getSucursalesById(Long sucursal_id) {
		Optional<sucursales> optionalSucursales = sucursalesRepository.findById(sucursal_id);
		
		return optionalSucursales.get();
	}
	
	public List<sucursales> getAllSucursales() {
		return sucursalesRepository.findAll();
	}
	
	public void deleteSucursales(Long sucursal_id) {
		sucursalesRepository.deleteById(sucursal_id);
	}
}
