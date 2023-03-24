/*
 *  NOME            : EXERCÍCIO 36
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número N. Calcule e mostre a série 1 + 1/1! + 
 *                    1/2! + ... + 1/N!
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc36 {

    public static void main(String[] args) {
        int num;
        double i, fat, s;
        s = 1;
        fat = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= num; i++) {
            fat *= i;
            s += (1 / fat);
        }
        System.out.println("A somatoria e de: " + s);
    }
}
