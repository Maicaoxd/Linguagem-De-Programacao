/*
 *  NOME            : EXERCÍCIO 23
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 3 valores obrigatoriamente em ordem crescente e um
 *                    4º valor não necessariamente em ordem. Mostre os 4 números 
 *                    em ordem crescente
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc23 {

    public static void main(String[] args) {
        double V1, V2, V3, V4;
        V1 = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor 1"));
        V2 = Double.parseDouble(JOptionPane.showInputDialog("Insria o valor 2"));
        if (V1 < V2) {
            V3 = Double.parseDouble(JOptionPane.showInputDialog("Insria o valor 3"));
            if (V2 < V3) {
                V4 = Double.parseDouble(JOptionPane.showInputDialog("Insria o valor 4"));
                if (V4 >= V3) {
                    System.out.println(+V1 + ", " + V2 + ", " + V3 + ", " + V4);
                } else if (V4 <= V3 && V4 >= V2) {
                    System.out.println(+V1 + ", " + V2 + ", " + V4 + ", " + V3);
                } else if (V4 <= V2 && V4 >= V1) {
                    System.out.println(+V1 + ", " + V4 + ", " + V2 + ", " + V3);
                } else if (V4 <= V1) {
                    System.out.println(+V4 + ", " + V1 + ", " + V2 + ", " + V3);
                }
            } else {
                System.out.println("Valor menor do que o esperado");
            }
        } else {
            System.out.println("Valor menor do que o esperado");
        }
    }
}
