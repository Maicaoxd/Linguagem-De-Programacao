/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 26
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 números inteiros. Verifique e mostre se o maior
 *                    número é múltiplo do menor.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc26 {

    static Integer X, Y;

    public static void main(String[] args) {
        ProcedureLer();
        if (X >= Y) {
            if (X % Y == 0) {
                System.out.println(X + " e multiplo de " + Y);
            } else {
                System.out.println(X + " nao e multiplo de " + Y);
            }
        } else {
            if (Y % X == 0) {
                System.out.println(Y + " e multiplo de " + X);
            } else {
                System.out.println(Y + " nao e multiplo de " + X);
            }
        }
    }

    static void ProcedureLer() {
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
    }
}
