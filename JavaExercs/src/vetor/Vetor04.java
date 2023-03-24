/*
 *  NOME            : VETOR 04
 *  DATA            : 25/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 4. Criar e coletar em um vetor [30] real e calcular e exibir:
 *                       a. A média do grupo;
 *                       b. A quantidade de notas acima do grupo;
 *                       c. As posições dos valores abaixo da média do grupo.
 */
package vetor;

import javax.swing.JOptionPane;

public class Vetor04 {

    public static void main(String[] args) {
        int vt[] = new int[30];
        int i, q = 0;
        double media = 0;
        for (i = 0; i < 30; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + i));
            media += vt[i];
        }
        media = media / i;
        System.out.println("O VALOR DA MEDIA E DE " + media);
        for (i = 0; i < 30; i++) {
            if (vt[i] > media) {
                q++;
            } else if (vt[i] < media) {
                System.out.println("O VETOR " + i + " ESTA ABAIXO DA MEDIA");
            }
        }
        System.out.println("A quantidade de notas acima do grupo " + q);
    }
}
