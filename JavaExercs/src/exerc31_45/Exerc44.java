/*
 *  NOME            : EXERCÍCIO 44
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o número da base e do expoente. Calcule e mostre o valor da
 *                    potência.
 */
package exerc31_45;

import javax.swing.JOptionPane;

public class Exerc44 {

    public static void main(String[] args) {
        int b, e, p = 1, i;
        b = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da base"));
        e = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do expoente"));
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= e; i++) {
            p *= b;
        }
        System.out.println(b + " ^ " + e + " = " + p);
    }
}
