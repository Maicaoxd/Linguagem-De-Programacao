/*
 *  NOME            : EXERCÍCIO 9
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba os 2 números inteiros. Calcule e 
 *                    mostre a soma dos quadrados.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc09 {

    public static void main(String[] args) {
        int X, Y, S;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        S = (int) (Math.pow(Y, 2) + Math.pow(X, 2));
        System.out.println("O valor do volume e de: " + S);
    }
}
