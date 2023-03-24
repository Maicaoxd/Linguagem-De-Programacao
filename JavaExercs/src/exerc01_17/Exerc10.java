/*
 *  NOME            : EXERCÍCIO 10
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 números reais. Calcule e mostre a 
 *                    diferença desses valores.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc10 {

    public static void main(String[] args) {
        float X, Y, D;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        D = (float) (X - Y);
        System.out.println("O valor do volume e de: " + D);
    }
}
