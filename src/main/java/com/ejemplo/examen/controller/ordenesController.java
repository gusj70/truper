package com.ejemplo.examen.controller;

import com.ejemplo.examen.service.ordenesService;
import com.ejemplo.examen.entity.ordenes;

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
@RequestMapping("api/ordenes")
public class ordenesController {
	@Autowired
	private ordenesService ordenesService;
	
	@PostMapping
	public ordenes createOrdenes(@RequestBody ordenes ordenes) {
		return ordenesService.createOrdenes(ordenes);
	}
	
	@GetMapping
	public List<ordenes> getAllOrdenes() {
		return ordenesService.getAllOrdenes();
	}
	
	@GetMapping("{id}")
	public ordenes searchOrdenesById(@PathVariable("{id}") Long orden_id) {
		return ordenesService.getOrdenesById(orden_id);
	}
	
	@DeleteMapping("{id}")
	public void deleteOrdenesById(@PathVariable("{id}") Long orden_id) {
		ordenesService.deleteOrdenes(orden_id);
	}
}
