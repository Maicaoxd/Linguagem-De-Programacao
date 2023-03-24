/*
 *  NOME            : EXERCÍCIO 20
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 3 coeficientes A, B, e C de uma equação do 2º grau
 *                    da fórmula AX²+BX+C=0. Verifique e mostre a existência de 
 *                    raízes reais e se caso exista, calcule e mostre.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc20 {

    public static void main(String[] args) {
        int A, B, C;
        double D, X1, X2;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
        D = (double) ((B * B) - 4 * A * C);
        if (D >= 0) {
            X1 = (double) ((-B + Math.sqrt(D)) / (2 * A));
            X2 = (double) ((-B - Math.sqrt(D)) / (2 * A));
            System.out.println("O valor de X1 e de: " + X1);
            System.out.println("O valor de X2 e de: " + X2);
        } else {
            System.out.println("Delta e igual a: " + D + " logo, nao e possivel realizar o calculo");
        }
    }
}
