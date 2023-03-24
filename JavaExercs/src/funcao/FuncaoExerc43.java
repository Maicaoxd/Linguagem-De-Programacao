/*
 *  NOME            : FUNÇÃO EXERCÍCIO 43
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre quantos anos serão necessários para que Ana seja
 *                    maior que Maria sabendo que Ana tem 1,10 m e cresce 3 cm ao ano
 *                    e Maria tem 1,5 m e cresce 2 cm ao ano.
 */
package funcao;

public class FuncaoExerc43 {
        public static void main(String[] args) {
        FAltura();
    }

    static void FAltura() {
        double a, m, i;
        a = 1.10;
        m = 1.50;
        for (i = 0; a < m; i++) {
            a += 0.03;
            m += 0.02;
        }
        System.out.println("Serao necessarios " + i + " anos para Ana passar Maria");
    }
}