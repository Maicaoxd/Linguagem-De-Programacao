/*
 *  NOME            : FUNÇÃO EXERCÍCIO 45
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 */
package funcao;

public class FuncaoExerc45 {

    public static void main(String[] args) {
        FSerie();
    }

    static void FSerie() {
        double i, som = 0, sub = 0, s;
        for (i = 1; i <= 15; i++) {
            if (i % 2 != 0) {
                som += (i / (i * i));
            } else if (i % 2 == 0) {
                sub -= (i / (i * i));
            }
        }
        s = som + sub;
        System.out.println("O resultado da serie e: " + s);
    }
}
