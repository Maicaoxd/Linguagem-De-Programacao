/*
    Serie1 = (1+2+3+...+100)
 */
package recursiva;

import javax.swing.JOptionPane;

public class Exerc01 {

    public static void main(String[] args) {
        int num;
        num = 100;
        JOptionPane.showMessageDialog(null, "O VALOR DA SERIE E DE: " + RExerc01(num));
    }

    static int RExerc01(int n) {
        int serie;
        if (n != 1) {
            serie = n + RExerc01(n - 1);
            return serie;
        } else {
            return 1;
        }
    }

}
