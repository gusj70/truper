package com.ejemplo.examen.controller;

import com.ejemplo.examen.service.productosService;
import com.ejemplo.examen.entity.productos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/productos")
public class productosController {
	@Autowired
	private productosService productosService;
	
	@PostMapping
	public productos createProductos(@RequestBody productos productos) {
		return productosService.createProductos(productos);
	}
	
	@GetMapping
	public List<productos> getAllProductos() {
		return productosService.getAllProductos();
	}
	
	@GetMapping("{id}")
	public productos searchProductosById(@PathVariable("{id}") Long producto_id) {
		return productosService.getProductosById(producto_id);
	}
	
	@DeleteMapping("{id}")
	public void deleteProductosById(@PathVariable("{id}") Long orden_id) {
		productosService.deleteProductos(orden_id);
	}
}
