/*
 *  NOME            : EXERCÍCIO 43
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre quantos anos serão necessários para que Ana seja
 *                    maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano
 *                    e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
package exerc31_45;

public class Exerc43 {

    public static void main(String[] args) {
        double a, m, i;
        a = 1.10;
        m = 1.50;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (i = 0; a < m; i++) {
            a += 0.03;
            m += 0.02;
        }
        System.out.println("Serao necessarios " + i + " anos para Ana passar Maria");
    }
}
