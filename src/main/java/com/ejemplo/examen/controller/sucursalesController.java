package com.ejemplo.examen.controller;

import com.ejemplo.examen.service.sucursalesService;
import com.ejemplo.examen.entity.sucursales;

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
@RequestMapping("api/sucursales")
public class sucursalesController {
	@Autowired
	private sucursalesService sucursalesService;
	
	@PostMapping
	public sucursales createSucursales(@RequestBody sucursales sucursales) {
		return sucursalesService.createSucursales(sucursales);
	}
	
	@GetMapping
	public List<sucursales> getAllSucursales() {
		return sucursalesService.getAllSucursales();
	}
	
	@GetMapping("{id}")
	public sucursales searchSucursalesById(@PathVariable("{id}") Long sucursal_id) {
		return sucursalesService.getSucursalesById(sucursal_id);
	}

	@DeleteMapping("{id}")
	public void deleteSucursalesById(@PathVariable("{id}") Long orden_id) {
		sucursalesService.deleteSucursales(orden_id);
	}
}
