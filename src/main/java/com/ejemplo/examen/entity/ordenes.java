package com.ejemplo.examen.entity;

import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name="ordenes")
public class ordenes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orden_id;
	private Long sucursal_id;
	private Date fecha;
	private double total;
	
	
	public Long getOrden_id() {
		return orden_id;
	}
	public void setOrden_id(Long orden_id) {
		this.orden_id = orden_id;
	}
	public Long getSucursal_id() {
		return sucursal_id;
	}
	public void setSucursal_id(Long sucursal_id) {
		this.sucursal_id = sucursal_id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
}
