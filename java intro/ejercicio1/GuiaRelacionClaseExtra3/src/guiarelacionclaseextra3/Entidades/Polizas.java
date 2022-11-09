/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionclaseextra3.Entidades;

import guiarelacionclaseextra3.Enum.FormaPago;
import guiarelacionclaseextra3.Enum.TipoCobertura;
import java.util.Date;

/**
 *
 * @author Damian
 */
public class Polizas {
    private Vehiculo vehiculo;
    private Cliente cliente;
    private int numeroPoliza;
    private Date fechaInicio;
    private Date fechaFinDePoliza;
    private int cantidadDeCuotas;
    private FormaPago formapago;
    private double montoTotal;
    private boolean incluyeGranizo;
    private double montoGranizo;
    private TipoCobertura tipoCobertura;
    // constuctores

    public Polizas() {
    }

    public Polizas(Vehiculo vehiculo, Cliente cliente, int numeroPoliza, Date fechaInicio, Date fechaFinDePoliza, int cantidadDeCuotas, FormaPago formapago, double montoTotal, boolean incluyeGranizo, double montoGranizo, TipoCobertura tipoCobertura) {
        this.vehiculo = vehiculo;
        this.cliente = cliente;
        this.numeroPoliza = numeroPoliza;
        this.fechaInicio = fechaInicio;
        this.fechaFinDePoliza = fechaFinDePoliza;
        this.cantidadDeCuotas = cantidadDeCuotas;
        this.formapago = formapago;
        this.montoTotal = montoTotal;
        this.incluyeGranizo = incluyeGranizo;
        this.montoGranizo = montoGranizo;
        this.tipoCobertura = tipoCobertura;
    }
    // setter & getter

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getNumeroPoliza() {
        return numeroPoliza;
    }

    public void setNumeroPoliza(int numeroPoliza) {
        this.numeroPoliza = numeroPoliza;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinDePoliza() {
        return fechaFinDePoliza;
    }

    public void setFechaFinDePoliza(Date fechaFinDePoliza) {
        this.fechaFinDePoliza = fechaFinDePoliza;
    }

    public int getCantidadDeCuotas() {
        return cantidadDeCuotas;
    }

    public void setCantidadDeCuotas(int cantidadDeCuotas) {
        this.cantidadDeCuotas = cantidadDeCuotas;
    }

    public FormaPago getFormapago() {
        return formapago;
    }

    public void setFormapago(FormaPago formapago) {
        this.formapago = formapago;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public boolean isIncluyeGranizo() {
        return incluyeGranizo;
    }

    public void setIncluyeGranizo(boolean incluyeGranizo) {
        this.incluyeGranizo = incluyeGranizo;
    }

    public double getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(double montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    // mostrar

    @Override
    public String toString() {
        return "Poliza{" + "vehiculo=" + vehiculo + ", cliente=" + cliente + ", numeroPoliza=" + numeroPoliza + ", fechaInicio=" + fechaInicio + ", fechaFinDePoliza=" + fechaFinDePoliza + ", cantidadDeCuotas=" + cantidadDeCuotas + ", formapago=" + formapago + ", montoTotal=" + montoTotal + ", incluyeGranizo=" + incluyeGranizo + ", montoGranizo=" + montoGranizo + ", tipoCobertura=" + tipoCobertura + '}';
    }
    
}
