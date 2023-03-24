/*
 *  NOME            : EXERCÍCIO 15
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba os valores de 2 catetos de um triângulo
 *                    retângulo. Calcule e mostre a hipotenusa.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc15 {

    public static void main(String[] args) {
        float A, B, H;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º cateto"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º cateto"));
        H = (float) (Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
        System.out.println("O valor da hipotenusa e de: " + H);
    }
}
