/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiarelacionclaseextra3.Entidades;

/**
 *
 * @author Damian
 */
public class Meses {

    public Integer mes;
    public Integer ano;

    public Meses(int mes, int ano) {
        switch (mes) {
            case 1:
                this.mes = 4;
                this.ano = ano;
                break;
            case 2:
                this.mes = 5;
                this.ano = ano;
                break;
            case 3:
                this.mes = 6;
                this.ano = ano;
                break;
            case 4:
                this.mes = 7;
                this.ano = ano;
                break;
            case 5:
                this.mes = 8;
                this.ano = ano;
                break;
            case 6:
                this.mes = 9;
                 this.ano=ano;
                break;
              case 7:
                this.mes = 10;
                 this.ano=ano;
                break;
                 case 8:
                this.mes = 11;
                 this.ano=ano;
                break; 
                  case 9:
                this.mes = 12;
                 this.ano=ano;
                break;
                  case 10:
                this.mes = 1;
                 this.ano=ano+1;
                break;
                 case 11:
                this.mes = 2;
                 this.ano=ano+1;
                break;
                 case 12:
                this.mes = 3;
                 this.ano=ano+1;
                break;

        }
    }
}
