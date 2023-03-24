/*
 *  NOME            : EXERCÍCIO 32
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número inteiro. Calcule e mostre o seu fatorial.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc32 {

    public static void main(String[] args) {
        int num, fat, aux;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero a ser fatorado"));
        aux = num;
        fat = 1;
        System.out.println("*****ESTRUTURA WHILE*****");
        while (num > 1) {
            fat *= num;
            num--;
        }
        System.out.println("O fatorial de " + aux + " e " + fat);

        System.out.println("*****ESTRUTURA DO WHILE*****");
        num = aux;
        fat = 1;
        do {
            fat *= num;
            num--;
        } while (num > 1);
        System.out.println("O fatorial de " + aux + " e " + fat);

        System.out.println("*****ESTRUTURA FOR*****");
        fat = 1;
        for (num = aux; num > 1; num--) {
            fat *= num;
        }
        System.out.println("O fatorial de " + aux + " e " + fat);
    }
}
