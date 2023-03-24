/*
 *  NOME            : EXERCÍCIO 28
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o preço atual e a média mensal de um produto. 
 *                    Calcule e mostre o novo preço sabendo que:
 *                    Venda Mensal     Preço Atual     Preço Novo
 *                     < 500            < 30           + 10%
 *                    >= 500 e < 1000  >= 30 e < 80    + 15%
 *                    >= 1000          >= 80           - 05%
 *                    Obs.: para outras condições, preço novo será igual ao preço atual.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc28 {

    public static void main(String[] args) {
        double PA, MP, NP;
        PA = Double.parseDouble(JOptionPane.showInputDialog("Insira o preco atual de um produto"));
        MP = Double.parseDouble(JOptionPane.showInputDialog("Insira a media mensal de um produto"));
        if (MP < 500 && PA < 30) {
            NP = (PA * 1.10);
        } else if (MP >= 500 && MP < 1000 && PA >= 30 && PA < 80) {
            NP = (PA * 1.15);
        } else if (MP >= 1000 && PA >= 80) {
            NP = (PA * 0.95);
        } else {
            NP = PA;
        }
        System.out.println("O novo preco e de " + NP);
    }
}
