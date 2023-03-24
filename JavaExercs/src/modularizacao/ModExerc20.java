/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 20
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 3 coeficientes A, B, e C de uma equação do 2º grau
 *                    da fórmula AX²+BX+C=0. Verifique e mostre a existência de 
 *                    raízes reais e se caso exista, calcule e mostre.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc20 {

    static Double X1, X2;

    public static void main(String[] args) {
        ProcedureEquacao2grau();
        if (X1 != 0 && X2 != 0) {
            JOptionPane.showMessageDialog(null, "\n O valor de X1 é de: " + X1 + "\n O valor de X2 é de: " + X2);
        } else {
            JOptionPane.showMessageDialog(null, "\n O Delta e negativo, logo nao e possivel realizar o calculo");
        }
    }

    static void ProcedureEquacao2grau() {
        int A, B, C;
        double D;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C"));
        D = (double) ((B * B) - 4 * A * C);
        if (D >= 0) {
            X1 = (double) ((-B + Math.sqrt(D)) / (2 * A));
            X2 = (double) ((-B - Math.sqrt(D)) / (2 * A));
        } else {
            X1 = (double) 0;
            X2 = (double) 0;
        }
    }
}
