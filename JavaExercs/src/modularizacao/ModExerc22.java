/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 22
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 valores inteiros e diferentes. Mostre seus 
 *                    valores em ordem crescente.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc22 {

    static Integer X, Y;

    public static void main(String[] args) {
        ProcedureLer();
        if (X == Y) {
            JOptionPane.showMessageDialog(null, "\n Erro, numeros iguais");
        } else if (X > Y) {
            JOptionPane.showMessageDialog(null, "\n " + Y + ", " + X);
        } else {
            JOptionPane.showMessageDialog(null, "\n" + X + ", " + Y);
        }
    }

    static void ProcedureLer() {
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
    }
}
