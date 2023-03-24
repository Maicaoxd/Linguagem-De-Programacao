/*
 *  NOME            : FUNÇÃO EXERCÍCIO 44
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o número da base e do expoente. Calcule e mostre o valor da
 *                    potência.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc44 {

    public static void main(String[] args) {
        int b, e;
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base "));
        e = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do expoente "));
        JOptionPane.showMessageDialog(null, "O valor da potencia e de " + FPotencia(b, e));
    }

    static int FPotencia(int b, int e) {
        int p = 1, i;
        for (i = 1; i <= e; i++) {
            p *= b;
        }
        return p;
    }
}
