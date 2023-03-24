/*
 *  NOME            : FUNÇÃO EXERCÍCIO 39
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
 *                    Casa : 1 2 3 4 ... 64
 *                    Qte  : 1 2 4 8 ... N
 */
package funcao;

public class FuncaoExerc39 {

    public static void main(String[] args) {
        FGrao();
    }

    static void FGrao() {
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
