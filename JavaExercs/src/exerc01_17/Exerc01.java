/*
 *  NOME            : EXERCÍCIO 01
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Coletar o valor do lado de um quadrado, 
 *                    calcular sua área e apresentar o resultado.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc01 {

    public static void main(String[] args) {
        int L, A;
        L = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do lado de um quadrado"));
        A = (L * L);
        System.out.println("A area do quadrado e de: " + A);
    }
}
