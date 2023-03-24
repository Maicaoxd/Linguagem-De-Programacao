/*
 *  NOME            : Matriz08
 *  DATA            : 04/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 8. Criar  e  carregar  uma  matriz  [4][3]  inteiro  com
                         quantidade  de  produtos vendidos em 4 semanas. 
                         Calcular e exibir:
                         a. A quantidade de cada produto vendido no mês;
                         b. A quantidade de produtos vendidos por semana;
                         c. O total de produtos vendidos no mês.
 */
package matriz;

import javax.swing.JOptionPane;

public class Matriz08 {

    public static void main(String[] args) {
        int M[][] = new int[4][3];
        int x, y, quant_pro, quant_sem, total = 0;
        for (x = 0; x < 4; x++) {
            quant_sem = 0;
            for (y = 0; y < 3; y++) {
                M[x][y] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do produto "));
                total += M[x][y];
                quant_sem += M[x][y];
            }
            System.out.println("A quantidade de produtos vendidos na semana" + x + ": " + quant_sem);
        }
        for (y = 0; y < 3; y++) {
            quant_pro = 0;
            for (x = 0; x < 4; x++) {
                quant_pro += M[x][y];
            }
            System.out.println("A quantidade de produto " + y + " vendidos no mes: " + quant_pro);
        }
        System.out.println("O total de produtos vendidos no mes: "+total);
    }
}
