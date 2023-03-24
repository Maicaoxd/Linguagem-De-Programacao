/*
 *  NOME            : VETOR 02
 *  DATA            : 25/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 2. Criar e coletar um vetor [100] inteiro e exibir:
 *                       a. O maior e o menor valor;
 *                       b. A média dos valores.
 */
package vetor;

import javax.swing.JOptionPane;

public class Vetor02 {

    public static void main(String[] args) {
        int i, maior, menor;
        double media;
        int vetor[] = new int[100];
        vetor[0] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor 1"));
        menor = vetor[0];
        maior = vetor[0];
        media = vetor[0];
        for (i = 1; i < 100; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + (i + 1)));
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
            media += vetor[i];
        }
        media = media / i;
        JOptionPane.showMessageDialog(null, "\n O MAIOR VALOR E DE " + maior + "\n O MENOR VALOR E DE " + menor + "\n A MEDIA E DE " + media);
    }
}
