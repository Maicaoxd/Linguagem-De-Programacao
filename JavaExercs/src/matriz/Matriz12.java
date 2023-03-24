/*
 *  NOME            : Matriz12
 *  DATA            : 04/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 12. Carregar    códigos    das    peças    em    um    
                          tabuleiro    de    xadrez,    onde:
                          Calcular e mostrar a soma das peças do tabuleiro. 
                          Não pode utilizar estrutura de decisão e Escolha 
                          Casona contagem das peça
 */
package matriz;

import java.util.Random;

public class Matriz12 {

    public static void main(String[] args) {
        int x, y, m[][] = new int[8][8], v[] = new int[7];
        Random random = new Random();
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                m[x][y] = random.nextInt(7) + 1;
            }
        }
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                System.out.print(" " + m[x][y]);
            }
            System.out.println("");
        }
        for (x = 0; x < 8; x++) {
            for (y = 0; y < 8; y++) {
                v[m[x][y] - 1]++;
            }
        }
        System.out.println("Peoes " + v[0]);
        System.out.println("Torrea " + v[1]);
        System.out.println("Bispos " + v[2]);
        System.out.println("Cavalos " + v[3]);
        System.out.println("Rainhas " + v[4]);
        System.out.println("Reis " + v[5]);
        System.out.println("Vazios " + v[6]);
    }
}
