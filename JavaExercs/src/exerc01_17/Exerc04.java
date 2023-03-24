/*
 *  NOME            : EXERCÍCIO 4
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a temperatura em graus Celsius. Calcule e mostre
 *                    a sua temperatura convertida em fahrenheit 
 *                    F = (9*C+160) /5.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc04 {

    public static void main(String[] args) {
        float C, F;
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da temperatura em Celsius"));
        F = (float) ((9 * C + 160) / 5);
        System.out.println("A temperatura em Fahrenheit e de: " + F);
    }
}
