/*
OBJETIVO: EXEMPLO DE FUNÇÃO UTILIZANDO O MÓDULO FATORIAL

 */
package funcao;

import javax.swing.JOptionPane;

public class ExemploFuncao {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite Número"));
        JOptionPane.showMessageDialog(null, "O FATORIAL É: " + Ffat(num));
    }

    static int Ffat(int n) {
        int cta, f;
        f = 1;
        for (cta = 1; cta <= n; cta++) {
            f = (f * cta);
        }
        return f;
    }
}
