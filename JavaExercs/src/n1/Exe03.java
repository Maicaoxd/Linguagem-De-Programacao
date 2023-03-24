/*
 *  NOME            : N1_Exe02
 *  DATA            : 13/10/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 03. Criar um menu de opções onde terá a chamada das
                          questões 1 e 2assim como suas respectivas variáveis
                          de manipulação para envio e/ou retorno.

 */
package n1;

import javax.swing.JOptionPane;

public class Exe03 {

    public static void main(String[] args) {
        int opc = 0;
        double num = 0;
        int v[] = new int[7], i;
        while (opc != 9) {
            opc = Integer.parseInt(JOptionPane.showInputDialog(" 1 - Questão 1 \n 2 - Questão 2 \n 9 - Fim"));
            switch (opc) {
                case 1:
                    while (num <= 2 || num > 10) {
                        System.out.println("Valor Invalido ");
                        num = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor de n "));
                    }
                    JOptionPane.showMessageDialog(null, "\n Valor da serie: " + FSerie(num));
                    num = 0;
                    break;
                case 2:
                    for (i = 0; i < 7; i++) {
                        v[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do vetor " + (i + 1)));
                    }
                    vetor(v);
                    break;
            }
        }
    }

    static double FSerie(double n) {
        double i, serie = 0;
        for (i = 1; i <= n; i++) {
            if (i % 2 != 0) {
                serie += (FFat(i) / (n - (i - 1)));
            } else {
                serie -= (FFat(i) / (n - (i - 1)));
            }
        }
        return serie;
    }

    static double FFat(double n) {
        double i, fat = 1;
        for (i = 1; i <= n; i++) {
            fat *= i;
        }
        return fat;
    }

    static void vetor(int v[]) {
        int i, soma = 0, resto, digito;
        for (i = 0; i < 6; i++) {
            v[i] *= 7 - i; //A
            soma += v[i]; //B
        }
        resto = soma % 11; //C
        resto = 11 - resto; //D
        if (resto == 10 || resto == 11) { //E
            digito = 0;
        } else {
            digito = resto;
        }
        if (digito == v[6]) { //F
            System.out.println("Codigo correto");
        } else {
            System.out.println("Codigo incorreto");
        }
    }
}
