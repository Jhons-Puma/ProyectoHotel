package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private int idCliente;

    @ManyToOne
    @JoinColumn(name = "idPersona")
    private Persona persona;

    @Column(name = "cod_cliente", length = 10)
    private String codCliente;

    //METODO GETTERS Y SETTERS
	public int getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	public String getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(String codCliente) {
		this.codCliente = codCliente;
	}

	//METODO TOSTRING
	@Override
	public String toString() {
		return "Cliente [idCliente=" + idCliente + ", persona=" + persona + ", codCliente=" + codCliente + "]";
	}

	//CONSTRUCTOR
	public Cliente(int idCliente, Persona persona, String codCliente) {
		super();
		this.idCliente = idCliente;
		this.persona = persona;
		this.codCliente = codCliente;
	}

	//CONSTRUCCTOR VACIO
	public Cliente() {
		super();
	}
    

}
