/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.servivios;

import guia_7.clases.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author Damian
 */
public class RectanguloS {
    Rectangulo r = new Rectangulo();
    Scanner leer = new Scanner(System.in);
    public Rectangulo crear(){
        System.out.println("ingrese la altura del rectangulo");
        r.setAltura(leer.nextInt());
        System.out.println("ingrese la base ");
        r.setBase(leer.nextInt());
        return r;
    }
    public int superficie(){
        int superficie=r.getBase()*r.getAltura();
        return superficie;
    }
    public int perimetro(){
        int perimetro=(r.getBase()+r.getAltura())*2;
        return perimetro;
    }
    /**
     * dibujo el rectangulo
     */
  public void dibujar(){
      for (int i = 0; i < r.getAltura(); i++) {
            for (int j = 0; j < r.getBase(); j++) {
                if(j==0||i==r.getBase()||i==0||j==r.getAltura())
                System.out.print("*");
                else{
                    System.out.print(" ");
                }
          }
            System.out.println("");
      }
  }
}
