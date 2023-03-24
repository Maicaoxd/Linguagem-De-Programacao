/*
 *  NOME            : EXERCÍCIO 27
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o número de voltas, a extensão do circuito (em metros)
 *                    e o tempo de duração (minutos). Calcule e mostre a velocidade
 *                    média em km/h.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc27 {

    public static void main(String[] args) {
        int NV;
        double CM, TM, VM;
        NV = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de voltas"));
        CM = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensao do circuito em metros"));
        TM = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duracao em minutos"));
        CM /= 1000;
        TM /= 60;
        CM *= NV;
        VM = (CM / TM);
        System.out.println("A velocidade media em km/h e de " + VM);
    }
}
