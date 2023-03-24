/*
 *  NOME            : VETOR 03
 *  DATA            : 25/09/2022
 *  PROGRAMADOR     : MAICON
 *  DESCRIÇÃO       : 3. Criar e coletar valores inteiros nos vetores
 *                       VT1[3] e VT2[3]. Concatenar esses valores em
 *                       um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
 *                          VT1 |1|2|3|   VT2 |4|5|6|   VT3 |1|2|3|4|5|6|
 */
package vetor;

import javax.swing.JOptionPane;

public class Vetor03 {

    public static void main(String[] args) {
        int i;
        int vt1[] = new int[3];
        int vt2[] = new int[3];
        int vt3[] = new int[6];
        for (i = 0; i < 3; i++) {
            vt1[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de VT1 " + (i + 1)));
            System.out.print("\n Vet[" + (i + 1) + "] = " + vt1[i]);
        }
        System.out.println("");
        for (i = 0; i < 3; i++) {
            vt2[i] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor de VT2 " + (i + 1)));
            System.out.print("\n Vet[" + (i + 1) + "] = " + vt2[i]);
        }
        System.out.println("");
        for (i = 0; i < 6; i++) {
            if (i < 3) {
                vt3[i] = vt1[i];
            } else {
                vt3[i] = vt2[i - 3];
            }
            System.out.print("\n Vet[" + (i + 1) + "] = " + vt3[i]);
        }
    }
}
