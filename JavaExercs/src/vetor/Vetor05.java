/*
 *  NOME            : VETOR 05
 *  DATA            : 25/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 5. Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo:
                         10
                         ∑ (A[i] – A[21–i])
                         i = 1
 */
package vetor;

import javax.swing.JOptionPane;

public class Vetor05 {

    public static void main(String[] args) {
        int vt[] = new int[20];
        int soma, i;
        for (i = 0; i < 20; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + i));
        }
        for (i = 1; i <= 10; i++) {
            soma = (vt[i-1]) - (vt[10 - i]);
            System.out.println("O VALOR DA SOMA E DE " + soma);
        }
        

    }
}
