/*
 *  NOME            : FUNÇÃO EXERCÍCIO 36
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número N. Calcule e mostre a série 1 + 1/1! + 
 *                    1/2! + ... + 1/N!
 */
package funcao;
import javax.swing.JOptionPane;

public class FuncaoExerc36 {

    public static void main(String[] args) {
        double num;
        num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de N"));
        JOptionPane.showMessageDialog(null, "O VALOR DA SERIE E DE " + FSerie(num));
    }

    static double FFat(double n) {
        double fat = 1, i;
        for (i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    static double FSerie(double n) {
        double serie = 1, i;
        for (i = 1; i <= n; i++) {
            serie += (1 / FFat(i));
        }
        return serie;
    }
}
