/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 23
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 3 valores obrigatoriamente em ordem crescente e um
 *                    4º valor não necessariamente em ordem. Mostre os 4 números 
 *                    em ordem crescente
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc23 {

    static Double V1, V2, V3, V4;

    public static void main(String[] args) {
        ProcedureLer();
        if (V4 >= V3) {
            JOptionPane.showMessageDialog(null, "\n " + V1 + "\n " + V2 + "\n " + V3 + "\n " + V4);
        } else if (V4 <= V3 && V4 >= V2) {
            JOptionPane.showMessageDialog(null, "\n" + V1 + "\n " + V2 + "\n " + V4 + "\n " + V3);
        } else if (V4 <= V2 && V4 >= V1) {
            JOptionPane.showMessageDialog(null, "\n" + V1 + "\n " + V4 + "\n " + V2 + "\n " + V3);
        } else if (V4 <= V1) {
            JOptionPane.showMessageDialog(null, "\n" + V4 + "\n " + V1 + "\n " + V2 + "\n " + V3);
        }
    }

    static void ProcedureLer() {
        V1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1"));
        V2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 2"));
        if (V1 < V2) {
            V3 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 3"));
            if (V2 < V3) {
                V4 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 4"));
            } else {
                JOptionPane.showMessageDialog(null, "\n Valor menor do que o esperado");
            }
        } else {
            JOptionPane.showMessageDialog(null, "\n Valor menor do que o esperado");
        }
    }
}
