/*
 *  NOME            : EXERCÍCIO 26
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 números inteiros. Verifique e mostre se o maior
 *                    número é múltiplo do menor.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc26 {

    public static void main(String[] args) {
        int X, Y;
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
        if (X >= Y) {
            if (X % Y == 0) {
                System.out.println(X + " e multiplo de " + Y);
            } else {
                System.out.println(X + " nao e multiplo de " + Y);
            }
        } else {
            if (Y % X == 0) {
                System.out.println(Y + " e multiplo de " + X);
            } else {
                System.out.println(Y + " nao e multiplo de " + X);
            }
        }
    }
}
