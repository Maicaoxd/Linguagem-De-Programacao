/*
 *  NOME            : FUNÇÃO EXERCÍCIO 41
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Mostre todas as possibilidades de 2 dados de forma que a soma
 *                    tenha como resultado 7.
 */
package funcao;

public class FuncaoExerc41 {

    public static void main(String[] args) {
        FDado();
    }

    static void FDado() {
        int d1, d2, i;
        d1 = 6;
        d2 = 1;
        for (i = 1; i <= 6; i++) {
            if (d1 + d2 == 7) {
                System.out.println(d1 + " + " + d2 + " = 7");
            }
            d1 += 1;
            d2 -= 1;
        }
    }
}
