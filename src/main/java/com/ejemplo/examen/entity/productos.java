package com.ejemplo.examen.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name="productos")
public class productos {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long producto_id;
	private Long orden_id;
	private String codigo;
	private String descripcion;
	private double precio;
	
	
	public Long getProducto_id() {
		return producto_id;
	}
	public void setProducto_id(Long producto_id) {
		this.producto_id = producto_id;
	}
	public Long getOrden_id() {
		return orden_id;
	}
	public void setOrden_id(Long orden_id) {
		this.orden_id = orden_id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
}
