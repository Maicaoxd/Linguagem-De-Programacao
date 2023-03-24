/*
 *  NOME            : FUNÇÃO EXERCÍCIO 32
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc32 {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero a ser fatorado"));
        JOptionPane.showMessageDialog(null, "\n O fatorial e de " + Ffat(num));
    }

    static int Ffat(int n) {
        int i, fat;
        fat = 1;
        for (i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
