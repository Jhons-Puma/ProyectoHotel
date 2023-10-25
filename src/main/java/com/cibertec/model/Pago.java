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
@Table(name = "Pagos")
public class Pago {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idpago")
    private int idPago;

    @ManyToOne
    @JoinColumn(name = "idreserva")
    private Reserva reserva;

    @Column(name = "tipo_comprobante", length = 20)
    private String tipoComprobante;

    @Column(name = "num_comprobante", length = 12)
    private String numComprobante;

    @Column(name = "igv", precision = 4, scale = 2)
    private BigDecimal igv;

    @Column(name = "total_pago", precision = 9, scale = 2)
    private BigDecimal totalPago;

    @Column(name = "fecha_emision")
    private Date fechaEmision;

    @Column(name = "fecha_pago")
    private Date fechaPago;

    @Column(name = "estado", length = 20)
    private String estado;

    //METODO GETTERS Y SETTERS
	public int getIdPago() {
		return idPago;
	}

	public void setIdPago(int idPago) {
		this.idPago = idPago;
	}

	public Reserva getReserva() {
		return reserva;
	}

	public void setReserva(Reserva reserva) {
		this.reserva = reserva;
	}

	public String getTipoComprobante() {
		return tipoComprobante;
	}

	public void setTipoComprobante(String tipoComprobante) {
		this.tipoComprobante = tipoComprobante;
	}

	public String getNumComprobante() {
		return numComprobante;
	}

	public void setNumComprobante(String numComprobante) {
		this.numComprobante = numComprobante;
	}

	public BigDecimal getIgv() {
		return igv;
	}

	public void setIgv(BigDecimal igv) {
		this.igv = igv;
	}

	public BigDecimal getTotalPago() {
		return totalPago;
	}

	public void setTotalPago(BigDecimal totalPago) {
		this.totalPago = totalPago;
	}

	public Date getFechaEmision() {
		return fechaEmision;
	}

	public void setFechaEmision(Date fechaEmision) {
		this.fechaEmision = fechaEmision;
	}

	public Date getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(Date fechaPago) {
		this.fechaPago = fechaPago;
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
		return "Pago [idPago=" + idPago + ", reserva=" + reserva + ", tipoComprobante=" + tipoComprobante
				+ ", numComprobante=" + numComprobante + ", igv=" + igv + ", totalPago=" + totalPago + ", fechaEmision="
				+ fechaEmision + ", fechaPago=" + fechaPago + ", estado=" + estado + "]";
	}

	//CONSTRUCTOR
	public Pago(int idPago, Reserva reserva, String tipoComprobante, String numComprobante, BigDecimal igv,
			BigDecimal totalPago, Date fechaEmision, Date fechaPago, String estado) {
		super();
		this.idPago = idPago;
		this.reserva = reserva;
		this.tipoComprobante = tipoComprobante;
		this.numComprobante = numComprobante;
		this.igv = igv;
		this.totalPago = totalPago;
		this.fechaEmision = fechaEmision;
		this.fechaPago = fechaPago;
		this.estado = estado;
	}

	//CONSTRUCTOR VACIO
	public Pago() {
		super();
	}
    
	
	
    
}
