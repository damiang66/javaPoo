/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionclaseextra3.Entidades;

import guiarelacionclaseextra3.Enum.TipoVehiculo;

/**
 *
 * @author Damian
 */
public class Vehiculo {
   private String marca;
   private String modelo;
   private int año;
   private String numeroMotor;
   private String chasis;
   private String color;
   private TipoVehiculo tipo;
   // constructores

    public Vehiculo() {
    }

    /**
     *
     * @param marca
     * @param modelo
     * @param año
     * @param numeroMotor
     * @param chasis
     * @param color
     * @param tipo
     */
    public Vehiculo(String marca, String modelo, int año, String numeroMotor, String chasis, String color, TipoVehiculo tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }
   // setter & getter

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public TipoVehiculo getTipo() {
        return tipo;
    }

    public void setTipo(TipoVehiculo tipo) {
        this.tipo = tipo;
    }
    // mostrar 

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", modelo=" + modelo + ", a\u00f1o=" + año + ", numeroMotor=" + numeroMotor + ", chasis=" + chasis + ", color=" + color + ", tipo=" + tipo + '}';
    }
    
}
