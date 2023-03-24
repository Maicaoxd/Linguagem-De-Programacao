/*
 *  NOME            : EXERCÍCIO 17
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule a quantidade de litros gastos em uma viagem, 
 *                    sabendo que o automóvel faz 12 km/l. Receber o 
 *                    tempo de percurso e a velocidade média.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc17 {

    public static void main(String[] args) {
        float T, V, L;
        T = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso"));
        V = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade media"));
        L = ((T * V) / 12);
        System.out.println("A quantidade de litros gastos sera de: " + L);
    }
}
