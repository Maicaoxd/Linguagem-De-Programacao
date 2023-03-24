/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 16
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a quantidade de horas trabalhadas, o valor 
 *                    por hora, o percentual de desconto e o número de
 *                    descendentes. Calcule o salário que serão as horas 
 *                    trabalhadas x o valor por hora. Calcule o salário 
 *                    líquido (= Salário Bruto – desconto). A cada dependente 
 *                    será acrescido R$ 100 no Salário Líquido. Exiba o 
 *                    salário a receber.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc16 {

    static Double SalarioLiquido;

    public static void main(String[] args) {
        ProcedureCalculo();
        JOptionPane.showMessageDialog(null, "\n Salario Liquido = " + SalarioLiquido);
    }

    static void ProcedureCalculo() {
        float Ht, Vh, Sb;
        int Pd, Nd;
        Ht = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        Vh = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora"));
        Pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto"));
        Nd = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de descendentes"));
        Sb = (float) (Ht * Vh);
        SalarioLiquido = (double) (Sb - (Sb * (Pd / 100)));
        SalarioLiquido += (Nd * 100);
    }
}
