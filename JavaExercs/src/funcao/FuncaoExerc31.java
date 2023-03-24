/*
 *  NOME            : FUNÇÃO EXERCÍCIO 31
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule e mostre o quadrado dos números entre 10 e 150.
 */
package funcao;

public class FuncaoExerc31 {

    public static void main(String[] args) {
        int num;
        num = 10;
        Fquad(num);
    }

    static int Fquad(int n) {
        int quad;
        while (n >= 10 && n <= 150) {
            quad = (n * n);
            System.out.println("O quadrado de " + n + " e: " + quad);
            n++;
        }
        return 0;
    }
}
