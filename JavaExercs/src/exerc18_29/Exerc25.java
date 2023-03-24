/*
 *  NOME            : EXERCÍCIO 25
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a hora de início e de final de um jogo (HH,MM) 
 *                    sabendo que o tempo máximo é de 24 horas e pode começar 
 *                    num dia e terminar noutro.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc25 {

    public static void main(String[] args) {
        int HI, MI, HF, MF, HD, MD;
        do {
            HI = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de inicio do jogo"));
            MI = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de inicio do jogo"));
            if (HI > 24 || MI > 59 || HI < 0 || MI < 0) {
                System.out.println("Erro, hora inicial invalida");
            }
        } while (HI > 24 || MI > 59 || HI < 0 || MI < 0);
        do {
            HF = Integer.parseInt(JOptionPane.showInputDialog("Insira a hora de final do jogo"));
            MF = Integer.parseInt(JOptionPane.showInputDialog("Insira o minuto de final do jogo"));
            if (HF > 24 || MF > 59 || HF < 0 || MF < 0) {
                System.out.println("Erro, hora final invalido");
            }
        } while (HF > 24 || MF > 59 || HF < 0 || MF < 0);
        if (HF >= HI) {
            HD = (HF - HI);
        } else {
            HD = (int) ((HF - HI) + 24);
        }
        if (MF >= MI) {
            MD = (MF - MI);
        } else {
            MD = (int) ((MF - MI) + 60);
            HD--;
        }
        if (HD < 24 && MD >= 0) {
            System.out.println("O tempo de duracao do jogo foi de: " + HD + "h:" + MD + "m");
        } else {
            System.out.println("O jogo durou mais de 24 horas");
        }
    }
}
