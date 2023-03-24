/*
 *  NOME            : FUN��O EXERC�CIO 35
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRI��O       : Receba 2 numeros inteiros, verifique qual o maior entre eles. 
 *                    Calcule e mostre o resultado da somat�ria dos numeros impares 
 *                    entre esses valores.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc35 {

    public static void main(String[] args) {
        int x, y;
        x = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de y"));
        JOptionPane.showMessageDialog(null, "\n A SOMA E DE " + FSoma(x, y));
    }

    static int FSoma(int x, int y) {
        int maior, menor, soma = 0, i;
        if (x > y) {
            maior = x;
            menor = y;
        } else {
            maior = y;
            menor = x;
        }
        for (i = (menor + 1); i <= (maior - 1); i++) {
            if (i % 2 != 0) {
                soma += i;
            }
        }
        return soma;
    }
}
