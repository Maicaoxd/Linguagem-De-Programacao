/*
    (1/1) + (1/2) + (1/3) + ....+ (1/N) 
 */
package recursiva;

import javax.swing.JOptionPane;

public class Exerc03 {

    public static void main(String[] args) {

        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de num"));
        JOptionPane.showMessageDialog(null, "O VALOR DA SERIE E DE: " + RExerc03(num));
    }

    static double RExerc03(double n) {
        double serie;
        if (n != 1) {
            serie = (1 / n) + RExerc03(n - 1);
            return serie;
        } else {
            return n;
        }
    }
}
