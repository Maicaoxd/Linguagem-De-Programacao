/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 18
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 valores inteiros. Calcule e mostre o resultado
 *                    da diferença do maior pelo menos valor.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc18 {

    static Integer Diferenca;

    public static void main(String[] args) {
        ProcedureCalculo();
        JOptionPane.showMessageDialog(null, "\n A diferença entre os números é de: " + Diferenca);
    }

    static void ProcedureCalculo() {
        int X, Y;
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
        if (X > Y) {
            Diferenca = X - Y;
        } else {
            Diferenca = Y - X;
        }
    }
}
