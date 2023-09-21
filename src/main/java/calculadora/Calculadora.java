/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package calculadora;

import java.util.Scanner;

/**
 *
 * @author edu
 */
public class Calculadora {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        // Calculadora simple
        System.out.println("""
                                --------------------------------
                                    CALCULADORA POR SCANNER
                                --------------------------------
                                1º Sumar
                                2º Restar
                                3º Multiplicar
                                4º Dividir
                                ---------------------------------
                        
                                ---------------------------------
                             """);

        System.out.println("Elige uno de las opciones ");
        String calculadora = teclado.nextLine();

        switch (calculadora) {
            
            
            case "suma","SUMA","1","Suma":
                System.out.println("Introduce un número: ");
                int sum1 = teclado.nextInt();
                System.out.println("Introduce un segundo número: ");
                int sum2 = teclado.nextInt();

                int resulsum = sum1 + sum2;
                System.out.println("El resultado de la suma es: " + resulsum);
                break;
            case "resta","RESTA","2","Resta":
                System.out.println("Introduce un número: ");
                double rest1 = teclado.nextInt();
                System.out.println("Introduce un segundo número: ");
                double rest2 = teclado.nextInt();

                double reslrest = rest1 - rest2;
                System.out.println("El resultado de la suma es: " + reslrest);
                break;

            case "multiplicacion","3","multi":
                System.out.println("Introduce un número: ");
                int mult1 = teclado.nextInt();
                System.out.println("Introduce un segundo número: ");
                int mult2 = teclado.nextInt();

                int reslmult = mult1 * mult2;
                System.out.println("El resultado de la suma es: " + reslmult);
                break;
            case "division","divi","4":
                System.out.println("Introduce un número: ");
                double div1 = teclado.nextInt();
                System.out.println("Introduce un segundo número: ");
                double div2 = teclado.nextInt();

                double resldiv = div1 / div2;
                System.out.println("El resultado de la suma es: " + resldiv);
                break;
            default:
                throw new AssertionError();
        }
    }
}
