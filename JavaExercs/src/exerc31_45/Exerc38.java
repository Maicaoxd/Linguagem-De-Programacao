/*
 *  NOME            : EXERCÍCIO 38
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 100 números inteiros reais. Verifique e mostre o maior 
 *                    e o menos valor. Obs.: somente valores positivos.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc38 {

    public static void main(String[] args) {
        double maior, menor, num, i;
        do {
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
            maior = num;
            menor = num;
        } while (num < 0);
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i < 100; i++) {
            num = Integer.parseInt(JOptionPane.showInputDialog("Insira um numero"));
            if (num < 0) {
                System.out.println("Numero invalido");
                i--;
            } else {
                if (num > maior) {
                    maior = num;
                }
                if (num < menor) {
                    menor = num;
                }
            }
        }
        System.out.println("O maior numero foi: " + maior + " e o menor: " + menor);
    }
}
