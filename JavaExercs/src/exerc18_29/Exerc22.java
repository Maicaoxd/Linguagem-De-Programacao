/*
 *  NOME            : EXERCÍCIO 22
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 valores inteiros e diferentes. Mostre seus 
 *                    valores em ordem crescente.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc22 {

    public static void main(String[] args) {
        int X, Y;
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
        if (X == Y) {
            System.out.println("Erro, numeros iguais");
        } else if (X > Y) {
            System.out.println(+Y + ", " + X);
        } else {
            System.out.println(+X + ", " + Y);
        }
    }
}
