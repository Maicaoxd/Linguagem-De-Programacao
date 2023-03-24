/*
 *  NOME            : EXERCÍCIO 13
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a quantidade de alimento em quilos. Calcule e 
 *                    mostre quantos dias durará esse alimento sabendo que a 
 *                    pessoa consome 50g ao dia.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc13 {

    public static void main(String[] args) {
        int A, D;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alimento em quilos"));
        D = ((A * 1000) / 50);
        System.out.print("Esse alimento durara " + D);
        System.out.println(" dias");
    }
}
