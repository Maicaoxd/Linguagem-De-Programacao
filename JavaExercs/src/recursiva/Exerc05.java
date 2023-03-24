/*
    (N)! + (N-1)! + (N-2)! + ... + (1)!
 */
package recursiva;

import javax.swing.JOptionPane;

public class Exerc05 {

    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de num"));
        JOptionPane.showMessageDialog(null, "O VALOR DA SERIE E DE: " + RExerc05(num));
    }

    static double Ffat(double n) {
        double fat;
        if (n != 1) {
            fat = n * Ffat(n - 1);
            return fat;
        } else {
            return 1;
        }
    }

    static double RExerc05(double n) {
        double serie;
        if (n != 1) {
            serie = Ffat(n) + RExerc05(n - 1);
            return serie;
        } else {
            return 1;
        }
    }
}
