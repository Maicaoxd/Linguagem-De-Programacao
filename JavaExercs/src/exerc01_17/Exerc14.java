/*
 *  NOME            : EXERCÍCIO 14
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 ângulos de um triângulo. Calcule e mostre
 *                    o valor do 3º ângulo.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc14 {

    public static void main(String[] args) {

        int A, B, C;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 1º angulo"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do 2º angulo"));
        C = (int) (180 - (A + B));
        System.out.println("O valor do 3º angulo e de: " + C);
    }
}
