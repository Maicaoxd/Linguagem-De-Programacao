/*
 *  NOME            : EXERCÍCIO 41
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Mostre todas as possibilidades de 2 dados de forma que a soma
 *                    tenha como resultado 7.
 */
package exerc31_45;

public class Exerc41 {

    public static void main(String[] args) {
        int d1, d2, i;
        d1 = 1;
        d2 = 6;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 1; i <= 6; i++) {
            if (d1 + d2 == 7) {
                System.out.println(d1 + " + " + d2 + " = 7");
            }
            d1 += 1;
            d2 -= 1;
        }
    }
}
