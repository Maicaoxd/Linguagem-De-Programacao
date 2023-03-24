/*
 *  NOME            : EXERCÍCIO 40
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 números inteiros. Verifique e mostre todos os números primos
 *                    existentes entre eles.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc40 {

    public static void main(String[] args) {
        int x, y, maior = 0, menor = 0, i, c, primo;
        do {
            x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de X"));
            y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de Y"));
            if (x > y) {
                maior = x;
                menor = y;
            } else if (y > x) {
                maior = y;
                menor = x;
            }
        } while (x == y);
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (c = (menor + 1); c <= (maior - 1); c++) {
            primo = 0;
            for (i = 1; i <= c; i++) {
                if (c % i == 0) {
                    primo++;
                }
            }
            if (primo == 2) {
                System.out.print(c + ", ");
            }
        }   
    }
}
