/*
 *  NOME            : EXERCÍCIO 6
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba os valores em x e y. Efetua a troca de seus
 *                    valores e mostre seus conteúdos.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc06 {

    public static void main(String[] args) {
        int X, Y, I;
        X = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de Y"));
        I = X;
        X = Y;
        Y = I;
        System.out.println("O valor de X e de: " + X);
        System.out.println("O valor de Y e de: " + Y);
    }
}
