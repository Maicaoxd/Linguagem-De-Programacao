/*
 *  NOME            : EXERCÍCIO 5
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba os coeficientes A, B e C de uma equação do 
 *                    2º grau (AX²+BX+C=0). Calcule e mostre as raízes reais 
 *                    (considerar que a equação possue 2 raízes).
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc05 {

    public static void main(String[] args) {
        int A, B, C;
        float D, X1, X2;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));

        D = (float) ((B * B) - 4 * A * C);
        X1 = (float) ((-B + Math.sqrt(D)) / (2 * A));
        X2 = (float) ((-B - Math.sqrt(D)) / (2 * A));
        System.out.println("O valor de X1 e de: " + X1);
        System.out.println("O valor de X2 e de: " + X2);
    }
}
