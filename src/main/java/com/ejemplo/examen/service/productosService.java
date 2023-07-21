package com.ejemplo.examen.service;

import com.ejemplo.examen.entity.productos;
import com.ejemplo.examen.repository.productosRepository;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class productosService {
	@Autowired
	private productosRepository productosRepository;
	
	public productos createProductos(productos productos) {
		
		return productosRepository.save(productos);
	}
	
	public productos getProductosById(Long producto_id) {
		Optional<productos> optionalProductos = productosRepository.findById(producto_id);
		
		return optionalProductos.get();
	}
	
	public List<productos> getAllProductos() {
		return productosRepository.findAll();
	}
	
	public void deleteProductos(Long producto_id) {
		productosRepository.deleteById(producto_id);
	}
}
