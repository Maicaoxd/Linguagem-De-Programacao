/*
 *  NOME            : EXERCÍCIO 39
 *  DATA            : 28/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 *                    Casa : 1 2 3 4 ... 64
 *                    Qte  : 1 2 4 8 ... N
 */
package exerc31_45;

public class Exerc39 {

    public static void main(String[] args) {
        double casa, qte = 1;
        System.out.println("*****ESTRUTURA WHILE*****");
        System.out.println("*****ESTRUTURA DO WHILE*****");
        System.out.println("*****ESTRUTURA FOR*****");
        for (casa = 1; casa <= 64; casa++) {
            System.out.println("Casa: " + casa + " Quantidade: " + qte);
            qte *= 2;
        }
    }
}
