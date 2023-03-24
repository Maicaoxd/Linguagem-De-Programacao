/*
 *  NOME            : EXERCÍCIO 3
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a base e a altura de um triângulo. 
 *                    Calcule e mostre a sua área
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc03 {

    public static void main(String[] args) {
        int B, H, A;
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da base do triangulo"));
        H = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do triangulo"));
        A = (int) ((B * H) / 2);
        System.out.println("O valor da area do triangulo e de: " + A);
    }
}
