/*
 *   NOME            : CAIXA ELETRONICO
 *   DATA            : 25/08/2022
 *   PROGRAMADOR     : MAICON
 */
package caixaeletronico;

import javax.swing.JOptionPane;

public class CaixaEletronico {

    public static void main(String[] args) {
        int v[] = new int[6];
        int opc;
        do {
            opc = Integer.parseInt(JOptionPane.showInputDialog("Insira o codigo da operacao"));
            switch (opc) {
                case 1 ->
                    CarregarNotas(v);
                case 2 ->
                    RetirarNotas(v);
                case 3 ->
                    Estatisticas(v);
                default ->
                    System.out.println("Nao ha operacao " + opc);
            }
        } while (opc != 9);
    }

    public static int[] CarregarNotas(int v[]) {
        int i;
        for (i = 0; i < 6; i++) {
            v[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da quantidade de notas do " + (i + 1) + " o elemento do vetor."));
        }
        return v;
    }

    public static int[] RetirarNotas(int v[]) {
        int saque, n100, n50, n20, n10, n5, n2;
        saque = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor do saque"));
        n100 = v[0];
        n50 = v[1];
        n20 = v[2];
        n10 = v[3];
        n5 = v[4];
        n2 = v[5];
        while (saque >= 100) {
            saque -= 100;
            n100--;
        }
        while (saque >= 50) {
            saque -= 50;
            n50--;
        }
        while (saque >= 20) {
            saque -= 20;
            n20--;
        }
        while (saque >= 10) {
            saque -= 10;
            n10--;
        }
        while (saque >= 5) {
            saque -= 5;
            n5--;
        }
        while (saque >= 2) {
            saque -= 2;
            n2--;
        }
        v[0] = n100;
        v[1] = n50;
        v[2] = n20;
        v[3] = n10;
        v[4] = n5;
        v[5] = n2;
        return v;
    }

    public static int[] Estatisticas(int v[]) {
        for (int i = 0; i < 6; i++) {
            System.out.println("A quantidade de notas restantes é de: " + v[i]);
        }
        return v;
    }
}
