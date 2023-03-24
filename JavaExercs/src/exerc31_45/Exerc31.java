/*
 *  NOME            : EXERCÍCIO 31
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre o quadrado dos números entre 10 e 150.
 */
package exerc31_45;

public class Exerc31 {

    public static void main(String[] args) {
        int num, quad;

        System.out.println("*****ESTRUTURA WHILE*****");
        num = 10;
        while (num >= 10 && num <= 150) {
            quad = (num * num);
            System.out.println("O quadrado de " + num + " e: " + quad);
            num++;
        }

        System.out.println("*****ESTRUTURA DO WHILE*****");
        num = 10;
        do {
            quad = (num * num);
            System.out.println("O quadrado de " + num + " e: " + quad);
            num++;
        } while (num >= 10 && num <= 150);

        System.out.println("*****ESTRUTURA FOR*****");
        for (num = 10; num >= 10 && num <= 150; num++) {
            quad = (num * num);
            System.out.println("O quadrado de " + num + " e: " + quad);
        }
    }
}
