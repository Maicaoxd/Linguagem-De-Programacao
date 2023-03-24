package recursiva;

import javax.swing.JOptionPane;

public class Fat {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de num"));
        JOptionPane.showMessageDialog(null, "O VALOR DO FATORIAL É DE: " + Ffat(num));
    }

    static int Ffat(int n) {
        int fat;
        if (n != 1) {
            fat = n * Ffat(n - 1);
            return fat;
        } else {
            return 1;
        }
    }
}
