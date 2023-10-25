package com.cibertec.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Trabajadores")
public class Trabajador {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idTrabajador")
    private int idTrabajador;

    @OneToOne
    @JoinColumn(name = "idpersona")
    private Persona persona;

    @Column(precision = 7, scale = 2)
    private BigDecimal sueldo;

    @Column(length = 1)
    private String estado;
    
    //metodo getters y setters

	public int getIdTrabajador() {
		return idTrabajador;
	}

	public void setIdTrabajador(int idTrabajador) {
		this.idTrabajador = idTrabajador;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public BigDecimal getSueldo() {
		return sueldo;
	}

	public void setSueldo(BigDecimal sueldo) {
		this.sueldo = sueldo;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	//METODO TOSTRING
	@Override
	public String toString() {
		return "Trabajador [idTrabajador=" + idTrabajador + ", persona=" + persona + ", sueldo=" + sueldo + ", estado="
				+ estado + "]";
	}

	//CONSTRUCTOR
	public Trabajador(int idTrabajador, Persona persona, BigDecimal sueldo, String estado) {
		super();
		this.idTrabajador = idTrabajador;
		this.persona = persona;
		this.sueldo = sueldo;
		this.estado = estado;
	}

	//CONSTRUCTOR VACIO
	public Trabajador() {
		super();
	}
     

}
