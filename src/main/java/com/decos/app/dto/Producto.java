package com.decos.app.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Producto {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private long id;
	
	private String nombre;
	private Double precio;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Double getPrecio() {
		return precio;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Product [id=" + id 
				+ ", name=" + nombre 
				+ ", price=" + precio 
				+ "]";// +  "   <a href='/deleteProduct/"+ id + "'>delete</a>";
	}
	
}
