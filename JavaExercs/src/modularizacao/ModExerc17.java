/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 17
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Calcule a quantidade de litros gastos em uma viagem, 
 *                    sabendo que o automóvel faz 12 km/l. Receber o 
 *                    tempo de percurso e a velocidade média.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc17 {

    static Double LitrosGastos;

    public static void main(String[] args) {
        ProcedureGasolina();
        JOptionPane.showMessageDialog(null, "\n A quantidade de Litros Gastos foi de: " + LitrosGastos);
    }

    static void ProcedureGasolina() {
        double T, V;
        T = Integer.parseInt(JOptionPane.showInputDialog("Digite o tempo de percurso"));
        V = Integer.parseInt(JOptionPane.showInputDialog("Digite a velocidade media"));
        LitrosGastos = ((T * V) / 12);
    }
}
