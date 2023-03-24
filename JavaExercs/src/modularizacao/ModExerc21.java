/*
 *  NOME            : MODULARIZAÇÃO EXERCÍCIO 21
 *  DATA            : 11/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 4 notas bimestrais de um aluno. Calcule e mostre a
 *                    média aritmética. Mostre a mensagem de acordo com a média:
 *               
 *                    a. Se a média for >= 6,0 exibir “APROVADO”;
 *                    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 *                    c. Se a média for < 3,0 exibir “RETIDO”.
 */
package modularizacao;

import javax.swing.JOptionPane;

public class ModExerc21 {

    static Double Media;

    public static void main(String[] args) {
        ProcedureNotas();
        if (Media >= 6.0) {
            JOptionPane.showMessageDialog(null,"\n APROVADO");
        } else if ((Media >= 3.0) && (Media <= 6.0)) {
            JOptionPane.showMessageDialog(null,"\n EXAME");
        } else if (Media < 3.0) {
            JOptionPane.showMessageDialog(null,"\n RETIDO");
        }
    }

    static void ProcedureNotas() {
        double N1, N2, N3, N4;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 1"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 2"));
        N3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 3"));
        N4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 4"));
        Media = (double) ((N1 + N2 + N3 + N4) / 4);
    }
}
