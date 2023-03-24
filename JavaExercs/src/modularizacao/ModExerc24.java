/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 24
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um valor inteiro. Verifique e mostre se é 
 *                    divisível por 2 e 3.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc24 {

    static Integer D;

    public static void main(String[] args) {
        ProcedureLer();
        if (D % 2 == 0 && D % 3 == 0) {
            JOptionPane.showMessageDialog(null, "\n" + D + " E divisivel por 2 e por 3");
        } else if (D % 2 == 0) {
            JOptionPane.showMessageDialog(null, "\n" + D + " E divisivel por 2");
        } else if (D % 3 == 0) {
            JOptionPane.showMessageDialog(null, "\n" + D + " E divisivel por 3");
        } else {
            JOptionPane.showMessageDialog(null, "\n" + D + " Nao e divisivel por 2 e nem por 3");
        }
    }

    static void ProcedureLer() {
        D = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero inteiro"));
    }
}
