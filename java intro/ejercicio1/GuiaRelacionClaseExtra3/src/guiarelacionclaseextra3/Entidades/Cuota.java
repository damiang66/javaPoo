/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionclaseextra3.Entidades;

import guiarelacionclaseextra3.Enum.FormaPago;
import java.util.Date;

/**
 *
 * @author Damian
 */
public class Cuota {
    private Polizas poliza;
    private int numeroCuota;
    private double monto;
    private boolean sePago;
    private Date fechaVencimiento;
    private FormaPago formaPago;
    //constuctores

    public Cuota() {
    }

    public Cuota(Polizas poliza, int numeroCuota, double monto, Date fechaVencimiento, FormaPago formaPago,boolean sePago) {
        this.poliza = poliza;
        this.numeroCuota = numeroCuota;
        this.monto = monto;
        this.fechaVencimiento = fechaVencimiento;
        this.formaPago = formaPago;
        this.sePago=sePago;
    }
    // setter & getter

    public boolean isSePago() {
        return sePago;
    }

    public void setSePago(boolean sePago) {
        this.sePago = sePago;
    }

    public Polizas getPoliza() {
        return poliza;
    }

    public void setPoliza(Polizas poliza) {
        this.poliza = poliza;
    }

    public int getNumeroCuota() {
        return numeroCuota;
    }

    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public FormaPago getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(FormaPago formaPago) {
        this.formaPago = formaPago;
    }
    // mostrar

    @Override
    public String toString() {
        return "Cuota{" + "poliza=" + poliza + ", numeroCuota=" + numeroCuota + ", monto=" + monto + ", fechaVencimiento=" + fechaVencimiento + ", formaPago=" + formaPago + '}';
    }
    
    
    
}
