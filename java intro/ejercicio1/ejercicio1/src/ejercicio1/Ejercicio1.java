/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

import java.util.Scanner;
import static jdk.nashorn.internal.objects.NativeString.toLowerCase;
import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

/**
 *
 * @author Damian
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments ||
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int ejercicio;
        System.out.println("ingrese el ejercicio a ejecutar");
        ejercicio = leer.nextInt();
        switch (ejercicio) {
            case 1:
                ej1();
            //   break;
            case 2:
                ej2();
            // break;
            case 3:
                ej3();
            // break;
            case 4:
                ej4();
                break;
            case 5:
                ej5();
                break;
            case 6:
                ej6();
                break;
            case 7:
                ej7();
                break;
            case 8:
                ej8();
                break;
            case 9:
                ej9();
                break;
            case 10:
                ej10();
                break;
            case 11:
                ej11();
                break;
            case 12:
                ej12();
                break;
            case 13:
                ej13();
                break;
            case 14:
                ej14();
                break;
            case 15:
                // ejercicio15 ej15= new ejercicio15();
                //ej15.
                break;

            default:
                System.out.println("ingreso un ejercicio que todavia no realizo");

        }

    }

    public static void ej1() {
        Scanner leer = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("ingrese el primer numero:");
        numero1 = leer.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = leer.nextInt();
        int suma = numero1 + numero2;
        System.out.println("el resultado de la suma de los dos numeros es: " + suma);
    }

    public static void ej2() {
        Scanner leer = new Scanner(System.in);

        System.out.println("ingrese su nombre");
        String nombre = leer.nextLine();
        System.out.println("el nombre ingresado es: " + nombre);
    }

    public static void ej3() {
        Scanner leer = new Scanner(System.in);
        //leer.useDelimiter("\n");
        System.out.println("ingrese una frase");
        String frase = leer.nextLine();
        String mayuscula = frase.toUpperCase();
        String minuscula = frase.toLowerCase();
        System.out.println("la frae en mayuscula es " + mayuscula);
        System.out.println("la frase en minuscula es " + minuscula);
    }

    public static void ej4() {
        /*4. Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los grados centigrados");
        double grados = leer.nextDouble();
        double resultado = 1.8 * grados + 32;
        System.out.println("los grados Fahrenheit es " + resultado);

    }

    public static void ej5() {
        /* 5. Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
         */
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = leer.nextInt();
        int doble = numero * 2;
        int triple = numero * 3;
        double raiz = Math.sqrt(numero);
        System.out.println("el numero doble del ingresado es " + doble);
        System.out.println("el numero triple del ingresado es " + triple);
        System.out.println("la raiz cuadrada del numero  ingresado es " + raiz);
    }

    public static void ej6() {
        //Crear un programa que dado un numero determine si es par o impar.
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("numero par");
        } else {
            System.out.println("numero inpar");
        }

    }

    public static void ej7() {
        /*Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.   */
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        String frase = leer.next();
        if (frase.equals("eureka")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void ej8() {
        /*   Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        String frase = leer.next();
        if (frase.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }
    }

    public static void ej9() {
        /*     Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese una frase: ");
        String frase = leer.next();
        String letra = frase.substring(0, 1);
        //String a="A";
        if (frase.substring(0, 1).equals("A") || frase.substring(0, 1).equals("a")) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("INCORRECTO");
        }

        System.out.println(letra);
    }

    public static void ej10() {
        /*   10. Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.*/
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero  ");
        int numero = leer.nextInt();
        int suma = 0;
        while (suma < numero) {
            System.out.println("ingrese un numero para sumar  ");
            int numero1 = leer.nextInt();
            suma = suma + numero1;
        }
    }

    public static void ej11() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el 1er numero  ");
        double numero = leer.nextDouble();
        System.out.println("ingrese el 2do numero  ");
        double numero1 = leer.nextDouble();
        int opcion1 = 0;
        while (opcion1 == 0) {
            System.out.println("Menu");
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-salir");
            System.out.println("Elija Opcion:");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("la suma es: " + (numero + numero1));
                    break;
                case 2:
                    System.out.println("la resta es: " + (numero - numero1));
                    break;
                case 3:
                    System.out.println("la multiplicacion es: " + (numero * numero1));
                    break;
                case 4:
                    System.out.println("la division es: " + (numero) / (numero1));
                    break;
                case 5:
                    System.out.println("esta seguro que desea salir S/N");
                    String o = leer.next();
                    o = o.toUpperCase();
                    if (o.equals("S")) {
                        opcion1 = 1;
                        System.out.println("Chau");
                    }

                    break;
                default:
                    System.out.println("ingrese dato correcto");
            }
        }
    }

    public static void ej12() {
        // System.out.println("este todavia no lo realizo");
      /*  Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de 
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato 
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser 
X y el último tiene que ser una O. 
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia 
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta 
de FDE, que no respete el formato se considera incorrecta. 
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e 
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las 
siguientes funciones de Java Substring(), Length(), equals().*/
        Scanner leer = new Scanner(System.in);
        String dispositivo = "";
        int a = 0;
        int b = 0;
        String ultimo = "";
        String primero = "";

        while (!dispositivo.equals("&&&&&")) {

            System.out.println("ingrese un dispositivo RS232");
            dispositivo = leer.next();
            int longitud = dispositivo.length();
            if (longitud < 5) {
                System.out.println("ingrese un dispositivo RS232");
                dispositivo = leer.next();
                longitud = dispositivo.length();
               // b++;

            

                    ultimo = dispositivo.substring((longitud - 1), longitud);
                
                primero = dispositivo.substring(0, 1);
            }

             System.out.println(longitud);
            System.out.println(primero);
            System.out.println(ultimo);
            if (!dispositivo.equals("&&&&&")) {
                if (longitud < 5 && primero.equals("X") && ultimo.equals("O")) {
                    a++;
                } else {
                    b++;
                }
            }
            /*System.out.println(primero);
  System.out.println(ultimo);*/
        }
        System.out.println("se ingreso correctamente " + a);
        System.out.println("se ingreso incorrectamente " + b);

    }

    public static void ej13() {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del cuadradro");
        int c = leer.nextInt();

        //String[][] matriz = new String[c][c];

        for (int i = 0; i < c; i++) {
            for (int j = 0; j < c; j++) {
                if (i != 0 && i != (c - 1) && j != 0 && j != (c - 1)) {
                    //matriz[i][j] = " ";
                    System.out.print(" ");
                } else {
                    //matriz[i][j] = "*";
                    System.out.print("*");
                }

            }
                System.out.println("");
        }
//        for (int i = 0; i < c; i++) {
//            for (int j = 0; j < c; j++) {
//
//                System.out.print(matriz[i][j]);
//
//            }
//            System.out.println();
//        }
  }

    public static void ej14() {
        /*  Crea una aplicación que a través de una función nos convierta una cantidad de euros 
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La 
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será 
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio 
(void).
/*El cambio de divisas es:
 * 0.86 libras es un 1 €
 * 1.28611 $ es un 1 €
 * 129.852 yenes es un 1 €*/
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese Euros");
        double euros = leer.nextDouble();
        // System.out.println("ingrese la moneda a cambiar libra/dolares/yenes");
        // String moneda=leer.next();
        cambio(euros);
    }

    public static double cambio(double euros) {
        double[] vector = new double[3];
        vector[0] = 0.86 * euros;
        vector[1] = 1.28611 * euros;
        vector[2] = 129.852 * euros;
        for (int i = 0; i > 3; i++) {
            switch (i) {
                case 0:
                    System.out.println("en libras el cambio seria " + vector[i]);
                    break;
                case 1:
                    System.out.println("en dolares el cambio seria " + vector[i]);
                    break;
                case 2:
                    System.out.println("en yenes el cambio seria " + vector[i]);
                    break;
            }
        }
        return vector[0];
    }
}
