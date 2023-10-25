package com.cibertec.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "Consumos")
public class Consumo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idConsumo")
    private int idConsumo;

    @ManyToOne
    @JoinColumn(name = "idreserva")
    private Reserva reserva;

    @ManyToOne
    @JoinColumn(name = "idproducto")
    private Producto producto;

    @Column(name = "cantidad")
    private int cantidad;

    @Column(name = "precio_venta", precision = 7, scale = 2)
    private BigDecimal precioVenta;

    @Column(name = "estado", length = 20)
    private String estado;
    
    //METODO GETTERS Y SETTERS

	public int getIdConsumo() {
		return idConsumo;
	}

	public void setIdConsumo(int idConsumo) {
		this.idConsumo = idConsumo;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public BigDecimal getPrecioVenta() {
		return precioVenta;
	}

	public void setPrecioVenta(BigDecimal precioVenta) {
		this.precioVenta = precioVenta;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	//METODO TO STRING
	@Override
	public String toString() {
		return "Consumo [idConsumo=" + idConsumo + ", reserva=" + reserva + ", producto=" + producto + ", cantidad="
				+ cantidad + ", precioVenta=" + precioVenta + ", estado=" + estado + "]";
	}

	//CONSTRUCTOR
	public Consumo(int idConsumo, Reserva reserva, Producto producto, int cantidad, BigDecimal precioVenta,
			String estado) {
		super();
		this.idConsumo = idConsumo;
		this.reserva = reserva;
		this.producto = producto;
		this.cantidad = cantidad;
		this.precioVenta = precioVenta;
		this.estado = estado;
	}

	//CONSTRUCTOR VACIO
	public Consumo() {
		super();
	}
   
    
}
