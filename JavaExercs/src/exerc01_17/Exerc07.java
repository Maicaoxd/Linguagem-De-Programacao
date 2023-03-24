/*
 *  NOME            : EXERCÍCIO 7
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba os valores do comprimento, largura e altura 
 *                    de um paralelepípedo. Calcule e mostre seu volume.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc07 {

    public static void main(String[] args) {
        int C, L, A, V;
        C = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento"));
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura"));
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura"));
        V = (C * L * A);
        System.out.println("O valor do volume e de: " + V);
    }
}
