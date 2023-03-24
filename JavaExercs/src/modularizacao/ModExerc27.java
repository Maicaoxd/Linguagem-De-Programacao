/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 27
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o número de voltas, a extensão do circuito (em metros)
 *                    e o tempo de duração (minutos). Calcule e mostre a velocidade
 *                    média em km/h.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc27 {

    static Double VM;

    public static void main(String[] args) {
        ProcedureCalculo();
        JOptionPane.showMessageDialog(null, "\n A velocidade media em km/h e de " + VM);
    }

    static void ProcedureCalculo() {
        int NV;
        double CM, TM;
        NV = Integer.parseInt(JOptionPane.showInputDialog("Insira o numero de voltas"));
        CM = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensao do circuito em metros"));
        TM = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duracao em minutos"));
        CM /= 1000;
        TM /= 60;
        CM *= NV;
        VM = (CM / TM);
    }
}
