/*
 *  NOME            : Matriz09
 *  DATA            : 04/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 9. Criar  e  carregar  uma  matriz  [4][4]  com  valores
                         aleatórios,  sendo  que  a diagonal   principal   
                         terá seus dados carregados no programa segundo:
 */
package matriz;

import java.util.Random;

public class Matriz09 {

    public static void main(String[] args) {
        Random random = new Random();
        int x, y, m[][] = new int[4][4];
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                if (x == y) {
                    m[x][y] = (int) Math.pow(4, x);
                } else {
                    m[x][y] = random.nextInt(100);
                }
            }
        }
        for (x = 0; x < 4; x++) {
            for (y = 0; y < 4; y++) {
                System.out.print(" " + m[x][y]);
            }
            System.out.println("");
        }
    }
}
