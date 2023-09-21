/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora;

import javax.swing.JOptionPane;

/**
 *
 * @author edu
 */
public class calculadoraJoption {

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, """
                                            --------------------------------
                                              CALCULADORA POR JoptionPane
                                            --------------------------------
                                            1º Sumar
                                            2º Restar
                                            3º Multiplicar
                                            4º Dividir
                                            ---------------------------------
                                                                    
                                            ---------------------------------
                                                                """);

        String calculadora = JOptionPane.showInputDialog(
                "Introduce que opción quieres realizar: ");

        switch (calculadora) {
            case "suma", "SUMA", "1", "Suma":
                int sum1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                int sum2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                int resulsum = sum1 + sum2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resulsum);
                break;
            case "resta", "RESTA", "2", "Resta":
                double rest1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
                double rest2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
                double resulrest = rest1 - rest2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resulrest);
                break;
            case "multiplicacion", "3", "multi":
                int mul1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                int mul2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
                int resulmul = mul1 * mul2;
                JOptionPane.showMessageDialog(null, "El resultado es: " + resulmul);                
                break;
            case "division", "divi", "4":
                double div1 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
                double div2 = Double.parseDouble(JOptionPane.showInputDialog("Introduce un número"));
                double resuldiv = div1 / div2;
                JOptionPane.showMessageDialog(null, "El resultado es: " +  resuldiv);
                break;
            default:
                throw new AssertionError();
        }
    }
}
