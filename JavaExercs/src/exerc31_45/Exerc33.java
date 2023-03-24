/*
 *  NOME            : EXERCÍCIO 33
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3
 *                    + ... + 1/N.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc33 {

    public static void main(String[] args) {
        int num;
        double count, serie;
        serie = 0;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero para calcular a serie"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (count = 1; count <= num; count++) {
            serie = (serie + (1 / count));
        }
        System.out.println("A serie de " + num + " e: " + serie);
    }
}
