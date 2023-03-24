/*
 *  NOME            : EXERCÍCIO 18
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 valores inteiros. Calcule e mostre o resultado
 *                    da diferença do maior pelo menos valor.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc18 {

    public static void main(String[] args) {
        int X, Y, D;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        if (X > Y) {
            D = (X - Y);
            System.out.println("A diferença e de: " + D);
        } else {
            D = (Y - X);
            System.out.println("A diferença e de: " + D);
        }
    }
}
