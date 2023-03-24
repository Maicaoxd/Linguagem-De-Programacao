/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 19
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 valores reais. Calcule e mostre o maior deles.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc19 {

    static Double Maior;

    public static void main(String[] args) {
        ProcedureMaior();
        JOptionPane.showMessageDialog(null, "\n O maior é o: " + Maior);
    }

    static void ProcedureMaior() {
        double X, Y;
        X = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de X"));
        Y = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de Y"));
        if (X > Y) {
            Maior = X;
        } else {
            Maior = Y;
        }
    }
}
