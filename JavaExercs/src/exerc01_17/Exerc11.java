/*
 *  NOME            : EXERCÍCIO 11
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o raio de uma circunferência. 
 *                    Calcule e mostre o comprimento da circunferência.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc11 {

    public static void main(String[] args) {
        float R, C;
        R = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da circunferencia"));
        C = (float) (2 * Math.PI * R);
        System.out.println("O valor do comprimento e de: " + C);
    }
}
