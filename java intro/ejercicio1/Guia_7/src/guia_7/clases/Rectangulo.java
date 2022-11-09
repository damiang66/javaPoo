/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_7.clases;

/**
 *
 * @author Damian
 */
public class Rectangulo{
  private int altura;
  private int base;
  //constructores

    public Rectangulo() {
    }

    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }
  // setter & getter

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
   
}
