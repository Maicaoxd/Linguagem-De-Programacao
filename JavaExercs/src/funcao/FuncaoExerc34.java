/*
 *  NOME            : FUNÇÃO EXERCÍCIO 34
 *  DATA            : 14/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número. Calcule e mostre os resultados da tabuada 
 *                    desse número.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc34 {

    public static void main(String[] args) {
        int num;
        num = Integer.parseInt(JOptionPane.showInputDialog("INSIRA UM NUMERO"));
        Fquad(num);
    }

    static int Fquad(int n) {
        int i;
        for (i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
        return 0;
    }
}
