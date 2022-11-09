/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Scanner;

/**
 *
 * @author Damian
 * @param <T>
 */
public class Electrodomestico<T> {

    protected int precio;
    protected String color;
    protected String consumoEnergetico;
    protected double peso;
    protected String tipo;
    //constuctores 

    public Electrodomestico() {
    }

    public Electrodomestico(int precio, String color, String consumoEnergetico, double peso, String tipo) {
        this.precio = precio;
        this.color = color;
        this.consumoEnergetico = consumoEnergetico;
        this.peso = peso;
        this.tipo=tipo;
    }
    // setter & getter

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    /**
     * esto comprueba que la letra ingresada sea correcta
     *
     * @param letra
     */
    public void comprobarConsumo(String letra) {
        letra = letra.toUpperCase();
        System.out.println("");
        switch (letra) {
            case "A":
                this.setConsumoEnergetico(letra);
                break;
            case "B":
                 this.setConsumoEnergetico(letra);
                break;
            case "C":
                 this.setConsumoEnergetico(letra);
                break;
            case "D":
                this.setConsumoEnergetico(letra);
                break;
            case "E":
                this.setConsumoEnergetico(letra);
                break;
            case "F":
                 this.setConsumoEnergetico(letra);
                break;
            default:
                this.setConsumoEnergetico("F");
                break;

        }
        System.out.println(this.getConsumoEnergetico());
    }

    /**
     * esto comprueba que el color sea correcto
     *
     * @param color
     */
    public void comprobarColor(String color) {
        color = color.toLowerCase();
        switch (color) {
            case "blanco":
               this.setColor (color) ;
                break;
            case "negro":
                this.setColor (color) ;
                break;
            case "rojo":
                this.setColor (color) ;
                break;
            case "azul":
                this.setColor (color) ;
                break;
            case "gris":
                this.setColor (color) ;
                break;

            default:
                this.setColor ("blanco") ;
                break;

        }
    }

    /**
     * este metodo lo utilizo para crear electrodomestico
     */
    public void CrearElectrodomestico() {

        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese color de electrodomestico");
        this.comprobarColor(leer.next());
        System.out.println("Ingrese el consumo energetico ");
        this.comprobarConsumo(leer.next());
        System.out.println("ingrese el peso que tiene el electrodomestico");
        this.setPeso(leer.nextDouble());
        this.setPrecio (1000) ;
        //return this;
    }
    /**
     * este metodo lo utilizo para el precio Final
     */
    public void precioFinal(){
        switch(this.getConsumoEnergetico()){
            case "A":
                if (this.getPeso()>1&&this.getPeso()<20){
                this.setPrecio(1000+100);
                }
                if (this.getPeso()>19 && this.getPeso()<50){
                    this.setPrecio(1000+500);
                }
                if (this.getPeso()>49 && this.getPeso()<80){
                    this.setPrecio(1000+800);
                }
                if (this.getPeso()>80){
                    this.setPrecio(1000+1000);
                }
                
                break;
            case "B":
               if (this.getPeso()>1&&this.getPeso()<20){
                this.setPrecio(800+100);
                }
                if (this.getPeso()>19 && this.getPeso()<50){
                    this.setPrecio(800+500);
                }
                if (this.getPeso()>49 && this.getPeso()<80){
                    this.setPrecio(800+800);
                }
                if (this.getPeso()>80){
                    this.setPrecio(800+1000);
                }
                break;
            case "C":
                 if (this.getPeso()>1&&this.getPeso()<20){
                this.setPrecio(600+100);
                }
                if (this.getPeso()>19 && this.getPeso()<50){
                    this.setPrecio(600+500);
                }
                if (this.getPeso()>49 && this.getPeso()<80){
                    this.setPrecio(600+800);
                }
                if (this.getPeso()>80){
                    this.setPrecio(600+1000);
                }
                break;
            case "D":
                 if (this.getPeso()>1&&this.getPeso()<20){
                this.setPrecio(500+100);
                }
                if (this.getPeso()>19 && this.getPeso()<50){
                    this.setPrecio(500+500);
                }
                if (this.getPeso()>49 && this.getPeso()<80){
                    this.setPrecio(500+800);
                }
                if (this.getPeso()>80){
                    this.setPrecio(500+1000);
                }
                break;
            case "E":
                 if (this.getPeso()>1&&this.getPeso()<20){
                this.setPrecio(300+100);
                }
                if (this.getPeso()>19 && this.getPeso()<50){
                    this.setPrecio(300+500);
                }
                if (this.getPeso()>49 && this.getPeso()<80){
                    this.setPrecio(300+800);
                }
                if (this.getPeso()>80){
                    this.setPrecio(300+1000);
                }
                break;
            case "F":
                  if (this.getPeso()>1&&this.getPeso()<20){
                this.setPrecio(100+100);
                }
                if (this.getPeso()>19 && this.getPeso()<50){
                    this.setPrecio(100+500);
                }
                if (this.getPeso()>49 && this.getPeso()<80){
                    this.setPrecio(100+800);
                }
                if (this.getPeso()>80){
                    this.setPrecio(100+1000);
                }
                break;

        }
    }
}
