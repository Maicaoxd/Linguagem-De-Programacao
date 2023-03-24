/*
 *  NOME            : FUNÇÃO EXERCÍCIO 33
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3
 *                    + ... + 1/N.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc33 {

    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Insira o numero para calcular a serie"));
        JOptionPane.showMessageDialog(null, "A serie de " + num + " e de: " + Fserie(num));
    }

    static double Fserie(double n) {
        double count, serie;
        serie = 0;
        for (count = 1; count <= n; count++) {
            serie = (serie + (1 / count));
        }
        return serie;
    }
}
