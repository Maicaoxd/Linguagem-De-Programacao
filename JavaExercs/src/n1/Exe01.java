/*
 *  NOME            : N1_Exe01
 *  DATA            : 13/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 01. Chame uma função que receba um valor como parâmetro
                          e retorne o resultado da Série:
                          Série = (1!/(n)) - (2!/(n-1)) + (3!/(n-2)) - ... (n!/(1))
 */
package n1;

import javax.swing.JOptionPane;

public class Exe01 {

    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Insira n "));
        JOptionPane.showMessageDialog(null, "\n Valor da serie: " + FSerie(num));
    }

    static double FSerie(double n) {
        double i, serie = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                serie += (FFat(i) / (n - (i - 1)));
            } else {
                serie -= (FFat(i) / (n - (i - 1)));
            }
        }
        return serie;
    }

    static double FFat(double n) {
        double i, fat = 1;
        for (i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }
}
