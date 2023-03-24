/*
 *  NOME            : Matriz11
 *  DATA            : 04/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 11. Criar   uma   matriz   [8][8]   inteiro   e   o 
                          programa   irá   carregar   segundo:
 */
package matriz;

public class Matriz11 {

    public static void main(String[] args) {
        int x, y, z, m[][] = new int[8][8];
        for (z = 1; z < 5; z++) {
            for (x = z - 1; x < 9 - z; x++) {
                for (y = z - 1; y < 9 - z; y++) {
                    m[x][y] = z;
                }
            }
        }
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                System.out.print(" " + m[x][y]);
            }
            System.out.println("");
        }
    }
}
