
import javax.swing.JOptionPane;

public class ExeMatriz {

    public static void main(String[] args) {
        int M[][] = new int[2][3];
        int X, Y, S = 0, SP = 0;
        for (X = 0; X < 2; X++) {
            for (Y = 0; Y < 3; Y++) {
                M[X][Y] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da matriz "));
                S += M[X][Y];
                if (M[X][Y] % 2 == 0) {
                    SP += M[X][Y];
                } else {
                    System.out.println("A célula linha " + X + " Coluna " + Y + " Contem numero impar: " + M[X][Y]);
                }
            }
        }
        System.out.println("A soma dos valores é de " + S);
        System.out.println("A soma dos valores par é de " + SP);
    }
}
