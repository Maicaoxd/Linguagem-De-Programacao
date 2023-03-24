/*
 *  NOME            : EXERCÍCIO 8
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o valor de um depósito em poupança. Calcule e 
 *                    mostre o valor após 1 mês de aplicação sabendo 
 *                    que rende 1,3% a. m.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc08 {

    public static void main(String[] args) {
        float D, R;
        D = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do deposito"));
        R = (float) (D * 1.03);
        System.out.println("O valor do volume e de: " + R);
    }
}
