package com.cibertec.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Habitaciones")
public class Habitacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idhabitacion")
    private int idHabitacion;

    @Column(name = "numero", length = 4)
    private String numero;

    @Column(name = "piso", length = 2)
    private String piso;

    @Column(name = "descripcion", length = 512)
    private String descripcion;

    @Column(name = "caracteristicas", length = 512)
    private String caracteristicas;

    @Column(name = "precio_diario", precision = 7, scale = 2)
    private BigDecimal precioDiario;

    @Column(name = "estado", length = 15)
    private String estado;

    @Column(name = "tipo_habitacion", length = 20)
    private String tipoHabitacion;

    
    //METODO GETTERS Y SETTERS
	public int getIdHabitacion() {
		return idHabitacion;
	}

	public void setIdHabitacion(int idHabitacion) {
		this.idHabitacion = idHabitacion;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getPiso() {
		return piso;
	}

	public void setPiso(String piso) {
		this.piso = piso;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getCaracteristicas() {
		return caracteristicas;
	}

	public void setCaracteristicas(String caracteristicas) {
		this.caracteristicas = caracteristicas;
	}

	public BigDecimal getPrecioDiario() {
		return precioDiario;
	}

	public void setPrecioDiario(BigDecimal precioDiario) {
		this.precioDiario = precioDiario;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getTipoHabitacion() {
		return tipoHabitacion;
	}

	public void setTipoHabitacion(String tipoHabitacion) {
		this.tipoHabitacion = tipoHabitacion;
	}

	//METODO TOSTRING
	@Override
	public String toString() {
		return "Habitacion [idHabitacion=" + idHabitacion + ", numero=" + numero + ", piso=" + piso + ", descripcion="
				+ descripcion + ", caracteristicas=" + caracteristicas + ", precioDiario=" + precioDiario + ", estado="
				+ estado + ", tipoHabitacion=" + tipoHabitacion + "]";
	}

	//CONSTRUCTOR
	public Habitacion(int idHabitacion, String numero, String piso, String descripcion, String caracteristicas,
			BigDecimal precioDiario, String estado, String tipoHabitacion) {
		super();
		this.idHabitacion = idHabitacion;
		this.numero = numero;
		this.piso = piso;
		this.descripcion = descripcion;
		this.caracteristicas = caracteristicas;
		this.precioDiario = precioDiario;
		this.estado = estado;
		this.tipoHabitacion = tipoHabitacion;
	}

	//CONSTRUCTOR VACIO
	public Habitacion() {
		super();
	}
    
	
    
}
