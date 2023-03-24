/*
 *  NOME            : EXERCÍCIO 12
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o ano de nascimento e o ano atual. 
 *                    Calcule e mostre a sua idade e quantos anos terá 
 *                    daqui a 17 anos.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc12 {

    public static void main(String[] args) {
        int N, A, I, F;
        N = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento"));
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual"));
        I = (A - N);
        F = (int) (I + 17);
        System.out.println("Atualmente a idade e de: " + I);
        System.out.println("Daqui a 17 anos a idade sera de: " + F);
    }
}
