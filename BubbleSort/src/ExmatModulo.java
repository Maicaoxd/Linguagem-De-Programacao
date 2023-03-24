
import javax.swing.*;

public class ExmatModulo {

    static int M[][] = new int[3][3];
    static int x, y;

    public static void main(String args[]) {
        CarregaMat();
        MostraMat();
        System.exit(0);
    }

    static void CarregaMat() {
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Digite valor"));
            }
        }
    }

    static void MostraMat() {
        for (x = 0; x < 3; x++) {
            for (y = 0; y < 3; y++) {
                System.out.println("M[" + x + "][" + y + "] = " + M[x][y]);
            }
        }
    }
}
