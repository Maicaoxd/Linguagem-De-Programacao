/*
 *  NOME            : EXERCÍCIO 19
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 valores reais. Calcule e mostre o maior deles.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc19 {

    public static void main(String[] args) {
        double A, B;
        A = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de B"));
        if (A > B) {
            System.out.println(+A + " E maior que " + B);
        } else if (B > A) {
            System.out.println(+B + " E maior que " + A);
        } else {
            System.out.println(+A + " E igual a " + B);
        }
    }
}
