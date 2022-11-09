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
public class Televisor extends Electrodomestico {
    private double pulgadas;
    private boolean sintonizador;
    // constructores

    public Televisor() {
    }

   

    public Televisor(double pulgadas, boolean sintonizador, int precio, String color, String consumoEnergetico, double peso,String tipo) {
        super(precio, color, consumoEnergetico, peso,tipo);
        this.pulgadas = pulgadas;
        this.sintonizador = sintonizador;
    }
    // setter & getter

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }
    /**
     * metodo para crear un televisor
   
     */
    public void crearTelevisor(){
        Scanner leer = new Scanner(System.in);
       
        this.CrearElectrodomestico();
        
        System.out.println("Ingrese la resolucion del televisor");
        this.setPulgadas(leer.nextDouble());
        System.out.println("Ingrese si tiene sintonizador TDT\n"
                + "1-SI\n"
                + "2-NO");
        int opcion=leer.nextInt();
        if (opcion==1){
            this.setSintonizador(true);
            
        }else{
            this.setSintonizador(false);
        }
        this.setTipo("T");
      //  return t;
        
    }
    @Override
    public void precioFinal(){
        super.precioFinal();
        if (this.getPulgadas()>40){
           int pulgada= this.getPrecio()*30/100;
            this.setPrecio(this.getPrecio()+pulgada);
            if (this.isSintonizador()){
                this.setPrecio(this.getPrecio()+500);
            }
        }
        
    }
    
}
