/*
 *  NOME            : N1_Exe02
 *  DATA            : 13/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 02. Criar um procedimento que receba um vetor com uma
                          sequência de 7 números (supondo 8110573)

 */
package n1;

import javax.swing.JOptionPane;

public class Exe02 {

    public static void main(String[] args) {
        int v[] = new int[7];
        int i, soma = 0, resto, digito;
        for (i = 0; i < 7; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + (i + 1)));
        }
        for (i = 0; i < 6; i++) {
            v[i] *= 7 - i; //A
            soma += v[i]; //B
        }
        resto = soma % 11; //C
        resto = 11 - resto; //D
        if (resto == 10 || resto == 11) { //E
            digito = 0;
        } else {
            digito = resto;
        }
        if (digito == v[6]) { //F
            System.out.println("Codigo correto");
        } else {
            System.out.println("Codigo incorreto");
        }
    }
}
