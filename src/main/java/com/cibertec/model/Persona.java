package com.cibertec.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Personas")
public class Persona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idPersona")
    private int idPersona;
    
    @Column(length = 50)
    private String nombre;
    
    @Column(length = 50)
    private String apellido;
    
    @Column(name = "tipo_documento")
    private int tipoDocumento;
    
    @Column(name = "numero_documento", length = 20)
    private String numeroDocumento;
    
    @Column(name = "sex_usuario", length = 1)
    private char sexoUsuario;
    
    @Column(name = "telef_usuario")
    private int telefonoUsuario;
    
    @Column(name = "email_usuario", length = 50)
    private String emailUsuario;
    
    @Column(name = "pass_usuario", length = 50)
    private String passwordUsuario;
    
    //Metodo Getters y SETTERS
    
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public int getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(int tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getNumeroDocumento() {
		return numeroDocumento;
	}

	public void setNumeroDocumento(String numeroDocumento) {
		this.numeroDocumento = numeroDocumento;
	}

	public char getSexoUsuario() {
		return sexoUsuario;
	}

	public void setSexoUsuario(char sexoUsuario) {
		this.sexoUsuario = sexoUsuario;
	}

	public int getTelefonoUsuario() {
		return telefonoUsuario;
	}

	public void setTelefonoUsuario(int telefonoUsuario) {
		this.telefonoUsuario = telefonoUsuario;
	}

	public String getEmailUsuario() {
		return emailUsuario;
	}

	public void setEmailUsuario(String emailUsuario) {
		this.emailUsuario = emailUsuario;
	}

	public String getPasswordUsuario() {
		return passwordUsuario;
	}

	public void setPasswordUsuario(String passwordUsuario) {
		this.passwordUsuario = passwordUsuario;
	}
	
	//METODO TO STRING
	@Override
	public String toString() {
		return "Persona [idPersona=" + idPersona + ", nombre=" + nombre + ", apellido=" + apellido + ", tipoDocumento="
				+ tipoDocumento + ", numeroDocumento=" + numeroDocumento + ", sexoUsuario=" + sexoUsuario
				+ ", telefonoUsuario=" + telefonoUsuario + ", emailUsuario=" + emailUsuario + ", passwordUsuario="
				+ passwordUsuario + "]";
	}

	//CONSTRUCTOR
	public Persona(int idPersona, String nombre, String apellido, int tipoDocumento, String numeroDocumento,
			char sexoUsuario, int telefonoUsuario, String emailUsuario, String passwordUsuario) {
		super();
		this.idPersona = idPersona;
		this.nombre = nombre;
		this.apellido = apellido;
		this.tipoDocumento = tipoDocumento;
		this.numeroDocumento = numeroDocumento;
		this.sexoUsuario = sexoUsuario;
		this.telefonoUsuario = telefonoUsuario;
		this.emailUsuario = emailUsuario;
		this.passwordUsuario = passwordUsuario;
	}

	//CONSTRUCTOR VACIO
	public Persona() {
		super();
	}
    

    
}
