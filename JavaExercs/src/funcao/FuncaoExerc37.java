/*
 *  NOME            : FUNÇÃO EXERCÍCIO 37
 *  DATA            : 24/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : Receba um número inteiro. Calcule e mostre a série de
 *                    Fibonacci até o seu N’nésimo termo.
 */
package funcao;

import javax.swing.JOptionPane;

public class FuncaoExerc37  {
    public static void main(String[] args) {
    	int num;
    	num = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de N"));
    	FFibonacci(num);
    }
    static int FFibonacci(int n) {
    	int X, Y, Z, i;
    	X = -1;
    	Y = 1;
    	for (i=1; i<=n;i++) {
    		Z = X+Y;
    		System.out.print(Z+ ", ");
    		X = Y;
    		Y = Z;
    	}
    	return 1;
    }
}
