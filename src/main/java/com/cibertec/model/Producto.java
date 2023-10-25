package com.cibertec.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idProducto")
    private int idProducto;
    
    @Column(name = "nombre", length = 255, nullable = false)
    private String nombre;
    
    @Column(name = "descripcion", length = 255, nullable = false)
    private String descripcion;
    
    @Column(name = "unidad_medida", length = 20)
    private String unidadMedida;
    
    @Column(name = "precio", precision = 10, scale = 2)
    private BigDecimal precio;
    
    //METODO GETTERS Y SETTERS

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getUnidadMedida() {
		return unidadMedida;
	}

	public void setUnidadMedida(String unidadMedida) {
		this.unidadMedida = unidadMedida;
	}

	public BigDecimal getPrecio() {
		return precio;
	}

	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}

	//METODO TOSTRING
	
	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", unidadMedida=" + unidadMedida + ", precio=" + precio + "]";
	}

	//CONSTRUCTOR
	public Producto(int idProducto, String nombre, String descripcion, String unidadMedida, BigDecimal precio) {
		super();
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.unidadMedida = unidadMedida;
		this.precio = precio;
	}

	//CONSTRUCCTOR VACIO
	
	public Producto() {
		super();
	}
    
	
    
}
