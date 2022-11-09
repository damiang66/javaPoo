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
 */
public class Lavadora extends Electrodomestico {
private int carga;
//constructores

    public Lavadora() {
       
    }

    public Lavadora(int carga, int precio, String color, String consumoEnergetico, double peso, String tipo) {
        super(precio, color, consumoEnergetico, peso, tipo);
        this.carga = carga;
    }

  

    
    // setter & getter

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    /**
     * este metodo creo la lavadora 
     */
    public void crearLavadora(){
       // Lavadora lavadora=new Lavadora();
        this.CrearElectrodomestico();
        //System.out.println(lavadora.getColor());
        Scanner leer= new Scanner(System.in);
        System.out.println("ingrese la carga que tiene la lavadora");
        this.setCarga(leer.nextInt());
        this.setTipo("L");
        
       // return lavadora;
    }
@Override
    public void precioFinal(){
        super.precioFinal();
        if(this.getCarga()>30){
            
            this.setPrecio(this.getPrecio()+500);
        }
    }

    @Override
    public String toString() {
        return "Lavadora{" + "carga=" + carga + '}';
    }
    

}
