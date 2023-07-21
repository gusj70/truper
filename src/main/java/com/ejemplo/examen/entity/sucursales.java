package com.ejemplo.examen.entity;

import javax.persistence.*;

@Entity
@Table(name="sucursales")
public class sucursales {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long sucursal_id;
	private String nombre;
	
	
	public Long getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(Long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
