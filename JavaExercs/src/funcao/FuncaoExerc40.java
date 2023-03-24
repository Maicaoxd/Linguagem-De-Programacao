/*
 *  NOME            : FUNÇÃO EXERCÍCIO 40
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 números inteiros. Verifique e mostre todos os números primos
 *                    existentes entre eles.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc40 {

    public static void main(String[] args) {
        int X, Y;
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X "));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y "));
        FPrimo(X, Y);
    }

    static int FPrimo(int X, int Y) {
        int i, j, primo, menor=999999, maior = 0;
        if (X < Y) {
            menor = X;
            maior = Y;
        }
        for (i = (menor + 1); i <= (maior - 1); i++) {
            primo = 0;
            for (j = 1; j <= i; j++) {
                if (i % j == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.print(i + ", ");
            }
        }
        return 0;
    }
}
