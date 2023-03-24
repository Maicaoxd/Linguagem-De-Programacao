/*
 *  NOME            : FUNÇÃO EXERCÍCIO 42
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99
 */
package funcao;

public class FuncaoExerc42 {

    public static void main(String[] args) {
        FSerie();
    }

    static void FSerie() {
        double i, num = 1, den = 1, som = 0;
        for (i = 1; i <= 50; i++) {
            som += (num / den);
            num += 1;
            den += 2;
        }
        System.out.println("O valor da serie e de: " + som);
    }
}
