/*
 *  NOME            : EXERCÍCIO 24
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um valor inteiro. Verifique e mostre se é 
 *                    divisível por 2 e 3.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc24 {

    public static void main(String[] args) {
        int D;
        D = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro"));
        if (D % 2 == 0 && D % 3 == 0) {
            System.out.println(D + " E divisivel por 2 e por 3");
        } else if (D % 2 == 0) {
            System.out.println(D + " E divisivel por 2");
        } else if (D % 3 == 0) {
            System.out.println(D + " E divisivel por 3");
        } else {
            System.out.println(D + " Nao e divisivel por 2 e nem por 3");
        }
    }
}
