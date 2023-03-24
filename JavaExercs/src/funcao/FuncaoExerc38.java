/*
 *  NOME            : FUNÇÃO EXERCÍCIO 38
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 100 números inteiros reais. Verifique e mostre o maior 
 *                    e o menos valor. Obs.: somente valores positivos.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc38 {

    public static void main(String[] args) {
        int X;
        do {
            X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X "));
        } while (X <= 0);
        FMENMAI(X);
    }

    static int FMENMAI(int X) {
        int menor, maior, i = 1;
        menor = X;
        maior = X;
        while (i < 100) {
            X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X "));
            if (X <= 0) {
                i--;
            } else {
                if (menor > X) {
                    menor = X;
                }
                if (maior < X) {
                    maior = X;
                }
            }
            i++;
        }
        System.out.println("O menor e " + menor + "\nO maior e " + maior);
        return 0;
    }
}
