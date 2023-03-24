/*
 *  NOME            : EXERCÍCIO 29
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o tipo de investimento (1 = poupança e 2 = renda fixa)
 *                    e o valor do investimento. Calcule e mostre o valor corrigido
 *                    em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
 *                    Demais tipos não serão considerados.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc29 {

    public static void main(String[] args) {
        int T;
        double VI, VC;
        T = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento"));
        VI = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
        switch (T) {
            case 1:
                VC = (VI * 1.03);
                System.out.println("O valor corrigido e de " + VC);
                break;
            case 2:
                VC = (VI * 1.05);
                System.out.println("O valor corrigido e de " + VC);
                break;
            default:
                System.out.println("Tipo incompativel");
                break;
        }
    }
}
