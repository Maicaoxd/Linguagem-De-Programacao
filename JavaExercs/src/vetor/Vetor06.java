/*
 *  NOME            : VETOR 05
 *  DATA            : 25/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 6. Criar e coletar em um vetor [20] com números 
 *                       aleatórios. Classificar este vetor em ordem
 *                       crescente e mostre os dados
 */
package vetor;

import javax.swing.JOptionPane;

public class Vetor06 {

    public static void main(String[] args) {
        int vt[] = new int[20];
        int i, j, aux;
        for (i = 0; i < 20; i++) {
            vt[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + i));
        }
        for (i = 0; i < 20; i++) {
            for (j = 0; j <= i; j++) {
                if (vt[j] >= vt[i]) {
                    aux = vt[i];
                    vt[i] = vt[j];
                    vt[j] = aux;
                }
            }
        }
        for (i=0;i<20;i++){
            System.out.print("\n Vet[" + (i) + "] = " + vt[i]);
        }
    }
}
