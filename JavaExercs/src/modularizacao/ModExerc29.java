/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 29
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba o tipo de investimento (1 = poupança e 2 = renda fixa)
 *                    e o valor do investimento. Calcule e mostre o valor corrigido
 *                    em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%.
 *                    Demais tipos não serão considerados.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc29 {

    static Double VC;

    public static void main(String[] args) {
        ProcedureInvestimento();
        JOptionPane.showMessageDialog(null, "\n O valor corrigido e de " + VC);

    }

    static void ProcedureInvestimento() {
        int T;
        double VI;
        T = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento"));
        VI = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do investimento"));
        switch (T) {
            case 1:
                VC = (VI * 1.03);
                break;
            case 2:
                VC = (VI * 1.05);
                break;
            default:
                System.out.println("Tipo incompativel");
                break;
        }
    }
}
