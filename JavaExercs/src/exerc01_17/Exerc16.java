/*
 *  NOME            : EXERCÍCIO 16
 *  DATA            : 14/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba a quantidade de horas trabalhadas, o valor 
 *                    por hora, o percentual de desconto e o número de
 *                    descendentes. Calcule o salário que serão as horas 
 *                    trabalhadas x o valor por hora. Calcule o salário 
 *                    líquido (= Salário Bruto – desconto). A cada dependente 
 *                    será acrescido R$ 100 no Salário Líquido. Exiba o 
 *                    salário a receber.
 */
package exerc01_17;

import javax.swing.JOptionPane;

public class Exerc16 {

    public static void main(String[] args) {
        float Ht, Vh, Sb, Sl;
        int Pd, Nd;
        Ht = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        Vh = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor por hora"));
        Pd = Integer.parseInt(JOptionPane.showInputDialog("Digite o percentual de desconto"));
        Nd = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de descendentes"));
        Sb = (float) (Ht * Vh);
        Sl = (float) (Sb - (Sb * (Pd/100)));
        Sl += (Nd * 100);
        System.out.println("O valor do salario liquido e de: " + Sl);
    }
}
