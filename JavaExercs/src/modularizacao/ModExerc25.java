/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 25
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a hora de início e de final de um jogo (HH,MM) 
 *                    sabendo que o tempo máximo é de 24 horas e pode começar 
 *                    num dia e terminar noutro.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc25 {

    static Integer HD, MD;

    public static void main(String[] args) {
        ProcedureCalculoTempo();
        if (HD < 24 && MD >= 0) {
            JOptionPane.showMessageDialog(null,"\n O tempo de duracao do jogo foi de: " + HD + "h:" + MD + "m");
        } else {
            JOptionPane.showMessageDialog(null,"\n O jogo durou mais de 24 horas");
        }
    }

    static void ProcedureCalculoTempo() {
        int HI, MI, HF, MF;
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
    }
}
