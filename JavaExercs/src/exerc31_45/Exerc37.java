/*
 *  NOME            : EXERCÍCIO 37
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número inteiro. Calcule e mostre a série de
 *                    Fibonacci até o seu N’nésimo termo.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc37 {

    public static void main(String[] args) {
        int num, x, y, z, i;
        x = -1;
        y = 1;
        num = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de numeros na sequencia de Fibonacci"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= num; i++) {
            z = x + y;
            System.out.print(z + ", ");
            x = y;
            y = z;
        }
    }
}
