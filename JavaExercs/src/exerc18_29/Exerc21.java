/*
 *  NOME            : EXERCÍCIO 21
 *  DATA            : 21/08/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba 4 notas bimestrais de um aluno. Calcule e mostre a
 *                    média aritmética. Mostre a mensagem de acordo com a média:
 *               
 *                    a. Se a média for >= 6,0 exibir “APROVADO”;
 *                    b. Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
 *                    c. Se a média for < 3,0 exibir “RETIDO”.
 */
package exerc18_29;

import javax.swing.JOptionPane;

public class Exerc21 {

    public static void main(String[] args) {
        double N1, N2, N3, N4, M;
        N1 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 1"));
        N2 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 2"));
        N3 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 3"));
        N4 = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor da Nota 4"));
        M = (double) ((N1 + N2 + N3 + N4) / 4);
        if (M >= 6.0) {
            System.out.println("APROVADO");
        } else if ((M >= 3.0) && (M <= 6.0)) {
            System.out.println("EXAME");
        } else if (M < 3.0) {
            System.out.println("RETIDO");
        }
    }
}
