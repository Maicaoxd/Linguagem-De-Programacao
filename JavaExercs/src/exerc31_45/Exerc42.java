/*
 *  NOME            : EXERCÍCIO 42
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
package exerc31_45;

public class Exerc42 {

    public static void main(String[] args) {
        double i, num = 1, den = 1, som = 0;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 50; i++) {
            som += (num / den);
            num += 1;
            den += 2;
        }
        System.out.println("O valor da serie e de: " + som);
    }
}
