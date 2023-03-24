/*
 *  NOME            : VETOR 01
 *  DATA            : 25/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 1. Criar e coletar um vetor [50] inteiro. Calcular e exibir:
 *                       a. A média dos valores entre 10 e 200;
 *                       b. A soma dos números ímpares.
 */
package vetor;

import javax.swing.JOptionPane;

public class Vetor01 {

    public static void main(String[] args) {
        int i, m = 0;
        double soma = 0, media = 0;
        int vetor[] = new int[50];
        for (i = 0; i < 50; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + (i + 1)));
            if (vetor[i] > 10 && vetor[i] < 200) {
                media += vetor[i];
                m++;
            }
            if (vetor[i] % 2 != 0) {
                soma += vetor[i];
            }
        }
        media = media / m;
        JOptionPane.showMessageDialog(null, "\n O VALOR DA MEDIA E DE " + media + "\n O VALOR DA SOMA DOS NUMEROS IMPARES E DE " + soma);
    }
}
