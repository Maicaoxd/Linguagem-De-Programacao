/*
 *  NOME            : EXERCÍCIO 2
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o salário de um funcionário e mostre o novo 
 *                    salário com reajuste de 15%
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc02 {

    public static void main(String[] args) {
        int S, R;
        S = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do salario"));
        R = (int) (S * 1.15);
        System.out.println("O valor do novo salario e de: " + R);
    }
}
