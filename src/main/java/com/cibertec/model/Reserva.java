package com.cibertec.model;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Reservas")
public class Reserva {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idreserva")
    private int idReserva;

    @ManyToOne
    @JoinColumn(name = "idhabitacion")
    private Habitacion habitacion;

    @ManyToOne
    @JoinColumn(name = "idcliente")
    private Cliente cliente;

    @ManyToOne
    @JoinColumn(name = "idtrabajador")
    private Trabajador trabajador;

    @Column(name = "tipo_reserva", length = 20)
    private String tipoReserva;

    @Column(name = "fecha_reserva")
    private Date fechaReserva;

    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;

    @Column(name = "fecha_salida")
    private Date fechaSalida;

    @Column(name = "costo_alojamiento", precision = 7, scale = 2)
    private BigDecimal costoAlojamiento;

    @Column(name = "observacion", length = 512)
    private String observacion;

    @Column(name = "estado", length = 20)
    private String estado;

    
    //METODO GETTERS Y SETTERS
	public int getIdReserva() {
		return idReserva;
	}

	public void setIdReserva(int idReserva) {
		this.idReserva = idReserva;
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}

	public void setHabitacion(Habitacion habitacion) {
		this.habitacion = habitacion;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Trabajador getTrabajador() {
		return trabajador;
	}

	public void setTrabajador(Trabajador trabajador) {
		this.trabajador = trabajador;
	}

	public String getTipoReserva() {
		return tipoReserva;
	}

	public void setTipoReserva(String tipoReserva) {
		this.tipoReserva = tipoReserva;
	}

	public Date getFechaReserva() {
		return fechaReserva;
	}

	public void setFechaReserva(Date fechaReserva) {
		this.fechaReserva = fechaReserva;
	}

	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Date getFechaSalida() {
		return fechaSalida;
	}

	public void setFechaSalida(Date fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public BigDecimal getCostoAlojamiento() {
		return costoAlojamiento;
	}

	public void setCostoAlojamiento(BigDecimal costoAlojamiento) {
		this.costoAlojamiento = costoAlojamiento;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
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
		return "Reserva [idReserva=" + idReserva + ", habitacion=" + habitacion + ", cliente=" + cliente
				+ ", trabajador=" + trabajador + ", tipoReserva=" + tipoReserva + ", fechaReserva=" + fechaReserva
				+ ", fechaIngreso=" + fechaIngreso + ", fechaSalida=" + fechaSalida + ", costoAlojamiento="
				+ costoAlojamiento + ", observacion=" + observacion + ", estado=" + estado + "]";
	}

	//CONSTRUCTOR
	public Reserva(int idReserva, Habitacion habitacion, Cliente cliente, Trabajador trabajador, String tipoReserva,
			Date fechaReserva, Date fechaIngreso, Date fechaSalida, BigDecimal costoAlojamiento, String observacion,
			String estado) {
		super();
		this.idReserva = idReserva;
		this.habitacion = habitacion;
		this.cliente = cliente;
		this.trabajador = trabajador;
		this.tipoReserva = tipoReserva;
		this.fechaReserva = fechaReserva;
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.costoAlojamiento = costoAlojamiento;
		this.observacion = observacion;
		this.estado = estado;
	}

	//CONSTRUCTOR VACIO
	
	public Reserva() {
		super();
	}
   
    
}
