/*
    (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N) 
 */
package recursiva;

import javax.swing.JOptionPane;

public class Exerc04 {

    public static void main(String[] args) {
        double num;
        double c;
        c = 1;
        num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de num"));
        JOptionPane.showMessageDialog(null, "O VALOR DA SERIE E DE: " + RExerc04(num, c));
    }

    static double RExerc04(double n, double cnt) {
        double serie;
        if (n != 1) {
            serie = (n / cnt) + RExerc04(n - 1, cnt + 1);
            return serie;
        } else {
            System.out.println(n+"\n "+cnt);
            return 1/cnt;
        }
    }
}
