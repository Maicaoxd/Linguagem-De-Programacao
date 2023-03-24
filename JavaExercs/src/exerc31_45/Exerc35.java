/*
 *  NOME            : EXERCÍCIO 35
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 2 números inteiros, verifique qual o maior entre eles. 
 *                    Calcule e mostre o resultado da somatória dos números ímpares 
 *                    entre esses valores.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc35 {

    public static void main(String[] args) {
        int X, Y, S;
        S = 0;
        X = Integer.parseInt(JOptionPane.showInputDialog("Insira o primeiro numero"));
        Y = Integer.parseInt(JOptionPane.showInputDialog("Insira o segundo numero"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        if (X > Y) {
            for (Y += 1; Y <= (X - 1); Y++) {
                if (Y % 2 != 0) {
                    S += Y;
                }
            }
            System.out.println("A somatoria dos numeros impares entre X e Y e de: " + S);
        } else if (Y > X) {
            for (X += 1; X <= (Y - 1); X++) {
                if (X % 2 != 0) {
                    S += X;
                }
            }
            System.out.println("A somatoria dos numeros impares entre X e Y e de: " + S);
        } else {
            System.out.println("Numeros inseridos sao iguais");
        }
    }
}
