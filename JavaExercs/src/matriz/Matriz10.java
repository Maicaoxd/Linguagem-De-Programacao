/*
 *  NOME            : Matriz10
 *  DATA            : 04/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 10. Criar    uma    matriz    [8][8]    onde    o
                          programa    irá    carregar    segundo:
 */
package matriz;

import java.util.Random;

public class Matriz10 {

    public static void main(String[] args) {
        int x, y, m[][] = new int[2][8], soma = 0;
        Random random = new Random();
        for (x = 0; x < 2; x++) {
            for (y = 0; y < 8; y++) {
                if (x == 0) {
                    m[x][y] = random.nextInt(10) + 1;
                } else {
                    m[x][y] = (int) Math.pow(m[(x - 1)][y], y);
                    soma += m[x][y];
                }
            }
        }

        for (x = 0; x < 2; x++) {
            for (y = 0; y < 8; y++) {
                System.out.print(" " + m[x][y]);
            }
            System.out.println(" ");
        }
        System.out.println("Soma dos valores: " + soma);
    }
}
