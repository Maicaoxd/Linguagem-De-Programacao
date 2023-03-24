/*
    Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
 */
package recursiva;

import javax.swing.JOptionPane;

public class Exerc02 {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de num"));
        JOptionPane.showMessageDialog(null, "O VALOR DA SERIE E DE: " + RExerc02(num));
    }

    static int RExerc02(int n) {
        int serie;
        if (n != 1) {
            serie = n + RExerc02(n - 1);
            return serie;
        } else {
            return 1;
        }
    }
}
