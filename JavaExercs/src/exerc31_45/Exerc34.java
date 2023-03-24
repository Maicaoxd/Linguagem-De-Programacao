/*
 *  NOME            : EXERCÍCIO 34
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número. Calcule e mostre os resultados da tabuada 
 *                    desse número.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc34 {

    public static void main(String[] args) {
        int num, i;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero para ser feita a tabuada"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + (num * i));
        }
    }
}
